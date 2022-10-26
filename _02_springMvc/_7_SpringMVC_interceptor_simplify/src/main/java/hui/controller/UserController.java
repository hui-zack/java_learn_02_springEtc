package hui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller                         // 表现层对象发送到MVC容器作为Bean
public class UserController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("requestPath:/test run");
        return "{'data': 'hello SpringMVC'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        return "{'data': 'SpringMVC delete'}";
    }
}
