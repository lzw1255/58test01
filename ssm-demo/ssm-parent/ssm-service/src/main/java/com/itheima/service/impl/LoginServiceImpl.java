package com.itheima.service.impl;

import com.itheima.dao.LoginMapper;
import com.itheima.domain.User;
import com.itheima.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author LZW
 * @DATA 2019/4/26 10:41
 * @Version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;


    @Override
    public User list(User user) {
        return loginMapper.list(user);
    }
}
