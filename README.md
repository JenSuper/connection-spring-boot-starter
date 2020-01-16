### 自定义starter
1. config -> ConnectionProperties : 配置文件信息
2. service -> ConnectionTemplate : 业务处理
3. config -> ConnectionTemplateAutoConfig : 自动配置类，在 spring 中创建bean
4. resources\META-INF\spring.factories : spring 通过此配置找到自动配置类
>不需要启动类，不需要properties，pom依赖中只需要自动配置依赖以及业务相关依赖

- 打包（两种方式）
```
1. 打包到本地仓库
    mvn clean install
    
2. 上传到私服
```