package com.example.SpringBoot.dao;

import com.example.SpringBoot.models.User;
import java.util.List;

public interface UserDao {

    List<User> index();
    User show(int id);
    void save(User user);
    void update(User updatedUser);
    void delete(int id);

}