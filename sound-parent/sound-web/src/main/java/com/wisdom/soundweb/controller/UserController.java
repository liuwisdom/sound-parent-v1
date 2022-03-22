package com.wisdom.soundweb.controller;
import java.util.List;

import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.entity.Result;
import com.wisdom.sound.pojo.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;

import com.wisdom.sound.service.UserService;


/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@DubboReference
	private UserService userService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findAll")
	public List<User> findAll(){
		return userService.findAll();
	}

	@RequestMapping("/tousergroup")
	public String tousergroup(){
		return "/admin/user-group";
	}

	@RequestMapping("/touserrole")
	public String touserrole(){
		return "/admin/user-role";
	}
	/**
	 * 返回全部列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return userService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/add")
	public Result add(@RequestBody User user){
		try {
			userService.add(user);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/update")
	public Result update(@RequestBody User user){
		try {
			userService.update(user);
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
	public User findOne(String id){
		return userService.findOne(id);		
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
			userService.delete(ids);
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
	public PageResult search(@RequestBody User user, int page, int rows  ){
		return userService.findPage(user, page, rows);		
	}
	
}
