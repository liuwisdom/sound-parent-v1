package com.wisdom.soundservice.dao;

import com.wisdom.sound.pojo.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserRoleMapper {
    int deleteByPrimaryKey(String userRoleId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(String userRoleId);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

    List<Map> findRoleOfUser(String id);
}