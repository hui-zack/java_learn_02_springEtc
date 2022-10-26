package hui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/* 1-4 编写表现层代码 */
@Controller                         // 表现层对象发送到IoC容器作为Bean
public class UserController {
    @RequestMapping("/test")        /* 1-4-1 @RequestMapping("/test")注解设置请求路径 */
    @ResponseBody                   /* 1-4-2 @ResponseBody注解配置返回值为响应体 */
    public String test(){
        return "{'data': 'hello SpringMVC'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        return "{'data': 'SpringMVC delete'}";
    }
}
