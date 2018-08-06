## 参考来源  

[参考来源](https://blog.csdn.net/saytime/article/details/74783296)  

## 其他

模块有模块自己的 `classpath`  
spring boot 与 mybatis 结合只需要一个包 `"org.mybatis.spring.boot:mybatis-spring-boot-starter:1.3.2"`
mybatis 中不强制要求实体类名与数据表名字对应（具体操作哪张表是通过xml文件来配置）  
mapper 类可以加 `@Mapper` 注解，但更常用的做法是让启动类来自动扫描所有类所在的包 `@MapperScan("cn.vic.mapper")`  
