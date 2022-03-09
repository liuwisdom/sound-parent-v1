package com.wisdom.soundservice.service.impl;
import java.util.List;

import com.wisdom.soundservice.dao.UserMapper;
import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.pojo.User;
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
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<User> findAll() {
		return userMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<User> page=   (Page<User>) userMapper.selectByExample(null);
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
		userMapper.updateByPrimaryKey(user);
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
		
		return null;
	}
	
}
