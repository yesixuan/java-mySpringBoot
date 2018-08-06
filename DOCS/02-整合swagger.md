## 快速集成swagger模块

1. 将 swagger 模块复制到项目中  
2. 在 `controller` 所在的模块中添加编译时依赖 `swagger` 模块（`compile project(":swagger")`）  

## 普通对象如何进行依赖注入  

需要被注入的类上添加`@Component`  
需要使用对象的类上添加`@ComponentScan(basePackages = "xx.xx.xx")`  