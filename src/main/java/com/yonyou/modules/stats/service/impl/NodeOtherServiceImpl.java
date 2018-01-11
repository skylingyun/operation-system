package com.yonyou.modules.stats.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yonyou.modules.stats.dao.NodeOtherDao;
import com.yonyou.modules.stats.entity.NodeOtherEntity;
import com.yonyou.modules.stats.service.NodeOtherService;



@Service("nodeOtherService")
public class NodeOtherServiceImpl implements NodeOtherService {
	@Autowired
	private NodeOtherDao nodeOtherDao;
	
	@Override
	public NodeOtherEntity queryObject(Integer id){
		return nodeOtherDao.queryObject(id);
	}
	
	@Override
	public List<NodeOtherEntity> queryList(Map<String, Object> map){
		return nodeOtherDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return nodeOtherDao.queryTotal(map);
	}
	
	@Override
	public void save(NodeOtherEntity nodeOther){
		nodeOtherDao.save(nodeOther);
	}
	
	@Override
	public void update(NodeOtherEntity nodeOther){
		nodeOtherDao.update(nodeOther);
	}
	
	@Override
	public void delete(Integer id){
		nodeOtherDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		nodeOtherDao.deleteBatch(ids);
	}
	
}
