package com.yonyou.modules.stats.service;

import com.yonyou.modules.stats.entity.NodeTravelEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
public interface NodeTravelService {
	
	NodeTravelEntity queryObject(Integer id);
	
	List<NodeTravelEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(NodeTravelEntity nodeTravel);
	
	void update(NodeTravelEntity nodeTravel);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
