package com.wisdom.soundweb.controller;

import com.wisdom.sound.entity.Result;
import com.wisdom.sound.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @program: sound-parent
 * @package: com.wisdom.soundweb.controller
 * @description: www.wisdom.com
 * @author: liuwisdom
 * @create: 2022-03-18 15:10
 * @company: PJ chain
 **/
@Controller
@RequestMapping("/userrole")
public class UserRoleController {
    @DubboReference
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/addRole",method = RequestMethod.POST)
    public Result add(@RequestBody Map<String,Object> entitynew){
        try {
            userService.addUserRole(entitynew);
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
    @ResponseBody
    @RequestMapping("/findRoleOfUser")
    public List<Map>  findGroupOfUser(String  id){
        return userService.findRoleOfUser(id);
    }

}
