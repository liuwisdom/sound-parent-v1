package com.wisdom.sound.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.wisdom.sound.entity.PageResult;
import com.wisdom.sound.pojo.Role;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface RoleService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Role> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Role role);
	
	
	/**
	 * 修改
	 */
	public void update(Role role);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Role findOne(String id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(String[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Role role, int pageNum, int pageSize);
	/**
	 * 功能描述 : 返回所有角色
	 * 参数 :[] :
	 * @return java.util.List<com.wisdom.sound.pojo.Role>
	 * @date  2022/3/15
	 * @author  liuwisdom
	 */
    List<HashMap<String, String>> findForSelect2();

    void addRoleGroup(Map<String, Object> entitynew);

	void deleteRoleGroupByUserId(String roleId);

	List<Map> findGroupOfRole(String id);
}
