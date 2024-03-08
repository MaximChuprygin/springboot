package com.example.springboot.service;


import com.example.springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User readUser(long id);

    User deleteUser(long parseUnsignedInt);

   // void createOrUpdateUser(User user);

    void createUser(User user);

    void updateUser(long id, User user);
}
