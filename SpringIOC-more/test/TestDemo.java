
import cn.spring.pojo.TestEntity;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void test(){
        //读取配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext");
        TestEntity testEntity = (TestEntity)context.getBean("testEntity");
        testEntity.showValue();
    }

}