[toc]
    [bean.name属性](#Bean.name属性)
    [Bean.scope属性](#Bean.scope属性)
    [LoC容器实例化Bean对象的的三种方式](#LoC容器实例化Bean对象的的三种方式)
    [Bean的生命周期-初始化函数和析构函数](#Bean的生命周期)
    
    
## Bean.name属性
    * 给bean取别名, ApplicationContext ctx的getBean方法可根据该别名直接获取Bean对象
->      [ 1-1 bean.name属性](./resources/applicationContext.xml)
->      [ 1-2 getBean方法根据别名获取Bean对象](./java/App.java)


## Bean.scope属性
    * 单例Bean
->      [ 2-1 Bean标签默认单例属性](./resources/applicationContext.xml)
->      [ 2-2  测试单例属性Bean对象的地址](./java/App.java)

    * 多例Bean
->      [ 3-1 Bean.scope属性配置多例对象属性](./resources/applicationContext.xml)
->      [ 3-2 测试多例属性Bean对象的地址](./java/App.java)
    
    (1) 说明: spring的Bean配置文件默认创建单例对象, 如果要创建多例对象, 需要使用scope属性
    
    (2) 单例Bean的使用场景
        1) 表现层对象 servlet
        2) 业务层对象 service
        3) 数据层对象 dao
        4) 工具类对象 util
    (3) 多例Bean的使用场景
        原本就有状态的对象/封装实体的域对象
        
        
## LoC容器实例化Bean对象的的三种方式
    * 使用bean无参构造方法实例化bean标签
->      [3-1 配置无参构造实例化对象](./resources/applicationContext.xml)
        [3-2 获取无参构造创建的Bean对象](./java/App.java)
        
    * 使用静态工厂实例化Bean对象
->      [5-1 静态工厂类获取Bean对象的静态成员方法](./java/factory/StaticBeanFactory.java)
->      [5-2 配置静态工厂类实例化对象](./resources/applicationContext.xml)
->      [5-3 使用静态工厂获取对象](./java/App.java) 
                
    * 使用实例工厂(非静态工厂)实例化Bean对象
        方式1:
->      [6-1 实例Bean工厂获取Bean对象的成员方法](./java/factory/NoStaticBeanFactory.java)
->      [6-2 配置实例工厂实例化对象](./resources/applicationContext.xml)
->      [6-3 使用实例工厂获取对象](./java/App.java)

        方式2:
->      [7-1 实例工厂获取Bean的第二种方式 - FactoryBean](./java/factory/FactoryBean__NoStatic.java)
->      [7-2 配置FactoryBean](./resources/applicationContext.xml) 
->      [7-3 使用FactoryBean获取对象](./java/App.java)

## Bean的生命周期
    * 使用xml配置Bean的初始化函数和析构函数
->      [8-1 配置实现初始化函数和析构函数](./java/dao/impl/BeanLifeCycleDaoImpl.java)
->      [8-2 配置实现bean的生命周期](./java/App.java)
    
    * Bean实现接口, 实现的初始化函数和析构函数
->      [9-1 实现Spring的InitializingBean, DisposableBean接口, 完成生命周期函数设置 ](./java/dao/impl/BeanLifeCycleDaoImpl.java)
->      [9-2 接口实现bean生命周期](./java/App.java)
    
## bean的常用配置属性
    <bean
        id="bookDao"                                            bean的id
        name="dao bookDaoImpl daoImpl"                          bean别名
        class="factroy.factory.StaticBeanFactory"               bean类型; 静态工厂类, 实例工厂类
        scpoe="singletion"                                      控制bean的实例数量
        init-method="init"                                      指定bean的初始化方法
        destroy-method="destroy"                                指定bean的销毁方法
        autowire="byType"                                       自动装配
        factory-method="getInstance"                            bean工厂方法, 应用于静态工厂或实例工厂
        factory-bean="com.factory.BookdaoFactory"               实例工厂bean
        lazy-init="true"                                        控制bean延迟加载
        
    />
    