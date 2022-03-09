package com.wisdom.soundservice.dao;

import com.wisdom.sound.pojo.RoleGroup;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleGroupMapper {
    int deleteByPrimaryKey(String roleGroupId);

    int insert(RoleGroup record);

    int insertSelective(RoleGroup record);

    RoleGroup selectByPrimaryKey(String roleGroupId);

    int updateByPrimaryKeySelective(RoleGroup record);

    int updateByPrimaryKey(RoleGroup record);
}