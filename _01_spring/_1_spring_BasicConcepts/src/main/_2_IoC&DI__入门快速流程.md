[toc]
    [1-1](#IOC入门案例需要解决的问题)
    [2-1](#Spring_IoC快速入门流程)
    [1-3]
## IOC入门案例需要解决的问题
    1. 如何使用spring技术?
        在pom中导入坐标
    2. ioc在管理什么?
        Service或Dao层的bean对象C
    3. 如何将管理的对象发送到IoC容器?
        使用配置文件
    4. 代码中如何获取IoC容器?
        使用接口
    5. 使用Bean时, 如何从IoC容器中获取Bean对象?
        使用接口的方法

        
## Spring_IoC快速入门流程
    目标: 通过springIoC创建对象
    1. 导入spring的坐标spring-context, 对应版本时5.2.10.RELEASE
->      [spring坐标](../../pom.xml) 
    
    2. 配置bean - 1
->      [applicationContext.xml](resources/applicationContext.xml)
        
    3. 在App.java中初始化容器,并获取bean对象
->      [App-main](java/App.java)        

        
## DI入门案例待解决问题
    1. Service层代码中使用new形式创建的Dao对象是否要保留?
        否
    2. Service中需要的Dao对象如何获取?
        写一个提供Bean的方法
    2. Service与Dao的依赖如何描述?
        配置文件
       


## DI_依赖注入
    目标: 通过依赖注入的方式解耦bean与bean之间的依赖
    1. 在service层中去掉new(但需要保留声明)
->      [serviceImpl](java/service/impl/BookServiceImpl.java)
    
    2. 在配置文件中声明依赖关系 - 2
->      [applicationContext](resources/applicationContext.xml)
