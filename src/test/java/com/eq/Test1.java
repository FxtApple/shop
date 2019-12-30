package com.eq;

import com.pojo.User;
import com.pojo.UserExample;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author:Fengxutong
 * @Date:2019/12/29
 * @Description:小冯同学写点注释吧！
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-mapper.xml"})
public class Test1 {
    @Autowired
    UserService userService;

    //添加用户
   /*@Test
    public void addtest(){
        User user = new User();
        user.setUserName("1434389058971");
        user.setAddress("shanxi");
        user.setNickName("2387305017");
        user.setHobby("chiji");
        user.setImgUrl("http://file02.16sucai.com/d/file/2015/0128/8b0f093a8edea9f7e7458406f19098af.jpg");
        user.setPassword("507932874520");
        user.setSex((short) 0);
        Integer result;
       for(int i=0;i<3;i++) {
            result = userService.addUser(user);
            System.out.println(result);
       }
    }*/
   //删除用户
   /* @Test
    public void deltest(){
        Integer result = userService.delUser(2);
        System.out.println(result);
    }*/

    //修改用户
    /*@Test
    public void updtest(){
        User user= new User();
        user.setHobby("chiji5");
        UserExample userExample = new UserExample();
        userExample.createCriteria().andSexEqualTo((short) 1);
        Integer result = userService.updUser(user,userExample);
        System.out.println(result);
    }*/


    //查询用户
    @Test
    public void seltest(){
        String userName = "3873";
        List<User> list = userService.seluser(userName);
        System.out.println(list);
    }

}
