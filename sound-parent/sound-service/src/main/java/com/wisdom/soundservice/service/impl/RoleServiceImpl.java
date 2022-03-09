package com.wisdom.soundservice.service.impl;
import java.util.List;

import com.wisdom.soundservice.dao.RoleMapper;
import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.wisdom.sound.service.RoleService;



/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Role> findAll() {
		return (List<Role>) roleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Role> page=   (Page<Role>) roleMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Role role) {
		roleMapper.insert(role);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Role role){
		roleMapper.updateByPrimaryKey(role);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Role findOne(String id){
		return roleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] ids) {
		for(String id:ids){
			roleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Role role, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		return null;
	}
	
}
