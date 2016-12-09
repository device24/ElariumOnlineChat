package com.elariumonline.service;

import com.elariumonline.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User findByLogin(String login) {
        User user = new User();
        user.setLogin(login);
        user.setLogin("1234");
        return user;
    }
}
