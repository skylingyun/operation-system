package com.yonyou.modules.stats.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yonyou.modules.stats.dao.NodeHotelDao;
import com.yonyou.modules.stats.entity.NodeHotelEntity;
import com.yonyou.modules.stats.service.NodeHotelService;



@Service("nodeHotelService")
public class NodeHotelServiceImpl implements NodeHotelService {
	@Autowired
	private NodeHotelDao nodeHotelDao;
	
	@Override
	public NodeHotelEntity queryObject(Integer id){
		return nodeHotelDao.queryObject(id);
	}
	
	@Override
	public List<NodeHotelEntity> queryList(Map<String, Object> map){
		return nodeHotelDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return nodeHotelDao.queryTotal(map);
	}
	
	@Override
	public void save(NodeHotelEntity nodeHotel){
		nodeHotelDao.save(nodeHotel);
	}
	
	@Override
	public void update(NodeHotelEntity nodeHotel){
		nodeHotelDao.update(nodeHotel);
	}
	
	@Override
	public void delete(Integer id){
		nodeHotelDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		nodeHotelDao.deleteBatch(ids);
	}
	
}
