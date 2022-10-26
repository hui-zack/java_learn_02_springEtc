## REST风格
    基本说明:
        REST风格是一种约定方式
    
    使用场景:
        用于隐藏隐藏用户行为
    优点:
        隐藏资源的访问行为, 隐藏通过请求地址得知对资源进行何种操作
    
    REST风格简介:
        http://localhost/users             查询全部用户信息      GET
        http://localhost/users/1           查询指定用户信息      GET
        http://localhost/users             添加用户信息          POST
        http://localhost/users             修改用户信息          PUT
        http://localhost/users/1           删除用户信息          DELETE
    
    RESTful:
        根据RESTful对资源进行访问
        
## REST原生开发
.   [1-1 post提交](main/java/hui/controller/UserController.java)
.   [1-2 delete删除](main/java/hui/controller/UserController.java)
.   [1-3 put设置](main/java/hui/controller/UserController.java)
.   [1-4 get查询单个](main/java/hui/controller/UserController.java)
.   [1-5 get查询所有](main/java/hui/controller/UserController.java)

## REST快速开发
.   [2-1 @RestController注解](main/java/hui/controller/UserControllerFastDevelop.java)
.   [2-2 请求方法注解代替@RequestMapping]
.       [2-2-1 @PostMapping(xxx)注解](main/java/hui/controller/UserControllerFastDevelop.java)
.       [2-2-2 @DeleteMapping(xxx)注解](main/java/hui/controller/UserControllerFastDevelop.java)
.       [2-2-3 @PutMapping(xxx)注解](main/java/hui/controller/UserControllerFastDevelop.java)
.       [2-2-4 @GetMapping(xxx)注解](main/java/hui/controller/UserControllerFastDevelop.java)
.       [2-2-5 @GetMapping(xxx)注解](main/java/hui/controller/UserControllerFastDevelop.java)