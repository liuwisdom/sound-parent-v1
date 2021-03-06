package com.wisdom.sound.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.pojo.Group;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface GroupService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Group> findAll();

	public List<HashMap<String,String>> selectForSelect2();
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Group group);
	
	
	/**
	 * 修改
	 */
	public void update(Group group);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Group findOne(String id);


	public Group test();
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(String[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Group group, int pageNum, int pageSize);
	
}
