import com.louis.Service.UserService;
import com.louis.entity.User;
import com.sun.xml.internal.rngom.parse.host.Base;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by test on 2016/4/25.
 */
public class TestMethod extends BaseTest {
    @Autowired
    private UserService userService;

    @Test
    public void testHasMatchUser() {
        boolean flag = userService.hasMatchUser("admin", "12456");
        System.out.println(flag);
    }

    @Test
    public void testFindUserByUserName() {
        User user = userService.findUserByUserName("amin");
        System.out.println(user);
    }

    @Test
    public void testLoginSuccess(){
        User user =new User();
        user.setCredits(5);
        user.setUserName("louis");
        user.setLastIp("192.0.12.1");
        user.setLastVisit(new Date());
        user.setPassword("123456");
        userService.loginSuccess(user);
    }
}
