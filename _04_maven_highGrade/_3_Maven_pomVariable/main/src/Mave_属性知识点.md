
## Maven属性
[pom文件设置变量]
    [1-1 在pom文件中使用变量记录依赖版本号](../../parent/pom.xml)
    [pom文件中修改配置文件](https://www.bilibili.com/video/BV1Fi4y1S7ix?p=82&spm_id_from=pageDriver&vd_source=d2a76462ea1d3d324c39a4a05c5ed548)

## maven聚合工程构建时, 解决war项目web.xml报错
    在war包的模块中创建webapp/WEB-INF/web.xml文件, 空文件就行
    
## 项目版本命名规则
    快照版本和发布版本:
        SHAPSHOT:
            开发过程中临时输入的版本, 称为快照版本
            快照版本会随着开发的进展不断更新
        RELEASE
            对外发布的较为稳定的版本, 后续即使进行功能的后续开发, 也不会改变当前发布的版本内容, 称为发布版本
    发布版本:
        alpha版
        beta版
        纯数值版

## Maven_动态配置文件
[动态配置文件设置数据库]
    [2-1 读取所有子模块的配置文件位置](../../parent/pom.xml)
    [2-2 设置配置文件变量](../../parent/pom.xml)
    [2-3 使用配置文件变量](main/resources/jdbc.properties)

## 设置聚合工程install时跳过测试
[pom文件配置跳过测试]
    [3-1 跳过测试](../../parent/pom.xml)
    
    mvn 命令设置跳过测试: mvn install -D skipTests