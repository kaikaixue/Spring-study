import com.xkk.mapper.UserMapper;
import com.xkk.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl2 = context.getBean("userMapperImpl2", UserMapper.class);
        List<User> list = userMapperImpl2.selectUser();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
