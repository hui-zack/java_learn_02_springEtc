package hui.controller;

import hui.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/user")            /* 1-1 使用@RequestMapping("\xxx")注解设置路径前缀-类名上添加 */
public class UserController {
    @RequestMapping("/save")        /* 1-2 使用@RequestMapping("\xxx")注解设置路径后缀-方法上添加 */
    @ResponseBody
    public String save(){
        System.out.println("user save run");
        return "'data': 'user save run'";
    }

    /* 3-1 get请求获取url携带参数 */
    @RequestMapping("/get-verify")
    @ResponseBody
    public String getVerify(@RequestParam("name") String username, String password){
        System.out.println("request-get: name=" + username + ", password=" + password);
        return "'data': 'receive GET params'";
    }

    /* 3-2 get请求参数封装到User类 */
    @RequestMapping("/get-User")
    @ResponseBody
    public String getToUser(User user){                                                         //get请求url http://localhost:8085/user/get-User?name=hui&age=16&address.province=山西&address.city=天镇
        System.out.println("request params to User Object, " + user.toString());
        return "'data': 'create User Object receive params successful'";
    }


    /* 3-3 get请求参数封装到String数组 */
    @RequestMapping("/get-StringArray")
    @ResponseBody
    public String getToStringArray(String[] likes){                                              //get请求url http://localhost:8085/user/get-StringArray?likes=java&likes=girls&likes=music&likes=games
        System.out.println("request params to  String[] " + Arrays.toString(likes));
        return "'data': 'create  String[] receive params successful'";
    }

    /* 3-4 get请求参数封装到StringList */
    @RequestMapping("/get-StringList")
    @ResponseBody
    public String getToStringList(@RequestParam List<String> likes){                            //get请求url http://localhost:8085/user/get-User?name=hui&age=16&address.province=山西&address.city=天镇
        System.out.println(likes.getClass());
        System.out.println("request params to List<String> " + likes.toString());
        return "'data': 'create List<String> receive params successful'";
    }

    /* 4 get请求获取Date类型参数 */
    @RequestMapping("/get-Date")
    @ResponseBody
    public String getToData(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date date1,
                            @DateTimeFormat(pattern = "yyyy/MM/dd HH/mm/ss")Date date2){
        System.out.println("date = " + date);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        return "'data': 'receive get-Data type params successful'";
    }

    /* 3-5 post请求获取content-type=application/x-www-form-urlencoded类型的请求体键值对参数 */
    @RequestMapping("/post-verify")
    @ResponseBody
    public String postVerify(String name, String password){
        System.out.println("request-post: name=" + name + ", password=" + password);
        return "'data': 'receive post params'";
    }

}
