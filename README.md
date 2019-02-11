# StatusBarUtils

这是一个状态栏适配操作库

运行效果如下图：

左边是安卓9.0的系统，右边是4.4的系统

![](http://bmob-cdn-20165.b0.upaiyun.com/2019/02/11/47f1449640095072807f12b161c7762c.png)


1. 添加依赖

- gradle配置

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}


dependencies {
    implementation 'com.github.yeaper:StatusBarUtils:1.0.0'
}
```

- Maven配置

```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>


<dependency>
    <groupId>com.github.yeaper</groupId>
    <artifactId>StatusBarUtils</artifactId>
    <version>1.0.0</version>
</dependency>
```

2. 使用

java代码中，在setContentView方法调用结束后使用，如下：

```java
    //沉浸式、透明、白色图标风格的状态栏
    StatusBarUtils.setUpStatusBar(this, false, true, false);
    //沉浸式、透明、黑色图标风格的状态栏
    StatusBarUtils.setUpStatusBar(this, false, true, true);
    //顶部预留padding为状态栏高度、透明、白色图标风格的状态栏
    StatusBarUtils.setUpStatusBar(this, true, true, false);
```
