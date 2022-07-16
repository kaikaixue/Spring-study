import com.xkk.pojo.Student;
import com.xkk.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Student student = (Student) context.getBean("student");
//        System.out.println(student.toString());
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
        User user1 = context.getBean("user1", User.class);
        System.out.println(user1.toString());
        System.out.println(user == user1);
    }
}
