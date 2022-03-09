package com.wisdom.soundservice.service.impl;
import java.util.List;

import com.wisdom.soundservice.dao.GroupMapper;
import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.pojo.Group;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.wisdom.sound.service.GroupService;



/**
 * 服务实现层
 * @author Administrator
 *
 */
@DubboService
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupMapper groupMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Group> findAll() {
		return groupMapper.findAll();
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Group> page=   (Page<Group>) groupMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Group group) {
		groupMapper.insert(group);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Group group){
		groupMapper.updateByPrimaryKey(group);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Group findOne(String id){
		return groupMapper.selectByPrimaryKey(id);
	}

	@Override
	public Group test() {
		Group group=new Group();
		group.setGroupCode("124521452");
		group.setGroupCreater("liuwisdom");
		group.setGroupId("sdf415515f45155s4fs54");
		return group;
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(String[] ids) {
		for(String id:ids){
			groupMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Group group, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		return null;
	}
	
}
