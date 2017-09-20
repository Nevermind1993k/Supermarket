package org.nevermind.service;


import org.nevermind.entity.User;

import java.util.List;

public interface UserService {

    User getById(int id);

    List<User> getAll();

    void save(User user);
}
