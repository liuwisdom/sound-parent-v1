package com.wisdom.soundweb.controller;

import com.wisdom.sound.entity.Result;
import com.wisdom.sound.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: sound-parent
 * @package: com.wisdom.soundweb.controller
 * @description: www.wisdom.com
 * @author: liuwisdom
 * @create: 2022-03-08 09:26
 * @company: PJ chain
 **/
@Controller
@RequestMapping("/sound")
public class loginController {
    @RequestMapping("/login")
    public String login(User user){
       // System.out.println(user.getUserPhone());
        return "/admin/index";
    }
}
