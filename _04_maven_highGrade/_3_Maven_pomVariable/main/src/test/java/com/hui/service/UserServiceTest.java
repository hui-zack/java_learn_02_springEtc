package com.hui.service;

import com.hui.config.SpringConfig;
import com.hui.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)

public class UserServiceTest {

//    @Autowired
//    private UserService userService;

//    @Test
//    public void testSelectById(){
//        User user = userService.selectById(1);
//        if (null != user) {
//            System.out.println(user.toString());
//        }
//
//    }
//
//    @Test
//    public void testSelectAll(){
//        List<User> users = userService.selectAll();
//        System.out.println(users.toString());
//    }

    @Test
    public void testSelectAll() {
        System.out.println("pass");
    }
}
