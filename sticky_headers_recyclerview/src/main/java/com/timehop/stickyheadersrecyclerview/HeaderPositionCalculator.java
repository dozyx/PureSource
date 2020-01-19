package com.timehop.stickyheadersrecyclerview;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.timehop.stickyheadersrecyclerview.caching.HeaderProvider;
import com.timehop.stickyheadersrecyclerview.calculation.DimensionCalculator;
import com.timehop.stickyheadersrecyclerview.util.OrientationProvider;

/**
 * Calculates the position and location of header views
 */
public class HeaderPositionCalculator {

  private final StickyRecyclerHeadersAdapter mAdapter;
  private final OrientationProvider mOrientationProvider;
  private final HeaderProvider mHeaderProvider;
  private final DimensionCalculator mDimensionCalculator;

  /**
   * The following fields are used as buffers for internal calculations. Their sole purpose is to avoid
   * allocating new Rect every time we need one.
   */
  private final Rect mTempRect1 = new Rect();
  private final Rect mTempRect2 = new Rect();

  public HeaderPositionCalculator(StickyRecyclerHeadersAdapter adapter, HeaderProvider headerProvider,
      OrientationProvider orientationProvider, DimensionCalculator dimensionCalculator) {
    mAdapter = adapter;
    mHeaderProvider = headerProvider;
    mOrientationProvider = orientationProvider;
    mDimensionCalculator = dimensionCalculator;
  }

  /**
   * 判断这个位置是否需要有粘性的 header
   * 条件：recyclerView 的第一个 view；有关联的 id
   *
   * Determines if a view should have a sticky header.
   * The view has a sticky header if:
   * 1. It is the first element in the recycler view
   * 2. It has a valid ID associated to its position
   *
   * @param itemView given by the RecyclerView
   * @param orientation of the Recyclerview
   * @param position of the list item in question
   * @return True if the view should have a sticky header
   */
  public boolean hasStickyHeader(View itemView, int orientation, int position) {
    int offset, margin;
    // itemView 是 RecyclerView 里的 view
    mDimensionCalculator.initMargins(mTempRect1, itemView);
    if (orientation == LinearLayout.VERTICAL) {
      offset = itemView.getTop();// getTop() 得到的是相对于 parent 的位置
      margin = mTempRect1.top;
    } else {
      offset = itemView.getLeft();
      margin = mTempRect1.left;
    }
    // 判断条件：这个 item 有关联的 header，并且 offset <= margin
    // offset <= margin 表示这个 item 部分被遮挡
    return offset <= margin && mAdapter.getHeaderId(position) >= 0;
  }

  /**
   * 判断这个位置的 item 是否需要有 header
   *
   * Determines if an item in the list should have a header that is different than the item in the
   * list that immediately precedes it. Items with no headers will always return false.
   *
   * @param position of the list item in questions
   * @param isReverseLayout TRUE if layout manager has flag isReverseLayout
   * @return true if this item has a different header than the previous item in the list
   */
  public boolean hasNewHeader(int position, boolean isReverseLayout) {
    if (indexOutOfBounds(position)) {
      return false;
    }

    long headerId = mAdapter.getHeaderId(position);

    if (headerId < 0) {
      // 没有关联的 headerId 将直接返回
      return false;
    }

    long nextItemHeaderId = -1;
    // nextItemPosition 这个命名有点坑，得到的是前一个 item 的位置
    int nextItemPosition = position + (isReverseLayout? 1: -1);
    if (!indexOutOfBounds(nextItemPosition)){
      nextItemHeaderId = mAdapter.getHeaderId(nextItemPosition);
    }
    int firstItemPosition = isReverseLayout? mAdapter.getItemCount()-1 : 0;

    // position 为第一个位置或者 headerId 与前一个不同时，需要创建新的 header
    return position == firstItemPosition || headerId != nextItemHeaderId;
  }

  private boolean indexOutOfBounds(int position) {
    return position < 0 || position >= mAdapter.getItemCount();
  }

