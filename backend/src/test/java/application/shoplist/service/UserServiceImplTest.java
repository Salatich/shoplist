package application.shoplist.service;

import application.shoplist.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    private UserService userService = Mockito.mock(UserService.class);

    @Test
    public void testCreateUser() {
        User user = new User();
        userService.save(user);
        Mockito.verify(userService).save(user);
    }

    @Test
    public void testGetUserByLogin() {
        User user = new User();
        String login = "newUser";
        user.setLogin(login);
        Mockito.when(userService.getUserByLogin(login)).thenReturn(user);
    }
}
