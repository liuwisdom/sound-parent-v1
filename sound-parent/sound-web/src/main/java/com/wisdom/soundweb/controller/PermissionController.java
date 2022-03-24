package com.wisdom.soundweb.controller;
import java.util.List;
import java.util.Map;

import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.entity.Result;
import com.wisdom.sound.pojo.Permission;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;

import com.wisdom.sound.service.PermissionService;


/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/permission")
public class PermissionController {

	@DubboReference
	private PermissionService permissionService;

	@RequestMapping("/topermission")
	public String topermission(){
		return "/admin/permission";
	}
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Permission> findAll(){
		return permissionService.findAll();
	}
	/**
	 * 初始化父级去权限多选列表
	 * @return
	 */
	@RequestMapping("/findForSelect2")
	@ResponseBody
	public List<Map> findForSelect2(){
		return permissionService.findForSelect2();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	@ResponseBody
	public PageResult findPage(int page, int rows){
		return permissionService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param permission
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public Result add(@RequestBody Permission permission){
		try {
			permissionService.add(permission);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param permission
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public Result update(@RequestBody Permission permission){
		try {
			permissionService.update(permission);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	@ResponseBody
	public Permission findOne(String  id){
		return permissionService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public Result delete(String [] ids){
		try {
			permissionService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	@ResponseBody
	public PageResult search(@RequestBody Permission permission, int page, int rows  ){
		return permissionService.findPage(permission, page, rows);		
	}
	
}
