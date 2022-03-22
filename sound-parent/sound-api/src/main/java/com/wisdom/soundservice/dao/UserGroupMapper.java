package com.wisdom.soundservice.dao;

import com.wisdom.sound.pojo.Group;
import com.wisdom.sound.pojo.UserGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserGroupMapper {
    int deleteByPrimaryKey(String userGroupId);

    int insert(UserGroup record);

    int insertSelective(UserGroup record);

    UserGroup selectByPrimaryKey(String userGroupId);

    int updateByPrimaryKeySelective(UserGroup record);

    int updateByPrimaryKey(UserGroup record);

    void deleteUserGroupByUserId(String userId);

    List<Map> findGroupOfUser(String userId);
}