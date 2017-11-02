package application.shoplist.dao;


import application.shoplist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByLogin(String login);

}
