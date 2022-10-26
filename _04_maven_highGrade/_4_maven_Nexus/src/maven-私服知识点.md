## Nexus的下载与启动
[maven_maven私服_Nexus下载地址](http://help.sonatype.com/repomanager3/download)
    
    解压后有两个目录, 在nexus-xxx中的bin目录下, 执行命令:
        nexus.exe /run nexus
        
## 私服仓库分类:
    宿主仓库: 
        英文名称: hosted  
        作用: 保存自主研发+第三方资源 
        使用场景: 上传资源
    仓库组:
        英文名称: group
        作用: 用于提供本地已有的资源
        使用场景: 下载第三方资源
    代理仓库:
        英文名称: proxy
        作用: 连接中央仓库
        使用场景: 下载资源

## 本地仓库连接私服
[本地仓库连接私服-在maven安装目录下conf/settings.xml配置]

    1. 在service结点下配置本地仓库访问权限-宿主仓库
        <server>
              <id>project-release</id>                                      // 发布版本-宿主仓库
              <username>admin</username>
              <password>admin</password>
        </server>
        <server>                                                            // 快照版本-宿主仓库
              <id>project-snapshot</id>
               <username>admin</username>
              <password>admin</password>
        </server>

    2. 在<mirrors>结点下配置使用的仓库组
        <mirror>                                                
              <id>maven-public</id>                                         // 仓库组名称
              <mirrorOf>*</mirrorOf>                                        // 所有资源从仓库组下载
              <name>Human Readable Name for this Mirror.</name>
              <url>http://localhost:8081/repository/maven-puclic</url>      // 仓库组访问地址
        </mirror>
## 项目中配置私服
[1-1 项目中配置私服](../pom.xml)
    
    若项目版本号为1.0-SNAPSHOT, 自动上传到