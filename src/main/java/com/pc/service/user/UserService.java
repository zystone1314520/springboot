package com.pc.service.user;

import com.pc.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    int insertUser(User user);
    int delUser(long id);
}
