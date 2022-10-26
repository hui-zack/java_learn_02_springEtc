package hui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

//@Controller
@RequestMapping("/user")
public class UserController {
    /* 1-1 post提交 */
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public HashMap<String, String> save(@RequestBody HashMap<String, String> requestData){
        System.out.println("SpringMVC-REST(POST) requestData=" + requestData);
        HashMap<String, String> respData = new HashMap<>();
        respData.put("data", "SpringMVC-REST(POST) update users successful");
        return respData;
    }

    /* 1-2 delete删除 */
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public HashMap<String, String> delete(@PathVariable int id){
        System.out.println("SpringMVC-REST(DELETE) requestPathVariable=" + id);

        HashMap<String, String> respData = new HashMap<>();
        respData.put("data", "SpringMVC-REST(DELETE) delete user by id=" + id + " successful");
        return respData;
    }

    /* 1-3 put设置 */
    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public HashMap<String, String> set(@RequestBody HashMap<String, String> requestData){
        System.out.println("SpringMVC-REST(PUT) set user successful");

        HashMap<String, String> respData = new HashMap<>();
        respData.put("data", "SpringMVC-REST(PUT) set user successful");
        return respData;
    }

    /* 1-4 get查询单个 */
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public HashMap<String, String> selectById(@PathVariable int id){
        System.out.println("SpringMVC-REST(GET) select user byId successful");

        HashMap<String, String> respData = new HashMap<>();
        respData.put("data", "SpringMVC-REST(GET) select userby id=" + id + " successful");

        return respData;
    }

    /* 1-5 get查询所有 */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public HashMap<String, String> selectAll(){
        System.out.println("SpringMVC-REST(GET) select all successful");

        HashMap<String, String> respData = new HashMap<>();
        respData.put("data", "SpringMVC-REST(GET) select all successful");

        return respData;
    }

}
