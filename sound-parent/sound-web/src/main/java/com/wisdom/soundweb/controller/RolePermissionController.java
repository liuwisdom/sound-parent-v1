package com.wisdom.soundweb.controller;

import com.wisdom.sound.entity.Result;
import com.wisdom.sound.service.RoleService;
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
@RequestMapping("/rolepermission")
public class RolePermissionController {

    @DubboReference
    private RoleService roleService;

    @RequestMapping("/torolepermission")
    public  String torolegroup(){
        return "role-permission";
    }

    @ResponseBody
    @RequestMapping(value = "/addPermission",method = RequestMethod.POST)
    public Result add(@RequestBody Map<String,Object> entitynew){
        try {
            roleService.addRolePermission(entitynew);
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

    /**
     * 查询roleID下的所有组信息
     * @param id roleid
     * @return
     */
    @ResponseBody
    @RequestMapping("/findGroupOfRole")
    public List<Map>  findGroupOfRole(String  id){
        return roleService.findGroupOfRole(id);
    }

    /**
     * 查询roleid下的所有资源信息
     * @param id roleid
     * @return
     */
    @ResponseBody
    @RequestMapping("/findPermissionOfRole")
    public List<Map>  findPermissionOfRole(String  id){
        return roleService.findPermissionOfRole(id);
    }

}
