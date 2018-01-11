package com.yonyou.modules.stats.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yonyou.modules.stats.dao.NodeBusinessTripDao;
import com.yonyou.modules.stats.entity.NodeBusinessTripEntity;
import com.yonyou.modules.stats.service.NodeBusinessTripService;



@Service("nodeBusinessTripService")
public class NodeBusinessTripServiceImpl implements NodeBusinessTripService {
	@Autowired
	private NodeBusinessTripDao nodeBusinessTripDao;
	
	@Override
	public NodeBusinessTripEntity queryObject(Integer id){
		return nodeBusinessTripDao.queryObject(id);
	}
	
	@Override
	public List<NodeBusinessTripEntity> queryList(Map<String, Object> map){
		return nodeBusinessTripDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return nodeBusinessTripDao.queryTotal(map);
	}
	
	@Override
	public void save(NodeBusinessTripEntity nodeBusinessTrip){
		nodeBusinessTripDao.save(nodeBusinessTrip);
	}
	
	@Override
	public void update(NodeBusinessTripEntity nodeBusinessTrip){
		nodeBusinessTripDao.update(nodeBusinessTrip);
	}
	
	@Override
	public void delete(Integer id){
		nodeBusinessTripDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		nodeBusinessTripDao.deleteBatch(ids);
	}
	
}
