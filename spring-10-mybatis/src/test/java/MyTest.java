import com.xkk.mapper.UserMapper;
import com.xkk.mapper.UserMapperImpl;
import com.xkk.pojo.User;
import com.xkk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.selectUser();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserMapper userMapper = context.getBean("userMapperImpl", UserMapper.class);
        UserMapper userMapper = context.getBean("userMapperImpl2", UserMapper.class);
        List<User> list = userMapper.selectUser();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
