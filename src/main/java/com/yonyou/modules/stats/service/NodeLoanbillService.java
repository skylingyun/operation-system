package com.yonyou.modules.stats.service;

import com.yonyou.modules.stats.entity.NodeLoanbillEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
public interface NodeLoanbillService {
	
	NodeLoanbillEntity queryObject(Integer id);
	
	List<NodeLoanbillEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(NodeLoanbillEntity nodeLoanbill);
	
	void update(NodeLoanbillEntity nodeLoanbill);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
