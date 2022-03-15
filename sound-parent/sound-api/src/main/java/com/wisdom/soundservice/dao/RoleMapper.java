package com.wisdom.soundservice.dao;

import com.wisdom.sound.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> findAll();

    /**
     * 功能描述 :按照条件查询并分页
     * 参数 : :record 查询条件role对象
     * @return
     * @date  2022/3/15
     * @author  liuwisdom
     */
    List<Role> selectByExample(Role record);

    /**
     * 功能描述 :多选框下拉内容回显
     * 参数 : :
     * @return
     * @date  2022/3/15
     * @author  liuwisdom
     */
    List<HashMap<String ,String >> findForSelect2();


}