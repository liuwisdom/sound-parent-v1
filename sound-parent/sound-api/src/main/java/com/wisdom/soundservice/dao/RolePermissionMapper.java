package com.wisdom.soundservice.dao;

import com.wisdom.sound.pojo.RolePermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RolePermissionMapper {
    int deleteByPrimaryKey(String rolePermissionId);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(String rolePermissionId);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}