  public void initHeaderBounds(Rect bounds, RecyclerView recyclerView, View header, View firstView, boolean firstHeader) {
    // firstView：itemView
    // firstHeader：是否有粘性 header
    int orientation = mOrientationProvider.getOrientation(recyclerView);
    // 初始化 header 绘制区域，保存在 bounds 中
    initDefaultHeaderOffset(bounds, recyclerView, header, firstView, orientation);

    if (firstHeader && isStickyHeaderBeingPushedOffscreen(recyclerView, header)) {
      // 对于粘性 header 即第一个位置的 header 需要特殊处理
      // 处理粘性 header 移出屏幕
      View viewAfterNextHeader = getFirstViewUnobscuredByHeader(recyclerView, header);
      int firstViewUnderHeaderPosition = recyclerView.getChildAdapterPosition(viewAfterNextHeader);
      View secondHeader = mHeaderProvider.getHeader(recyclerView, firstViewUnderHeaderPosition);
      translateHeaderWithNextHeader(recyclerView, mOrientationProvider.getOrientation(recyclerView), bounds,
          header, viewAfterNextHeader, secondHeader);
    }
  }

  private void initDefaultHeaderOffset(Rect headerMargins, RecyclerView recyclerView, View header, View firstView, int orientation) {
    // firstView：itemView
    int translationX, translationY;
    mDimensionCalculator.initMargins(mTempRect1, header);

    ViewGroup.LayoutParams layoutParams = firstView.getLayoutParams();
    int leftMargin = 0;
    int topMargin = 0;
    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
      leftMargin = marginLayoutParams.leftMargin;
      topMargin = marginLayoutParams.topMargin;
    }

    if (orientation == LinearLayoutManager.VERTICAL) {
      translationX = firstView.getLeft() - leftMargin + mTempRect1.left;
      translationY = Math.max(
          firstView.getTop() - topMargin - header.getHeight() - mTempRect1.bottom,
          getListTop(recyclerView) + mTempRect1.top);
    } else {
      translationY = firstView.getTop() - topMargin + mTempRect1.top;
      translationX = Math.max(
          firstView.getLeft() - leftMargin - header.getWidth() - mTempRect1.right,
          getListLeft(recyclerView) + mTempRect1.left);
    }

