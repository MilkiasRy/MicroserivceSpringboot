package dao;

import java.util.List;

import domain.User;
import org.springframework.data.repository.CrudRepository;



public interface UserDao extends CrudRepository<User, Long> {
	User findByUsername(String username);
    User findByEmail(String email);
    List<User> findAll();
}
