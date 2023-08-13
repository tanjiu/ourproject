package com.i1314i.ourproject.service.user.impl;


import com.alibaba.fastjson.JSON;
import com.i1314i.ourproject.mapper.PermissionMapper;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.service.user.PermissionService;

import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.utils.Sysmsg.RedisSign;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Permission权限模块
 */
@Service("permissionServices")
public class PermissionServiceImpl implements PermissionService {

	private static final Logger log = LoggerFactory.getLogger(PermissionServiceImpl.class);
	@Autowired
	private ResultMap resultMap;
	@Autowired
	private PermissionMapper permissionMapper;
	@Autowired
	private IJedisClient jedisClient;
	@Override
	@Transactional(rollbackFor = Exception.class)
	public ResultMap save(Permission permission) {
		jedisClient.flushlikekey(RedisSign.delPermissionList());
		permissionMapper.save(permission);
		log.debug("新增菜单{}", permission.getName());
		return resultMap.start().code("200").msg("新增菜单成功");
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public ResultMap update(Permission permission) {
//		jedisClient.flushlikekey(RedisSign.delPermissionList());
		permissionMapper.update(permission);
		return resultMap.start().code("200").msg("更新权限成功");
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public ResultMap delete(Long id) {
//		jedisClient.flushlikekey(RedisSign.delPermissionList());
//		jedisClient.flushlikekey(RedisSign.delPermissionList(id));
		permissionMapper.deleteRolePermission(id);
		permissionMapper.delete(id);
		permissionMapper.deleteByParentId(id);

		log.debug("删除菜单id:{}", id);
		return resultMap.start().code("200").msg("删除菜单成功");
	}

	@Override
	public List<Permission> getPermissionListByUserId(User user) {
		String key=RedisSign.getPermissionList(user);
		if(jedisClient.exists(key)){
			return JSON.parseArray(jedisClient.get(key),Permission.class);
		}
			List<Permission>permissionList=permissionMapper.listByUserId(user.getUserId());
//			jedisClient.set(key,JSON.toJSONString(permissionList),60*30);

		return permissionList;
	}

	/**
	 * 动态拦截链
	 * @return
	 */
	@Override
	public List<Permission> findUrlPermissionList() {
		return permissionMapper.findUrlPermissionList();
	}

}
