package com.wisdom.soundservice.service.impl;
import java.util.HashMap;
import java.util.List;

import com.wisdom.soundservice.dao.RoleMapper;
import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.pojo.Role;
import com.wisdom.util.numutil.UUIDutil;
import com.wisdom.util.numutil.dateUtil;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.wisdom.sound.service.RoleService;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@DubboService
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Role> findAll() {
		return (List<Role>) roleMapper.findAll();
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Role> page=   (Page<Role>) roleMapper.findAll();
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Role role) {
		role.setRoleId(UUIDutil.getUUID());
		role.setRoleCreattime(dateUtil.getDate());
		role.setRoleEdittime(dateUtil.getDate());
		roleMapper.insert(role);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Role role){
		roleMapper.updateByPrimaryKeySelective(role);
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
	
	/**
	 * 功能描述 : 按照参数查询并分页显示
	 * 参数 :[role, pageNum, pageSize] :
	 * @return com.wisdom.sound.entity.PageResult
	 * @date  2022/3/15
	 * @author  liuwisdom
	 */
	@Override
	public PageResult findPage(Role role, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<Role> page=   (Page<Role>) roleMapper.selectByExample(role);
		return new PageResult(page.getTotal(), page.getResult());
	}
	/**
	 * 功能描述 回显多选下拉列表
	 * 参数 :[] :
	 * @return java.util.List<com.wisdom.sound.pojo.Role>
	 * @date  2022/3/15
	 * @author  liuwisdom
	 */
	@Override
	public List<HashMap<String, String>> findForSelect2() {

		return roleMapper.findForSelect2();
	}

}
