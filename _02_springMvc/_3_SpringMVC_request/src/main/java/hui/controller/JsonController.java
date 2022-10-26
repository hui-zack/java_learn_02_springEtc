package hui.controller;

import hui.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/* 5-3 SpringMVC处理json数据 */
@Controller
@RequestMapping("/json")
public class JsonController {
    /* 5-3-1 请求的jsonArray转化为List */
    @RequestMapping("json-List")                                        // 请求json数据 = ["music", "game", "java"]
    @ResponseBody
    public String jsonToList(@RequestBody List<String> likes){
        System.out.println("json to List = " + likes);
        return "'data', 'create List<String> receive jsonArray successful'";
    }

    /* 5-3-2 请求的json数据转为User对象 */
    @RequestMapping("/json-User")                                       // 请求json数据 = {"name":"张辉", "age" : 16, "address": {"province": "山西", "city": "天镇"}}
    @ResponseBody
    public String jsonToUser(@RequestBody User user){
        System.out.println("json to User, " + user.toString());
        return "'data', 'create User Object receive json successful'";
    }
    /* 5-3-3 请求的jsonArray转化为UserList */
    @RequestMapping("/json-UserList")                                   // 请求json数据 = [{"name":"张辉","age":16,"address":{"province":"山西","city":"天镇"}},{"name":"犬夜叉","age":16,"address":{"province":"nono","city":"nono"}}]
    @ResponseBody
    public String jsonToUserList(@RequestBody List<User> userList){
        System.out.println("jsonArray to UserList, userList = " + userList);
        return "'data', 'create List<User> receive jsonArray successful'";
    }
}
