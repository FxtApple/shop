package com.service.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.pojo.UserExample;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Fengxutong
 * @Date:2019/12/29
 * @Description:小冯同学写点注释吧！
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public Integer addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public Integer delUser(Integer id) {
        return userDao.deleteUser(id);
    }

    @Override
    public Integer updUser(User user, UserExample userExample) {
        return userDao.updateUser(user,userExample);
    }

    @Override
    public List<User> seluser(String userName) {
        return userDao.selectUser(userName);
    }
}
