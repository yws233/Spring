package test;

import cn.aop.pojo.User;
import cn.aop.service.UserService;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTestDemo {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = (UserService)context.getBean("userService");
        User user = new User();
        user.setId(1);
        user.setUsername("测试");
        user.setPassword("000000");
        user.setEmail("qq@.com");
        userService.addNewUser(user);
    }

}