
import cn.spring.pojo.User;
import cn.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void test(){
        //读取配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setEmail("323@qq.com");

        userService.addNewUser(user);
    }

}