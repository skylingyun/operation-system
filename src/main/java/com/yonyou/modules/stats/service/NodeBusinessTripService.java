package com.yonyou.modules.stats.service;

import com.yonyou.modules.stats.entity.NodeBusinessTripEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
public interface NodeBusinessTripService {
	
	NodeBusinessTripEntity queryObject(Integer id);
	
	List<NodeBusinessTripEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(NodeBusinessTripEntity nodeBusinessTrip);
	
	void update(NodeBusinessTripEntity nodeBusinessTrip);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
