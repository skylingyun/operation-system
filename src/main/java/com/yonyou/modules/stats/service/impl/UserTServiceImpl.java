package com.yonyou.modules.stats.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yonyou.modules.stats.dao.UserTDao;
import com.yonyou.modules.stats.entity.UserTEntity;
import com.yonyou.modules.stats.service.UserTService;



@Service("userTService")
public class UserTServiceImpl implements UserTService {
	@Autowired
	private UserTDao userTDao;
	
	@Override
	public UserTEntity queryObject(Integer id){
		return userTDao.queryObject(id);
	}
	
	@Override
	public List<UserTEntity> queryList(Map<String, Object> map){
		return userTDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userTDao.queryTotal(map);
	}
	
	@Override
	public void save(UserTEntity userT){
		userTDao.save(userT);
	}
	
	@Override
	public void update(UserTEntity userT){
		userTDao.update(userT);
	}
	
	@Override
	public void delete(Integer id){
		userTDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		userTDao.deleteBatch(ids);
	}
	
}
