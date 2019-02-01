package com.grab.unicom.common.controller;


import com.grab.unicom.common.dao.UserMapper;
import com.grab.unicom.common.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/index")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    /**
     * 登录界面
     */
    @RequestMapping("/loginView")
    public String loginView() {
        return "login";
    }

    /**
     * 登录功能
     */

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Model model) {
        String username = user.getUsername();
        String password = user.getPassword();
        //根据用户名查询用户是否存在
        User user1 = userMapper.findByUsername(username);
        //如果存在
        if (user1 != null) {
            if (password.equals(user1.getPassword())) {
                //如果密码正确
                model.addAttribute("user", user1);
                return "index";
            } else {
                //如果密码错误
                System.out.println("密码错误");
                return "error";
            }
        } else {
            //如果不存在
            System.out.println("用户不存在");
            return "error";
        }
    }
    @RequestMapping("/loginOut")
    public String loginOut(){
        return "login";
    }

}
