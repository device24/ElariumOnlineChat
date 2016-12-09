package com.elariumonline.service;

import com.elariumonline.model.User;

public interface UserService {

    User findByLogin(String login);
}
