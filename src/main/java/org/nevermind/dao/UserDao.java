package org.nevermind.dao;


import org.nevermind.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    User getUserById(int id);

    User update(User newUser);

    List<User> getAll();

    void delete(int id);

    void delete(String name);
}
