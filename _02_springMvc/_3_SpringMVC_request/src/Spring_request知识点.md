## 设置请求路径
.   [1-1 使用@RequestMapping("\xxx")注解设置路径前缀-类名上添加](main/java/hui/controller/UserController.java)
.   [1-2 使用@RequestMapping("\xxx")注解设置路径后缀-方法上添加](main/java/hui/controller/UserController.java)

## 编解码设置
.   [2-1 使用filter设置post请求解码UTF8](main/java/hui/config/ProjectContainerInitConfig.java)

## SpringMVC获取请求参数
.   [3-1 get请求获取url携带参数](main/java/hui/controller/UserController.java)
.   [3-2 get请求参数封装到User类](main/java/hui/controller/UserController.java)
.   [3-3 get请求参数封装到String数组](main/java/hui/controller/UserController.java)
.   [3-4 get请求参数封装到List<String>](main/java/hui/controller/UserController.java)
.   [3-5 post请求获取content-type=application/x-www-form-urlencoded类型的请求体键值对参数](main/java/hui/controller/UserController.java)

## SpringMVC接收日期型请求参数
.   [4 SpringMVC获取Data类型的请求参数](main/java/hui/controller/UserController.java)

## 类型转换器_Converter接口
    Date类型转化的功能是在底层实现的Converter接口
    在SpringMvcConfig中的@EnableWebMvc会打开根据类型匹配的功能

## SpringMVC接收json数据
.   [5-1 添加jackson依赖](../pom.xml)
.   [5-2 @EnableWebMvc注解打开json快速转换功能](./main/java/hui/config/SpringMvcConfig.java)
.   [5-3 SpringMVC处理json数据](./main/java/hui/controller/JsonController.java)
.       [5-3-1 请求的jsonArray转化为List](./main/java/hui/controller/JsonController.java)
.       [5-3-2 请求的json数据转为User对象](./main/java/hui/controller/JsonController.java)
.       [5-3-3 请求的jsonArray转化为UserList](./main/java/hui/controller/JsonController.java)

