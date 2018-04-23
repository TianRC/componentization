
# componentization
android 组件化demo。网上有很多博客，可以找个详细的看看，以下内容作为自己日后复习标题。

   * 在gradle.properties添加 isDebug=false  目的：进行单元测试切换
     
   * 在根目录下的build.gradle下添加 ext 将依赖提出来，这一步是必须的，但是这样便于管理，减少不必要的代码。
   
   * 在非主Module下的build.gradle 添加插件判断
   ```gradle   
   if (isDebug.toBoolean()) {
       apply plugin: 'com.android.application'
   } else {
       apply plugin: 'com.android.library'
   }
   ```
   
   * 在非主Module的build.gradle下添加判断，因为作为一个library存在情况下是不需要applicationId
   ```groovy
        if (isDebug.toBoolean()) {
            applicationId "com.trc.user"
        }
   ```
   * 为了解耦，使用了阿里的ARouter进行跳转。
   

