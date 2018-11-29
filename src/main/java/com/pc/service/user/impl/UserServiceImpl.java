package com.pc.service.user.impl;

import com.pc.dao.UserDao;
import com.pc.entity.User;
import com.pc.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.findAllUsers();
    }

    @Override
    public int insertUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public int delUser(long id) {
        return userDao.delByUserId(id);
    }
}
