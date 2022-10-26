[toc]
    [1](#AOP入门案例)
    [2](#AOP理解)
    [3](#AOP概念)
    [4](#AOP工作流程)
    [5](#切入点表达式描述规则)

            
## AOP学习案例
.   [0 导入mvn坐标](../pom.xml)
.   [1-1 配置Spring支持AOP注解开发](./main/java/hui/config/SpringConfig.java)
.   [1-2 指定为AOP类](./main/java/hui/aop/MyAdvice.java)
.   [1-3 @Pointcut("")注解定义切入点](./main/java/hui/aop/MyAdvice.java)
.   [1-4-1 @Before("")注解绑定切入点和通知](./main/java/hui/aop/MyAdvice.java)
.   [1-4-2 @After()后置通知](./main/java/hui/aop/MyAdvice.java)
.   [1-4-3 @Around()环绕通知](./main/java/hui/aop/MyAdvice.java)
.   [1-4-4 @AfterReturning()原代码return后通知](./main/java/hui/aop/MyAdvice.java)
.   [1-4-5  @AfterThrowing()出异常后通知](./main/java/hui/aop/MyAdvice.java)
.   [1-5 调用被通知的方法](./main/java/hui/App.java)
    
    案例设定: 测定接口执行效率
    简化设定: 在接口执行前输出当前系统时间
    开发模式: XML 或 注解
    思路分析:
        1. 导入坐标(pom.xml)
        2. 制作连接点方法(Dao接口或实现类)
        3. 制作共性功能(制作类与通知)
        4. 定义切入点
        5. 绑定切入点与通知的关系(切面)
    
## AOP理解
    AOP: 
        面向切面编程, 切面编程是一种编程范式, 指导开发者如何组织程序结构(如, 面向对象编程为OOP)
        AOP指在不惊动原始设计的基础上进行功能增强
        
    AOP使用场景; 
        在不惊动原始设计的基础上进行功能增强
    spring理念: 无入侵式编程
    
## AOP概念
    连接点(JoinPoint): 
        程序执行过程中的任意位置, 粒度为执行方法, 抛出异常, 设置变量等
        springAOP中, 连接点理解为方法的执行
    切入点(Pointcut):
        匹配连接点的式子
        在springAOP中, 一个切入点既可以匹配一个方法, 也可以匹配多个方法
            匹配一个方法, 如:
                匹配hui.dao包下的BookDao接口中无形参无返回值的save方法
            匹配多个方法, 如:
                所有的save方法
                所有的get方法 
                所有以Dao结尾的接口中的任意方法
                所有带有一个参数的方法
    通知(Advice): 
        在切入点外添加的操作, 也就是共性功能
        在springAOP中, 功能最终以方法的形式呈现
    通知类: 
        定义通知的类
    切面(Aspect):
        描述通知和切入点的对应关系
    目标对象: 
        被代理的原始对象成为目标对象
        
## AOP工作流程
    1. Spring容器启动
    2. 读取所有切面配置中的切入点
    3. 初始化bean, 判定bean对应的类中方法是否匹配到任意切人点
        匹配失败-创建对象
        匹配成功, 创建原始对象(目标对象)的代理对象
    4. 获取bean执行方法:
        获取Bean, 调用方法并执行, 完成操作
        获取的bean是代理对象时, 根据代理对象的原型模式运行原始方法与增强的内容, 完成操作
        
    目标对象和代理:
        目标对象(Target): 
            原始功能去掉共性功能对应的类产生的对象, 这种对象是无法直接完成最终工作的
        代理: 
            目标对象无法直接完成工作, 需要对其进行功能回填, 通过原始对象的代理对象实现

        
## 切入点表达式描述规则
    说明:
        1. 切入点: 要增强的方法
        2. 切入点表达式: 要进行增强的方法的描述方法
        3. 描述方式:
            需求:  将hui.dao.BookDao.updata()方法作为切入点:
                表达式1-根据接口描述:   
                    execution(void hui.dao.BookDao.update())
                表达式2-根据实现类描述
                    execution(void hui.dao.impl.BookDaoImpl.update())
        4. 切入点表达式开发标准
            (1) 描述切入点时通常描述接口, 而不描述实现类
            (2) 访问控制修饰符针对接口开发均采用public描述()
            
        
    内容:
        1.切入点表达式标准格式: 
            execution(private void hui.dao.impl.BookDaoImpl.before())
                execution       --> 动作关键字, 描述切入点的行为动作, 例如extcution表示执行到指定切入点
                private         --> 可省略
        2. 切入点表达式的通配符:
            通配符 -> * :
                说明: 
                    单个独立元素的任意符号, 可以独立出现, 也可以作为前缀或者后缀出现
                如:
                    execcution(public * hui.dao.impl.BookDaoImpl.se*(*))
                    匹配hui.dao.impl.BookDaoImpl类中所有以se开头的带有一个参数的方法
            通配符 -> .. :
                说明: 
                    多个连续元属的任意符号, 可以独立出现, 常用于简化包名与参数的书写
                如:          
                    execcution(public void hui.dao.impl.BookDaoImpl.update(..))
                    匹配hui.dao.impl.BookDaoImpl类中所有名称为updata的方法(一个或多个参数都可以)
            通配符 -> + :
                execution(* *..*Service+*(...))
                