package com.service;

import com.pojo.User;
import com.pojo.UserExample;

import java.util.List;

/**
 * @Author:Fengxutong
 * @Date:2019/12/29
 * @Description:小冯同学写点注释吧！
 */
public interface UserService {
    Integer addUser(User user);
    Integer delUser(Integer id);
    Integer updUser(User user,UserExample userExample);
    List<User> seluser(String userName);
}
