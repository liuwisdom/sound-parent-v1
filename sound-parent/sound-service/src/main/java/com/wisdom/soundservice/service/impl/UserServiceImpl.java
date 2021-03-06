package com.wisdom.soundservice.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wisdom.sound.pojo.Group;
import com.wisdom.sound.pojo.UserGroup;
import com.wisdom.sound.pojo.UserRole;
import com.wisdom.soundservice.dao.UserGroupMapper;
import com.wisdom.soundservice.dao.UserMapper;
import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.pojo.User;
import com.wisdom.soundservice.dao.UserRoleMapper;
import com.wisdom.util.numutil.UUIDutil;
import com.wisdom.util.numutil.dateUtil;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.wisdom.sound.service.UserService;



/**
 * 服务实现层
 * @author Administrator
 *
 */
@DubboService
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserGroupMapper userGroupMapper;

	@Autowired
	private UserRoleMapper userRoleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<User> page=   (Page<User>) userMapper.findAll();
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(User user) {
		userMapper.insert(user);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(User user){
		userMapper.updateByPrimaryKeySelective(user);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public User findOne(String id){
		return userMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] ids) {
		for(String id:ids){
			userMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	@Override
	public PageResult findPage(User user, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<User> page=   (Page<User>) userMapper.selectByExample(user);
		return new PageResult(page.getTotal(), page.getResult());
	}
    //循环插入user-group中间表
	@Override
	public void addUserGroup(Map<String,Object> entitynew) {
	    List<String> ids= (List<String>) entitynew.get("ids");
	    String userid= (String) entitynew.get("userid");
		for (String id:ids) {
			UserGroup ug=new UserGroup();
			ug.setUserGroupId(UUIDutil.getUUID());
			ug.setUserGroupUserid(userid);
			ug.setUserGroupGroupid(id);
			ug.setUserGroupCreattime(dateUtil.getDate());
			userGroupMapper.insert(ug);
		}

	}

	@Override
	public void deleteUserGroupByUserId(String userId) {
		userGroupMapper.deleteUserGroupByUserId(userId);
	}

	@Override
	public List<Map> findGroupOfUser(String userId) {
		return userGroupMapper.findGroupOfUser(userId);
	}

	@Override
	public void addUserRole(Map<String, Object> entitynew) {
		List<String> ids= (List<String>) entitynew.get("ids");
		String userid= (String) entitynew.get("userid");
		for (String id:ids) {
			UserRole ur=new UserRole();
			ur.setUserRoleId(UUIDutil.getUUID());
			ur.setUserRoleUserid(userid);
			ur.setUserRoleRoleid(id);
			ur.setUserRoleCreattime(dateUtil.getDate());
			ur.setUserRoleEdittime(dateUtil.getDate());
			userRoleMapper.insert(ur);
		}
	}

	@Override
	public List<Map> findRoleOfUser(String id) {
		return userRoleMapper.findRoleOfUser(id);
	}

}
