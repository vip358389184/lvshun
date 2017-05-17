package com.lvshun.biz;

import com.lvshun.po.Users;
import com.lvshun.vo.User;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by 宝龙 on 2017/4/19.
 */
public interface UserBiz {
    //注册用户
    public int addUser(User user);

    //登录
    public  int selectlogin(User user);

    //查询全部用户
    public List<Users> findAll();
    public Long getTotal(Map<String, Object> map);
    //查询用户详细
    public Users getById(String id);
    //删除用户
    public int delete(String id);
    //修改用户
    public int update(Users user);
}
