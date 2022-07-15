import com.xkk.dao.UserDaoMysqlImpl;
import com.xkk.dao.UserDaoOracleImpl;
import com.xkk.service.UserService;
import com.xkk.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());
        ((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }

    @Test
    public void IOCTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userDaoServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userDaoServiceImpl.getUser();
    }
}
