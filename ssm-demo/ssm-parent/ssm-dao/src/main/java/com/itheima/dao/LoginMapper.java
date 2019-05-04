package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

/**
 * @Author LZW
 * @DATA 2019/4/26 10:36
 * @Version 1.0
 */
public interface LoginMapper {

    @Select("select * from s_user where username=#{username} and password=#{password}")
    User list(User user);
}
