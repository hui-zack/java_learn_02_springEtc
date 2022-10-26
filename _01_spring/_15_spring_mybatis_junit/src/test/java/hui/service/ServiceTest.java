package hui.service;

import hui.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)                 /* spring整合junit的专用类运行器 */
@ContextConfiguration(classes = SpringConfig.class)     /* spring环境 */
public class ServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void UserServiceTest(){
        System.out.println(userService.selectById(1));
    }
}
