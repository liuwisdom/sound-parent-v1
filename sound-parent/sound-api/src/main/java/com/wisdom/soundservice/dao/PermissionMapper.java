package com.wisdom.soundservice.dao;

import com.wisdom.sound.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PermissionMapper {
    int deleteByPrimaryKey(String permissionId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(String permissionId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    List<Permission> selectByExample(Object o);
}