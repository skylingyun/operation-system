package com.yonyou.modules.stats.service;

import com.yonyou.modules.stats.entity.NodePaymentEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
public interface NodePaymentService {
	
	NodePaymentEntity queryObject(Integer id);
	
	List<NodePaymentEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(NodePaymentEntity nodePayment);
	
	void update(NodePaymentEntity nodePayment);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
