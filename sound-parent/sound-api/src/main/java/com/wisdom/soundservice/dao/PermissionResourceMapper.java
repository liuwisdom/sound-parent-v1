package com.wisdom.soundservice.dao;

import com.wisdom.sound.pojo.PermissionResource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermissionResourceMapper {
    int deleteByPrimaryKey(String permissionResourceId);

    int insert(PermissionResource record);

    int insertSelective(PermissionResource record);

    PermissionResource selectByPrimaryKey(String permissionResourceId);

    int updateByPrimaryKeySelective(PermissionResource record);

    int updateByPrimaryKey(PermissionResource record);
}