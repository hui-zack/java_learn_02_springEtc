## Spring事务理解
    Spring事务作用: 
        在数据层或业务层保障一系列的数据库操作同成功同失败
        
## Spring_事务__案例需求
    需求: 模拟任意两个账户间转账操作
    需求微缩: A账户减钱, B账户加钱
    
    实现思路: 
        (1) 数据层提供基础操作, 指定账户减钱(outMoney), 指定账户加钱(InMoney)
        (2) 业务层提供转账操作(transfer), 调用减钱和加强的操作
        (3) 提供2个账户和操作金额执行转账操作
        (4) 基于Spring整合MyBatis环境基础搭建上述功能
        
## Spring使用注解开发事务
.   [1-1 在SpringConfig中设置使用注解开发事务-@EnableTransactionManagement](./main/java/hui/hui.config/SpringConfig.java)
.   [1-2 在jdbc配置类中向IoC添加JDBC事务管理器Bean](./main/java/hui/hui.config/JdbcConfig.java)
.   [1-3 在UserService中开启事务](./main/java/hui/Service/UserService.java)
       
    @Transactional(timeout = -1, rollbackFor = Exception.class)  
    @Transactional注解:
        说明:
            rollbackFor = Exception.class
                @Transactional注解, 默认只在遇到RuntimeException和Error时才会回滚, 非运行异常(编译阶段可以检查出来的异常)默认不回归
                rollbackFor = Exception.class, 由于包含了Exception的所有子类(运行时异常和非运行时异常), 所以所有异常都会回滚
            
## 事务管理员和事务协调员
.   [2 设置事务(默认为Propagation.REQUIRES_NEW)](./main/java/hui/Service/UserService.java)
    
    事务协调员和事务管理员:
        事务管理员: 发起事务方, 在Spring中通常代指业务层开启事务的方法
        事务协调员: 加入事务方, 在Spring中通常代指数据层方法, 也可能是业务层方法
    @Transactional(timeout = -1, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
        propagation = Propagation.REQUIRES_NEW 为默认:
            若事务协调员原本有事务将会加入事务管理员