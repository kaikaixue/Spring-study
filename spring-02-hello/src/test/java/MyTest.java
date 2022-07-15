import com.xkk.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) applicationContext.getBean("hello");
        System.out.println(hello.toString());
    }
}
