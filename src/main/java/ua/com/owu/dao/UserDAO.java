package ua.com.owu.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.entity.User;

public interface UserDAO extends JpaRepository<User,Integer> {
}
