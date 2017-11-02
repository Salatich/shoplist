package application.shoplist.service;


import application.shoplist.entity.User;

public interface UserService {

    void save(User user);

    User getUserByLogin(String login);

}
