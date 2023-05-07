# Background-Image-Plus-Bing

1. 使用 idea 社区版新建一个 idea plugin 工程
2. 在工程下新建一个 lib 文件夹
3. 在 https://plugins.jetbrains.com/plugin/8502-background-image-plus/versions 下载最新的 jar 包，放入 lib 文件夹中
4. 在 idea 中将这个 jar 包添加为工程依赖
5. git clone https://github.com/lachlankrautz/backgroundImagePlus 代码，将要修改的代码放入工程的对应的目录中
6. 编译要修改的代码
7. 用编译好的文件，替换原 jar 包中的文件（有新加文件的话，也加入）
8. 使用新 jar 包