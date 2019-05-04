package com.itheima.controller;

import com.itheima.domain.Cust;
import com.itheima.domain.User;
import com.itheima.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author LZW
 * @DATA 2019/4/26 10:35
 * @Version 1.0
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/list")
    public String list(User user, Model model){
        User users = loginService.list(user);
        if(users == null){
            model.addAttribute("msg", "账号或密码错误");
            return "login";
        } else {
            model.addAttribute("users", users);
            return "index";
            // return "redirect:/login/center/list";
        }
    }

    /*@RequestMapping("/center/list")
    public String modify(Model model){
        List<Cust> custs = loginService.modify();
        model.addAttribute("custs", custs);
        return "index";
    }*/

}
