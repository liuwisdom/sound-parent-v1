package com.wisdom.soundweb.controller;
import java.util.HashMap;
import java.util.List;

import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.entity.Result;
import com.wisdom.sound.pojo.Role;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisdom.sound.service.RoleService;


/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/role")
public class RoleController {

	@DubboReference
	private RoleService roleService;

	@RequestMapping("/torole")
	public String torole(){
		return "/admin/role";
	}
	/**
	 * 返回全部列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findAll")
	public List<Role> findAll(){
		return roleService.findAll();
	}
	/**
	 * 返回全部列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findForSelect2")
	public List<HashMap<String, String>> findForSelect2(){
		return roleService.findForSelect2();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return roleService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param role
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/add")
	public Result add(@RequestBody Role role){
		try {
			roleService.add(role);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param role
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/update")
	public Result update(@RequestBody Role role){
		try {
			roleService.update(role);
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
	@ResponseBody
	@RequestMapping("/findOne")
	public Role findOne(String id){
		return roleService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delete")
	public Result delete(String [] ids){
		try {
			roleService.delete(ids);
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
	@ResponseBody
	@RequestMapping("/search")
	public PageResult search(@RequestBody Role role, int page, int rows  ){
		return roleService.findPage(role, page, rows);		
	}
	
}
