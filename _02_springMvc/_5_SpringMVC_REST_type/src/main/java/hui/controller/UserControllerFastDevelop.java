package hui.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/* 2-1 @RestController注解 */
@RestController                 // 包含@Controller @ResponseBody这两个注解
@RequestMapping("/user")
public class UserControllerFastDevelop {
    /* 2-2-1 @PostMapping(xxx)注解  */
    @PostMapping("/users")              //相当于@RequestMapping(value = "/users", method = RequestMethod.POST)
    public HashMap<String, String> save(@RequestBody HashMap<String, String> requestData){
        System.out.println("SpringMVC-REST(POST) requestData=" + requestData);
        HashMap<String, String> respData = new HashMap<>();
        respData.put("data", "SpringMVC-REST(POST) update users successful");
        return respData;
    }

    /* 2-2-2 @DeleteMapping(xxx)注解 */
    @DeleteMapping("/users/{id}")       // 相当于@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public HashMap<String, String> delete(@PathVariable int id){
        System.out.println("SpringMVC-REST(DELETE) requestPathVariable=" + id);

        HashMap<String, String> respData = new HashMap<>();
        respData.put("data", "SpringMVC-REST(DELETE) delete user by id=" + id + " successful");
        return respData;
    }

    /* 2-2-3 @PutMapping(xxx)注解 */
    @PutMapping("/users")               // 相当于@RequestMapping(value = "/users", method = RequestMethod.PUT)
    public HashMap<String, String> set(@RequestBody HashMap<String, String> requestData){
        System.out.println("SpringMVC-REST(PUT) set user successful");

        HashMap<String, String> respData = new HashMap<>();
        respData.put("data", "SpringMVC-REST(PUT) set user successful");
        return respData;
    }

    /* 2-2-4 @GetMapping(xxx)注解 */
    @GetMapping("/users/{id}")          // 相当于@RequestMapping(value = "/users", method = RequestMethod.PUT)
    public HashMap<String, String> selectById(@PathVariable int id){
        System.out.println("SpringMVC-REST(GET) select user byId successful");

        HashMap<String, String> respData = new HashMap<>();
        respData.put("data", "SpringMVC-REST(GET) select userby id=" + id + "successful");

        return respData;
    }

    /* 2-2-5 @GetMapping(xxx)注解 */
    @GetMapping("users")                // 相当于@RequestMapping(value = "/users", method = RequestMethod.GET)
    public HashMap<String, String> selectAll(){
        System.out.println("SpringMVC-REST(GET) select all successful");

        HashMap<String, String> respData = new HashMap<>();
        respData.put("data", "SpringMVC-REST(GET) select all successful");

        return respData;
    }
}
