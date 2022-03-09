package com.wisdom.soundservice.dao;

import com.wisdom.sound.pojo.Resource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ResourceMapper {
    int deleteByPrimaryKey(String resourceId);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(String resourceId);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

    List<Resource> selectByExample(Object o);
}