    headerMargins.set(translationX, translationY, translationX + header.getWidth(),
            translationY + header.getHeight());
  }

  /**
   * 判断粘性 header 是否在移出屏幕
   */
  private boolean isStickyHeaderBeingPushedOffscreen(RecyclerView recyclerView, View stickyHeader) {
    View viewAfterHeader = getFirstViewUnobscuredByHeader(recyclerView, stickyHeader);
    int firstViewUnderHeaderPosition = recyclerView.getChildAdapterPosition(viewAfterHeader);
    if (firstViewUnderHeaderPosition == RecyclerView.NO_POSITION) {
        return false;
    }

    boolean isReverseLayout = mOrientationProvider.isReverseLayout(recyclerView);
    if (firstViewUnderHeaderPosition > 0 && hasNewHeader(firstViewUnderHeaderPosition, isReverseLayout)) {
      View nextHeader = mHeaderProvider.getHeader(recyclerView, firstViewUnderHeaderPosition);
      mDimensionCalculator.initMargins(mTempRect1, nextHeader);
      mDimensionCalculator.initMargins(mTempRect2, stickyHeader);

      if (mOrientationProvider.getOrientation(recyclerView) == LinearLayoutManager.VERTICAL) {
        int topOfNextHeader = viewAfterHeader.getTop() - mTempRect1.bottom - nextHeader.getHeight() - mTempRect1.top;
        int bottomOfThisHeader = recyclerView.getPaddingTop() + stickyHeader.getBottom() + mTempRect2.top + mTempRect2.bottom;
        if (topOfNextHeader < bottomOfThisHeader) {
          return true;
        }
      } else {
        int leftOfNextHeader = viewAfterHeader.getLeft() - mTempRect1.right - nextHeader.getWidth() - mTempRect1.left;
        int rightOfThisHeader = recyclerView.getPaddingLeft() + stickyHeader.getRight() + mTempRect2.left + mTempRect2.right;
        if (leftOfNextHeader < rightOfThisHeader) {
          return true;
        }
      }
    }

    return false;
  }

  private void translateHeaderWithNextHeader(RecyclerView recyclerView, int orientation, Rect translation,
    View currentHeader, View viewAfterNextHeader, View nextHeader) {
    mDimensionCalculator.initMargins(mTempRect1, nextHeader);
    mDimensionCalculator.initMargins(mTempRect2, currentHeader);
    if (orientation == LinearLayoutManager.VERTICAL) {
      int topOfStickyHeader = getListTop(recyclerView) + mTempRect2.top + mTempRect2.bottom;
      int shiftFromNextHeader = viewAfterNextHeader.getTop() - nextHeader.getHeight() - mTempRect1.bottom - mTempRect1.top - currentHeader.getHeight() - topOfStickyHeader;
      if (shiftFromNextHeader < topOfStickyHeader) {
        translation.top += shiftFromNextHeader;
      }
    } else {
      int leftOfStickyHeader = getListLeft(recyclerView) + mTempRect2.left + mTempRect2.right;
      int shiftFromNextHeader = viewAfterNextHeader.getLeft() - nextHeader.getWidth() - mTempRect1.right - mTempRect1.left - currentHeader.getWidth() - leftOfStickyHeader;
      if (shiftFromNextHeader < leftOfStickyHeader) {
        translation.left += shiftFromNextHeader;
      }
    }
  }

  /**
   * 返回第一个没有被 header 遮挡的 item
   * Returns the first item currently in the RecyclerView that is not obscured by a header.
   *
   * @param parent Recyclerview containing all the list items
   * @return first item that is fully beneath a header
   */
  private View getFirstViewUnobscuredByHeader(RecyclerView parent, View firstHeader) {
    boolean isReverseLayout = mOrientationProvider.isReverseLayout(parent);
    int step = isReverseLayout? -1 : 1;
    int from = isReverseLayout? parent.getChildCount()-1 : 0;
    for (int i = from; i >= 0 && i <= parent.getChildCount() - 1; i += step) {
      View child = parent.getChildAt(i);
      if (!itemIsObscuredByHeader(parent, child, firstHeader, mOrientationProvider.getOrientation(parent))) {
        return child;
      }
    }
    return null;
  }

  /**
   * 判断一个 item 是否被 header 遮挡
   *
   * Determines if an item is obscured by a header
   *
   *
   * @param parent
   * @param item        to determine if obscured by header
   * @param header      that might be obscuring the item
   * @param orientation of the {@link RecyclerView}
   * @return true if the item view is obscured by the header view
   */
  private boolean itemIsObscuredByHeader(RecyclerView parent, View item, View header, int orientation) {
    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) item.getLayoutParams();
    mDimensionCalculator.initMargins(mTempRect1, header);

    int adapterPosition = parent.getChildAdapterPosition(item);
    if (adapterPosition == RecyclerView.NO_POSITION || mHeaderProvider.getHeader(parent, adapterPosition) != header) {
      // Resolves https://github.com/timehop/sticky-headers-recyclerview/issues/36
      // Handles an edge case where a trailing header is smaller than the current sticky header.
      return false;
    }

    if (orientation == LinearLayoutManager.VERTICAL) {
      int itemTop = item.getTop() - layoutParams.topMargin;
      int headerBottom = getListTop(parent) + header.getBottom() + mTempRect1.bottom + mTempRect1.top;
      if (itemTop >= headerBottom) {
        return false;
      }
    } else {
      int itemLeft = item.getLeft() - layoutParams.leftMargin;
      int headerRight = getListLeft(parent) + header.getRight() + mTempRect1.right + mTempRect1.left;
      if (itemLeft >= headerRight) {
        return false;
      }
    }

    return true;
  }

  private int getListTop(RecyclerView view) {
    if (view.getLayoutManager().getClipToPadding()) {
      return view.getPaddingTop();
    } else {
      return 0;
    }
  }

  private int getListLeft(RecyclerView view) {
    if (view.getLayoutManager().getClipToPadding()) {
      return view.getPaddingLeft();
    } else {
      return 0;
    }
  }
}
