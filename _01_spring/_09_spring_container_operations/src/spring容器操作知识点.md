## 容器操作_创建容器的四种方法
.   [1 使用类路径加载spring配置文件](./main/java/App.java)
.   [2 加载多个配置文件](./main/java/App.java)
.   [3 使用全路径加载spring配置文件](./main/java/App.java)
.   [4 使用BeanFactory加载spring配置文件](./main/java/App.java)
    
    BeanFactory创建容器和类路径, 文件系统创建容器的区别
        类路径和文件系统加载配置文件生成容器:
            所有的Bean在容器创建时, 默认立即生成所需的Bean对象
        BeanFactory加载配置文件生成容器:
            所有的Bean在容器创建时, 默认不立即生成bean对象(在调用该Bean时创建)
    配置类路径, 文件系统设置延迟创建Bean
        配置applicationContext对应的bean(添加 lazy-init="true" 属性):
            <bean id="bookDao" class="dao.impl.BookDaoImpl" lazy-init="true"/>
            
## 容器操作_获取bean的三种方法
.   [5 获取bean方式1](./main/java/App.java)
.   [6 获取bean方式2](./main/java/App.java)
.   [7 获取bean方式3, 根据类型获取(容器中该类型的bean只能有一个, 多个会报错)](./main/java/App.java)

## 容器相关总结
    BeanFactory是IoC容器的顶层接口, 初始化BeanFactory对象后, Bean的加载方式为延迟加载
    ApplicationContext接口是Spring的核心接口, 初始化后, Bean的加载方式为立即加载 
    ApplicationContext接口提供基础的bean操作方法. 通过其他的接口扩展功能:
    ApplicationContext接口常用初始化类
        ClassPathXmlApplicationContext
        FileSystemXmlApplicationContext
    

    
    