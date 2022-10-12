**项目结构** 
```
books-test
├─common 公共模块
│  ├─aspect 系统日志
│  ├─exception 异常处理
│  ├─validator 后台校验
│  └─xss XSS过滤
│ 
├─config 配置信息
│ 
├─modules 功能模块
│  ├─books 文件服务模块
│  └─sys 权限、日志模块
│ 
├─CustomApplication 项目启动类
│  
├──resources 
│  ├─mapper SQL对应的XML文件

```
<br> 


**技术选型：** 
- 核心框架：Spring Boot 2.1
- 安全框架：Apache Shiro 1.4
- 视图框架：Spring MVC 5.0
- 持久层框架：MyBatis 3.3
- 数据库连接池：Druid 1.0
- 日志管理：SLF4J 1.7、Log4j
<br> 


**注意事项：** 
- 支持jdk1.8+
- swagger地址：http://127.0.0.1:8090/books-test/swagger-ui.html
- swagger接口主要有3模块：<br>
&nbsp;&nbsp;1）系统登录登出模块<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其中权限登录接口：http://127.0.0.1:8090/books-test/sys/login<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;账号：admin<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码：admin<br>
&nbsp;&nbsp;2）系统操作日志模块<br>
&nbsp;&nbsp;3）图书管理模块<br>
- tool下的Redis-x64-3.0.500.rar为redis客户端和服务端，运行redis-server.exe即可启动服务端
- application.yml为主要配置文件，其中redis为默认关闭
- application-dev.yml为默认的数据库使用配置，使用h2数据库,其脚本在resources/db文件夹下




