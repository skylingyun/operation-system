package com.yonyou.modules.stats.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yonyou.modules.stats.dao.NodeCommunicateDao;
import com.yonyou.modules.stats.entity.NodeCommunicateEntity;
import com.yonyou.modules.stats.service.NodeCommunicateService;



@Service("nodeCommunicateService")
public class NodeCommunicateServiceImpl implements NodeCommunicateService {
	@Autowired
	private NodeCommunicateDao nodeCommunicateDao;
	
	@Override
	public NodeCommunicateEntity queryObject(Integer id){
		return nodeCommunicateDao.queryObject(id);
	}
	
	@Override
	public List<NodeCommunicateEntity> queryList(Map<String, Object> map){
		return nodeCommunicateDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return nodeCommunicateDao.queryTotal(map);
	}
	
	@Override
	public void save(NodeCommunicateEntity nodeCommunicate){
		nodeCommunicateDao.save(nodeCommunicate);
	}
	
	@Override
	public void update(NodeCommunicateEntity nodeCommunicate){
		nodeCommunicateDao.update(nodeCommunicate);
	}
	
	@Override
	public void delete(Integer id){
		nodeCommunicateDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		nodeCommunicateDao.deleteBatch(ids);
	}
	
}
