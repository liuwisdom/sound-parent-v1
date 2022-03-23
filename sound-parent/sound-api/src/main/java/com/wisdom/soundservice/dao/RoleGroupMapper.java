package com.wisdom.soundservice.dao;

import com.wisdom.sound.pojo.RoleGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleGroupMapper {
    int deleteByPrimaryKey(String roleGroupId);

    int insert(RoleGroup record);

    int insertSelective(RoleGroup record);

    RoleGroup selectByPrimaryKey(String roleGroupId);

    int updateByPrimaryKeySelective(RoleGroup record);

    int updateByPrimaryKey(RoleGroup record);

    List<Map> findGroupOfRole(String id);
}