package com.wisdom.soundweb.controller;

import com.wisdom.sound.entity.Result;
import com.wisdom.sound.service.RoleService;
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
@RequestMapping("/rolegroup")
public class RoleGroupController {

    @DubboReference
    private RoleService roleService;

    @RequestMapping("/torolegroup")
    public  String torolegroup(){
        return "/admin/role-group";
    }

    @ResponseBody
    @RequestMapping(value = "/addGroup",method = RequestMethod.POST)
    public Result add(@RequestBody Map<String,Object> entitynew){
        try {
            roleService.addRoleGroup(entitynew);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }


    /**
     * 批量删除
     * @param roleId
     * @return
     */
    @ResponseBody
    @RequestMapping("/delete")
    public Result delete(String  roleId){
        try {
            roleService.deleteRoleGroupByUserId(roleId);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }
    @ResponseBody
    @RequestMapping("/findGroupOfRole")
    public List<Map>  findGroupOfRole(String  id){
        return roleService.findGroupOfRole(id);
    }

}
