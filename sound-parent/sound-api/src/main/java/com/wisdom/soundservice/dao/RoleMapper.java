package com.wisdom.soundservice.dao;

import com.wisdom.sound.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    Object selectByExample(Object o);
}