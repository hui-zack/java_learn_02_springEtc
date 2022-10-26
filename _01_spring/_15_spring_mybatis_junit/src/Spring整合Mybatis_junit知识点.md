## spring整合mybatis步骤
.   [导入maven坐标(5个)](../pom.xml)
.   [1 编写SpringConfig配置类](./main/java/hui/config/SpringConfig.java)    
.   [2 编写JdbcConfig配置类](./main/java/hui/config/JdbcConfig.java)         // 生成数据库连接池    
.   [3 编写MybatisConfig配置类](./main/java/hui/config/MybatisConfig.java)                     
            // 设置mybatis的sql接口包位置和封装类包位置, 并返回SqlSessionFactoryBean对象      
.   [4 在mybatisConfig设置的sql接口位置下编写查询类](./main/java/hui/dao/UserDao.java) -->[数据访问层-dao]    
.   [5 在mybatisConfig设置的封装类位置下编写封装类类](./main/java/hui/domain/User.java) -->[封装类]   
.   [6 在Service包中编写服务层代码](./main/java/hui/service/impl/UserServiceImpl.java) -->[业务层]   
.   [7 在main中获取业务层对象并开始查询](./main/java/hui/App.java)                      -->[表现层]

## Spring整合Junit
.   [0 导入maven坐标(2个)](../pom.xml)
.   [1 编写测试类](./test/java/hui/service/ServiceTest.java)