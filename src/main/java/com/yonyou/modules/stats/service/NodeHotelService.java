package com.yonyou.modules.stats.service;

import com.yonyou.modules.stats.entity.NodeHotelEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
public interface NodeHotelService {
	
	NodeHotelEntity queryObject(Integer id);
	
	List<NodeHotelEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(NodeHotelEntity nodeHotel);
	
	void update(NodeHotelEntity nodeHotel);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
