package com.wisdom.sound.service;
import java.util.HashMap;
import java.util.List;


import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.pojo.Resource;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ResourceService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Resource> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Resource resource);
	
	
	/**
	 * 修改
	 */
	public void update(Resource resource);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Resource findOne(String id);
	
	
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
	public PageResult findPage(Resource resource, int pageNum, int pageSize);

	List<HashMap<String, String>> findForSelect2();
}
