package application.shoplist.service;

import application.shoplist.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class UserServiceImplTest {

    private UserService userService = Mockito.mock(UserService.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testCreateUser() {
        User user = new User();
        userService.save(user);
        Mockito.verify(userService).save(user);
    }

    @Test
    public void testFindUserByLogin() {
        User user = new User();
        String login = "salatich";
        user.setLogin(login);
        userService.save(user);
        entityManager.flush();
        System.out.println(userService.findUserByLogin("salatich") + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        User user1 = userService.findUserByLogin("salatich");
        Mockito.when(userService.findUserByLogin(login)).thenReturn(user);
    }

    @Test
    public void testDeleteUser(){
        User user = new User();
        userService.save(user);
        userService.delete(user);
        Mockito.verify(userService).delete(user);
    }
}
