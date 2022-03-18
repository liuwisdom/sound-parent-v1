package com.wisdom.soundweb.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.entity.Result;
import com.wisdom.sound.pojo.Group;
import com.wisdom.util.numutil.UUIDutil;
import com.wisdom.util.numutil.dateUtil;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.wisdom.sound.service.GroupService;


/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("group")
public class GroupController {

	@DubboReference
	private GroupService GroupServiceImpl;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Group> findAll(){
		return GroupServiceImpl.findAll();
	}
	@RequestMapping("/groupList")
	@ResponseBody
	public  List<HashMap<String,String>> groupList(){

		List<HashMap<String,String>> groups = GroupServiceImpl.selectForSelect2();
		return groups;
	}

//	@RequestMapping("/test")
//	public Group test(){
//		return GroupServiceImpl.test();
//	}

	@RequestMapping("/togroup")
	public String togroup(){
		return "/admin/group";
	}

	@RequestMapping("/tohome")
	public String tohome(){
		return "/admin/home";
	}

	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	@ResponseBody
	public PageResult findPage(int page, int rows){

		return GroupServiceImpl.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param group
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public Result add(@RequestBody Group group){
		try {
			group.setGroupId(UUIDutil.getUUID());
			group.setGroupCreattime(dateUtil.getDate());

			GroupServiceImpl.add(group);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param group
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public Result update(@RequestBody Group group){
		try {
			GroupServiceImpl.update(group);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param
	 * @return
	 */
	@RequestMapping("/findOne")
	@ResponseBody
	public Group findOne(String  groupId){
		return GroupServiceImpl.findOne(groupId);
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
			GroupServiceImpl.delete(ids);
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
	public PageResult search(@RequestBody Group group, int page, int rows  ){

		return GroupServiceImpl.findPage(group, page, rows);
	}
	
}
