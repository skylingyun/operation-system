package com.yonyou.modules.stats.service;

import com.yonyou.modules.stats.entity.UserTEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
public interface UserTService {
	
	UserTEntity queryObject(Integer id);
	
	List<UserTEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserTEntity userT);
	
	void update(UserTEntity userT);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
