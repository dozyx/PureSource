> 用于分析源码

### 已导入源码

* RecyclerView 1.0.0

### 源码导入

* 新建 module，删除不需要的文件（也可以将已有 module 拷贝删除源码，这样就可以避免删除新建 module 多余文件）
* 在 `.gradle`  文件找到要分析源码的 aar 文件和 source 的 jar 文件，解压 aar 得到资源文件，解压 jar 得到源码文件，jar 解压目录修改为 java，将 java 目录拷贝到 aar 解压目录中。
* 将整个目录放到 module 的 main 目录



如果该库依赖了其他库，可以在 https://mvnrepository.com/ 上找到，然后添加到 build.gradle 文件中。