package com.yonyou.modules.stats.service;

import com.yonyou.modules.stats.entity.NodeCommunicateEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:19:59
 */
public interface NodeCommunicateService {
	
	NodeCommunicateEntity queryObject(Integer id);
	
	List<NodeCommunicateEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(NodeCommunicateEntity nodeCommunicate);
	
	void update(NodeCommunicateEntity nodeCommunicate);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
