package com.yonyou.modules.stats.service;

import com.yonyou.modules.stats.entity.NodeOtherEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:19:59
 */
public interface NodeOtherService {
	
	NodeOtherEntity queryObject(Integer id);
	
	List<NodeOtherEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(NodeOtherEntity nodeOther);
	
	void update(NodeOtherEntity nodeOther);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
