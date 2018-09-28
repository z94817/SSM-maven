package com.boduo.service;

import com.boduo.dao.mapper.UserMapper;
import com.boduo.inter.textService;
import com.boduo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class textServiceImpl implements textService {
    @Autowired
    private UserMapper um;

    @Override
    public User go() {
        System.out.println("进入Service");
        User user = um.selectByPrimaryKey(1);
        System.out.println("出去dao");
        return user;
    }
}