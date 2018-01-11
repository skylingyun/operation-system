package com.yonyou.modules.stats.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yonyou.modules.stats.dao.NodePaymentDao;
import com.yonyou.modules.stats.entity.NodePaymentEntity;
import com.yonyou.modules.stats.service.NodePaymentService;



@Service("nodePaymentService")
public class NodePaymentServiceImpl implements NodePaymentService {
	@Autowired
	private NodePaymentDao nodePaymentDao;
	
	@Override
	public NodePaymentEntity queryObject(Integer id){
		return nodePaymentDao.queryObject(id);
	}
	
	@Override
	public List<NodePaymentEntity> queryList(Map<String, Object> map){
		return nodePaymentDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return nodePaymentDao.queryTotal(map);
	}
	
	@Override
	public void save(NodePaymentEntity nodePayment){
		nodePaymentDao.save(nodePayment);
	}
	
	@Override
	public void update(NodePaymentEntity nodePayment){
		nodePaymentDao.update(nodePayment);
	}
	
	@Override
	public void delete(Integer id){
		nodePaymentDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		nodePaymentDao.deleteBatch(ids);
	}
	
}
