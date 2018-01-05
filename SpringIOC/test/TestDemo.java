import cn.spring.demo.SpringDemo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void test(){
        //读取配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext");
        SpringDemo springDemo = (SpringDemo) context.getBean("springDemo");
        springDemo.print();
    }

}