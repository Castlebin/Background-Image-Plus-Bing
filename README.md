# Background-Image-Plus-Bing

1. 使用 idea 社区版新建一个 idea plugin 工程
2. 在工程下新建一个 lib 文件夹
3. 在 https://plugins.jetbrains.com/plugin/8502-background-image-plus/versions 下载最新的 jar 包，放入 lib 文件夹中
4. 在 idea 中将这个 jar 包添加为工程依赖
5. git clone https://github.com/lachlankrautz/backgroundImagePlus 代码，将要修改的代码放入工程的对应的目录中
6. 编译要修改的代码
7. 用编译好的文件，替换原 jar 包中的文件（有新加文件的话，也加入）
8. 使用新 jar 包


## 当前修改
1. 添加了下载 bing 背景图片的代码 BingImageDownloadHelper.java、BingImage.java 和下载测试代码 BingImageTest.java  
2. 修改了 RandomBackgroundTask.java , 加入下载代码的调用
3. 修改了 plugin.xml 中的插件注册信息
4. 修改了 NotificationCenter.java ，改为 public 的

所以，需要将 BingImageDownloadHelper.class、BingImage.class 加入原 jar 包中，并且替换掉原 jar 包中的 RandomBackgroundTask.class 、 plugin.xml 、NotificationCenter.class

发现原包中的 com.intellij.uiDesigner 好像也没有用，也删了，能正常工作

把修改后的包备个份, 放到 release 目录下
当前：