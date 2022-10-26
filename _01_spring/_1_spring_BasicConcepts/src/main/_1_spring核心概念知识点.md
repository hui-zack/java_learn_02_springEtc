[spring入门知识点]
    [1](#相关概念_spring)
    [2](#核心概念理解)
    [3](#快速流程_spring)

## 相关概念_spring

    1. 发展历程:
        1999 EJB1.1发布
        2006 EJB3.0发布
        EJB是spring的前身
        
    
    2. AOP-面向切面编程 
        (1) spring系统架构图
            高层      -       Data Access/Integration         web
            次底层实现 -           AOP         Aspects                   //AOP 面向切面编程,  Aspects: AOP思想的实现
            最底层容器 -   Beans        core         Context       SpEL

## 核心概念理解
    1. IoC - 控制反转
        控制反转的理解:
            对象的创建控制权从代码内部(new对象)转移到外部, 由于对象的创建控制权被转移了, 因此这种思想称为控制反转
        spring的IoC容器:
            IoC容器, 充当IoC思想中的外部
        IoC容器负责对象的创建, 初始化等一系列工作, 被创建或被管理的对象在IoC容器中被称为Bean
    2. DI - 依赖注入
        依赖注入的理解:
            在容器中处理bean与bean之间的依赖关系, 并将依赖关系返还给原代码, 称为依赖注入
    
    目标 - 充分解耦
        使用IoC容器管理bean(IoC)
        在IoC容器内进行Bean之间的依赖绑定(DI)
    
