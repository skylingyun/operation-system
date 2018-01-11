package com.yonyou.modules.stats.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yonyou.modules.stats.dao.NodeLoanbillDao;
import com.yonyou.modules.stats.entity.NodeLoanbillEntity;
import com.yonyou.modules.stats.service.NodeLoanbillService;



@Service("nodeLoanbillService")
public class NodeLoanbillServiceImpl implements NodeLoanbillService {
	@Autowired
	private NodeLoanbillDao nodeLoanbillDao;
	
	@Override
	public NodeLoanbillEntity queryObject(Integer id){
		return nodeLoanbillDao.queryObject(id);
	}
	
	@Override
	public List<NodeLoanbillEntity> queryList(Map<String, Object> map){
		return nodeLoanbillDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return nodeLoanbillDao.queryTotal(map);
	}
	
	@Override
	public void save(NodeLoanbillEntity nodeLoanbill){
		nodeLoanbillDao.save(nodeLoanbill);
	}
	
	@Override
	public void update(NodeLoanbillEntity nodeLoanbill){
		nodeLoanbillDao.update(nodeLoanbill);
	}
	
	@Override
	public void delete(Integer id){
		nodeLoanbillDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		nodeLoanbillDao.deleteBatch(ids);
	}
	
}
