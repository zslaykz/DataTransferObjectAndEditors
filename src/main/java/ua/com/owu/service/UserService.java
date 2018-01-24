package ua.com.owu.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.entity.User;

import java.util.List;

@Service
@Transactional
public interface UserService {

    void save(User user);

    List<User> findAll();

    User findOne(int id);
}
