package com.yonyou.modules.stats.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yonyou.modules.stats.dao.NodeTravelDao;
import com.yonyou.modules.stats.entity.NodeTravelEntity;
import com.yonyou.modules.stats.service.NodeTravelService;



@Service("nodeTravelService")
public class NodeTravelServiceImpl implements NodeTravelService {
	@Autowired
	private NodeTravelDao nodeTravelDao;
	
	@Override
	public NodeTravelEntity queryObject(Integer id){
		return nodeTravelDao.queryObject(id);
	}
	
	@Override
	public List<NodeTravelEntity> queryList(Map<String, Object> map){
		return nodeTravelDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return nodeTravelDao.queryTotal(map);
	}
	
	@Override
	public void save(NodeTravelEntity nodeTravel){
		nodeTravelDao.save(nodeTravel);
	}
	
	@Override
	public void update(NodeTravelEntity nodeTravel){
		nodeTravelDao.update(nodeTravel);
	}
	
	@Override
	public void delete(Integer id){
		nodeTravelDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		nodeTravelDao.deleteBatch(ids);
	}
	
}
