package com.yonyou.modules.stats.service;

import com.yonyou.modules.stats.entity.NodeEatingEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
public interface NodeEatingService {
	
	NodeEatingEntity queryObject(Integer id);
	
	List<NodeEatingEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(NodeEatingEntity nodeEating);
	
	void update(NodeEatingEntity nodeEating);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
