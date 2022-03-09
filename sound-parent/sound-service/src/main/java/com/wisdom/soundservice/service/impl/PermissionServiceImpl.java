package com.wisdom.soundservice.service.impl;
import java.util.List;

import com.wisdom.soundservice.dao.PermissionMapper;
import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.pojo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.wisdom.sound.service.PermissionService;



/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private PermissionMapper permissionMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Permission> findAll() {
		return permissionMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Permission> page=   (Page<Permission>) permissionMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Permission permission) {
		permissionMapper.insert(permission);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Permission permission){
		permissionMapper.updateByPrimaryKey(permission);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Permission findOne(String id){
		return permissionMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] ids) {
		for(String id:ids){
			permissionMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Permission permission, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		return null;
	}
	
}
