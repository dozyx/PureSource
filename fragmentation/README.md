### SupportFragment#startForResult(...) 分析
SupportFragment#startForResult(...)    
SupportFragmentDelegate#startForResult(...)    
TransactionDelegate#doDispatchStartTransaction(...)   
TransactionDelegate#saveRequestCode(...)将 requestCode 信息保存到 ResultRecord，并存储到启动 fragment 的 arguments里    

result 回调：
SupportFragment#onDestroy()    
TransactionDelegate#handleResultRecord(...)    
ISupportFragment#onFragmentResult(...)    

