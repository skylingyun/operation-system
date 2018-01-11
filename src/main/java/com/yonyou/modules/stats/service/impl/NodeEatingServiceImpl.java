package com.yonyou.modules.stats.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yonyou.modules.stats.dao.NodeEatingDao;
import com.yonyou.modules.stats.entity.NodeEatingEntity;
import com.yonyou.modules.stats.service.NodeEatingService;



@Service("nodeEatingService")
public class NodeEatingServiceImpl implements NodeEatingService {
	@Autowired
	private NodeEatingDao nodeEatingDao;
	
	@Override
	public NodeEatingEntity queryObject(Integer id){
		return nodeEatingDao.queryObject(id);
	}
	
	@Override
	public List<NodeEatingEntity> queryList(Map<String, Object> map){
		return nodeEatingDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return nodeEatingDao.queryTotal(map);
	}
	
	@Override
	public void save(NodeEatingEntity nodeEating){
		nodeEatingDao.save(nodeEating);
	}
	
	@Override
	public void update(NodeEatingEntity nodeEating){
		nodeEatingDao.update(nodeEating);
	}
	
	@Override
	public void delete(Integer id){
		nodeEatingDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		nodeEatingDao.deleteBatch(ids);
	}
	
}
