package org.nevermind.service;


import org.nevermind.dao.UserDao;
import org.nevermind.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(int id) {
        return userDao.getUserById(id);
    }
}
