package com.wisdom.soundservice.service.impl;
import java.util.List;
import java.util.Map;

import com.wisdom.soundservice.dao.PermissionMapper;
import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.pojo.Permission;
import com.wisdom.util.numutil.UUIDutil;
import com.wisdom.util.numutil.dateUtil;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.wisdom.sound.service.PermissionService;



/**
 * 服务实现层
 * @author Administrator
 *
 */
@DubboService
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private PermissionMapper permissionMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Permission> findAll() {
		return permissionMapper.findAll();
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Permission> page=   (Page<Permission>) permissionMapper.findAll();
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Permission permission) {
		permission.setPermissionId(UUIDutil.getUUID());
		permission.setPermissionCreattime(dateUtil.getDate());
		permission.setPermissionEdittime(dateUtil.getDate());
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
		Page<Permission> page=   (Page<Permission>) permissionMapper.selectByExample(permission);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public List<Map> findForSelect2() {
		return permissionMapper.findForSelect2();
	}

}
