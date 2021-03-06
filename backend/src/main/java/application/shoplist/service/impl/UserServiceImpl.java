package application.shoplist.service.impl;

import application.shoplist.dao.UserRepository;
import application.shoplist.entity.User;
import application.shoplist.service.UserService;
import com.jcabi.aspects.Loggable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Loggable(value = Loggable.DEBUG, prepend = true, trim = false)
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public static final String CREATE_USER_PATH ="/createUser";

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findUserByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }
}
