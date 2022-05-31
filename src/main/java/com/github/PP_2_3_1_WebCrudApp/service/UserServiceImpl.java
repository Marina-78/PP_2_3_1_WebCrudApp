package com.github.PP_2_3_1_WebCrudApp.service;

import com.github.PP_2_3_1_WebCrudApp.UserDao.UserDao;
import com.github.PP_2_3_1_WebCrudApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);

    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    public void editUser(User user) {
        userDao.editUser(user);

    }

    @Override
    public void removeUser(Long id) {
        userDao.removeUser(id);

    }
}
