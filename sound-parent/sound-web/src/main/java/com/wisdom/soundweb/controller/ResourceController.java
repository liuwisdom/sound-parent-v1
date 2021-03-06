package com.wisdom.soundweb.controller;
import java.util.HashMap;
import java.util.List;

import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.entity.Result;
import com.wisdom.sound.pojo.Resource;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;

import com.wisdom.sound.service.ResourceService;


/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/resource")
public class ResourceController {

	@DubboReference
	private ResourceService resourceService;

	@RequestMapping("/toresource")
	public String toresource(){
		return "/admin/resource";
	}
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findAll")
	public List<Resource> findAll(){
		return resourceService.findAll();
	}
	@ResponseBody
	@RequestMapping("/findForSelect2")
	public List<HashMap<String,String>> findForSelect2(){
		return resourceService.findForSelect2();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return resourceService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param resource
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/add")
	public Result add(@RequestBody Resource resource){
		try {
			resourceService.add(resource);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param resource
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/update")
	public Result update(@RequestBody Resource resource){
		try {
			resourceService.update(resource);
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
	public Resource findOne(String  id){
		return resourceService.findOne(id);		
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
			resourceService.delete(ids);
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
	public PageResult search(@RequestBody Resource resource, int page, int rows  ){
		return resourceService.findPage(resource, page, rows);		
	}
	
}
