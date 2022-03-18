package com.wisdom.soundweb.controller;

import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.entity.Result;
import com.wisdom.sound.pojo.User;
import com.wisdom.sound.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @program: sound-parent
 * @package: com.wisdom.soundweb.controller
 * @description: www.wisdom.com
 * @author: liuwisdom
 * @create: 2022-03-18 15:10
 * @company: PJ chain
 **/
@Controller
@RequestMapping("/usergroup")
public class UserGroupController {
    @DubboReference
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(String[] ids){
        try {

            userService.addUserGroup("11",ids);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }


    /**
     * 批量删除
     * @param userId
     * @return
     */
    @ResponseBody
    @RequestMapping("/delete")
    public Result delete(String  userId){
        try {
            userService.deleteUserGroupByUserId(userId);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

}
