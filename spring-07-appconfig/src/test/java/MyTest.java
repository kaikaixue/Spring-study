import com.xkk.config.MyConfig;
import com.xkk.pojo.Dog;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog.name);
    }
}
