package com.wisdom.soundservice.service.impl;
import java.util.HashMap;
import java.util.List;

import com.wisdom.soundservice.dao.ResourceMapper;
import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.pojo.Resource;
import com.wisdom.util.numutil.UUIDutil;
import com.wisdom.util.numutil.dateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.wisdom.sound.service.ResourceService;



/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	private ResourceMapper resourceMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Resource> findAll() {
		return resourceMapper.findAll();
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Resource> page=   (Page<Resource>) resourceMapper.findAll();
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Resource resource) {
		resource.setResourceId(UUIDutil.getUUID());
		resource.setResourceCreattime(dateUtil.getDate());
		resource.setResourceEdittime(dateUtil.getDate());
		resourceMapper.insert(resource);
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Resource resource){
		resourceMapper.updateByPrimaryKeySelective(resource);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Resource findOne(String id){
		return resourceMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] ids) {
		for(String id:ids){
			resourceMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Resource resource, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<Resource> page=   (Page<Resource>) resourceMapper.selectByExample(resource);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public List<HashMap<String, String>> findForSelect2() {
		return resourceMapper.findForSelect2();
	}

}
