package hui.controller;


import hui.domain.Address;
import hui.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    /* 1 响应页面 */
    @RequestMapping("/resp-jspPage")
    public String respJsp(){
        System.out.println("response jsp page");
        return "../index.jsp";
    }

    /* 2 响应文本数据 */
    @RequestMapping(value = "/resp-text", produces = {"text/plain;charset=utf-8"})  // produces元素指定ContentType
    @ResponseBody
    public String respText(){
        String poem =
                "世上何人会此言，休将名利挂心田。\n" +
                "等闲倒尽十分酒，遇兴高吟一百篇。\n" +
                "物外烟霞为伴侣，壶中日月任婵娟。\n" +
                "他时功满归何处，直驾云车入洞天。";
        System.out.println("response text data");
        return poem;
    }

    /* 3-3-1 响应json-User转json */

    @RequestMapping("/json-UserToJson")  // produces元素指定ContentType
    @ResponseBody
    public User UserToJson(){
        User user = new User();
        user.setName("张辉");
        user.setAge(18);
        Address address = new Address();
        address.setCity("天镇");
        address.setProvince("山西");
        user.setAddress(address);

        System.out.println("response json data = " + user.toString());
        return user;
    }

    /* 3-3-2 响应json-List转json */
    @RequestMapping("/json-ListToJson")
    @ResponseBody
    public List<User> ListToJson(){
        List<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.setName("犬夜叉");

        User user2 = new User();
        user2.setName("桔梗");
        user2.setAge(18);

        userList.add(user1);
        userList.add(user2);

        System.out.println("response json data = " + userList.toString());
        return userList;
    }

    /* 3-3-3 响应json-Map转json */
    @RequestMapping("/json-MapToJson")
    @ResponseBody
    public HashMap<String, Object> mapToJson(){
        User user = new User();
        user.setName("犬夜叉");

        HashMap<String, Object> mapData = new HashMap<>();
        mapData.put("json", user);
        mapData.put("status", true);
        mapData.put("id", 1);

        System.out.println("response json data = " + mapData.toString());
        return mapData;
    }

}
