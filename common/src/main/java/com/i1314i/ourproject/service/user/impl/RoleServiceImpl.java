package com.i1314i.ourproject.service.user.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.mapper.RoleMapper;
import com.i1314i.ourproject.po.ResultMap;

import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.pageHelper.PageBean;
import com.i1314i.ourproject.po.shiro.Role;
import com.i1314i.ourproject.po.shiro.RoleDto;
import com.i1314i.ourproject.po.shiro.UserRole;
import com.i1314i.ourproject.service.user.RoleService;
import com.i1314i.ourproject.utils.Sysmsg.RedisSign;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import net.sf.ehcache.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service("roleServices")
public class RoleServiceImpl implements RoleService {

	private static final Logger log = LoggerFactory.getLogger("adminLogger");

	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private ResultMap resultMap;
	@Autowired
	private IJedisClient jedisClient;
	@Override
	@Transactional(rollbackFor = Exception.class)
	public ResultMap saveRole(RoleDto roleDto) {
		Role role = roleDto;

		if (role.getId() != null) {// 修改
			Role r = roleMapper.getRole(role.getName());
			role.setId(r.getId());
			if (r != null && r.getId() != role.getId()) {
				return resultMap.start().code("200").msg("角色已存在");
//				throw new IllegalArgumentException(role.getName() + "已存在");
			}
			jedisClient.flushlikekey(RedisSign.delPermissionList());
			roleMapper.update(role);
		} else {// 新增
			Role r = roleMapper.getRole(role.getName());
			if (r != null) {
				return resultMap.start().code("200").msg("角色已存在");
//				throw new IllegalArgumentException(role.getName() + "已存在");
			}

			roleMapper.save(role);
			Role r1 = roleMapper.getRole(role.getName());
			role.setId(r1.getId());
			log.debug("新增角色{}", role.getName());
		}
		Role r = roleMapper.getRole(role.getName());
		saveRolePermission(r.getId(), roleDto.getPermissionIds());
		return resultMap.start().code("200").msg("新增角色权限成功");
	}




	/**
	 *
	 * @param roleId
	 * @param permissionIds
	 * @return
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public ResultMap saveRolePermission(Long roleId, List<Long> permissionIds) {
		roleMapper.deleteRolePermission(roleId);
//		jedisClient.flushlikekey(RedisSign.delPermissionList());
		permissionIds.remove(0L);
		if (!CollectionUtils.isEmpty(permissionIds)) {
			roleMapper.saveRolePermission(roleId, permissionIds);
		}
		return resultMap.start().code("200").msg("更新角色权限成功");
	}

	/**
	 * 查询所有角色
	 * @return
	 */
	@Override
	@Cacheable(value = "selectListRoles",key = "#currentPage + #pageSize")
	public Map<String,Object> selectListRoles(PageBean pageBean) {

		PageHelper.startPage(pageBean.getCurrentPage(),pageBean.getPageSize());
		List<Role> list = roleMapper.list(pageBean);
		int nums= roleMapper.count(pageBean);
		Map<String,Object> map=new ConcurrentHashMap<>();
		map.put("recordsTotal",nums);
		map.put("data",list);
		return map;
	}

	@Override
	@Cacheable(value = "selectListRolesPage",key = "#currentPage + #pageSize")
	public PageInfo<Role> selectListRolesPage(PageBean pageBean) {
		PageHelper.startPage(pageBean.getCurrentPage(),pageBean.getPageSize());
		List<Role> list = roleMapper.list(pageBean);
		Collections.sort(list);
		PageInfo<Role> pageInfo = new PageInfo<Role>(list);
		return pageInfo;
	}

//	@CacheEvict(value = {"PermissiomListAll","PermissionListParents","PermissionListByUserId","PermissionListByRoleId","PermissionGetById"})

	/**
	 * 获取用户所有角色
	 * @param user
	 * @return
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	@Cacheable(value = "selectListRolesPage",key = "123")
	public List<Role> getUserRoles(User user) {



		return roleMapper.listByUserId(user.getUserId());
	}

	/**
	 * 删除角色
	 * @param role
	 * @return
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public ResultMap delete(Role role) {
//		jedisClient.flushlikekey(RedisSign.delPermissionList());
		roleMapper.deleteRolePermission(role.getId());
		roleMapper.deleteRoleUser(role.getId());
		roleMapper.delete(role.getId());
		return resultMap.start().code("200").msg("删除用户成功");
	}

	@Override
	public int insertUserRole(UserRole userRole) {
		return roleMapper.insertUserRole(userRole);
	}
	@Transactional(rollbackFor = Exception.class)
	@Override
	public int delUserRole(String usrId) {
		return roleMapper.delUserRole(usrId);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public ResultMap deleteRole(Long id) {
		roleMapper.deleteRolePermission(id);
		roleMapper.deleteRoleUser(id);
		roleMapper.delete(id);
//		jedisClient.flushlikekey(RedisSign.delPermissionList());
		log.debug("删除角色id:{}", id);
		return resultMap.start().code("200").msg("删除角色成功");
	}



}
