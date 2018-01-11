package com.yonyou.modules.stats.service;

import com.yonyou.modules.stats.entity.NodeExpenseEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
public interface NodeExpenseService {
	
	NodeExpenseEntity queryObject(Integer id);
	
	List<NodeExpenseEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(NodeExpenseEntity nodeExpense);
	
	void update(NodeExpenseEntity nodeExpense);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
