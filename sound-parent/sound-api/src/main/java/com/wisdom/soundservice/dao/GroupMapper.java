package com.wisdom.soundservice.dao;

import com.wisdom.sound.pojo.Group;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GroupMapper {
    int deleteByPrimaryKey(String groupId);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(String groupId);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);

    List<Group> selectByExample(Object o);

    List<Group> findAll( );
}