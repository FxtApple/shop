package com.dao;

import com.mapper.UserMapper;
import com.pojo.User;
import com.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:Fengxutong
 * @Date:2019/12/29
 * @Description:小冯同学写点注释吧！
 */
@Repository
public class UserDao {
    @Autowired
    UserMapper userMapper;
    UserExample userExample;
    /**
     * 添加用户
     * */
    public Integer addUser(User user) {
        Integer result = userMapper.insert(user);
        return result;
    }

    /**
    * 根据id删除用户
    * */
    public Integer deleteUser(Integer id){
        return userMapper.deleteByPrimaryKey(id);
    }


    /**
     * 根据username修改昵称
     * */
    public Integer updateUser(User user,UserExample userExample)
    {
        return userMapper.updateByExampleSelective(user,userExample);
    }

    /**
     * 根据昵称模糊查询用户
     * @param name
     * @return
     */
    public List<User> selectUser(String name){
        userExample.createCriteria().andNickNameLike("%" + name + "%");
        return userMapper.selectByExample(userExample);
    }

}
