package com.github.PP_2_3_1_WebCrudApp.UserDao;

import com.github.PP_2_3_1_WebCrudApp.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(Long id);

    void editUser(User user);

    void removeUser(Long id);










}
