package com.yonyou.modules.stats.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.yonyou.modules.stats.dao.NodeExpenseDao;
import com.yonyou.modules.stats.entity.NodeExpenseEntity;
import com.yonyou.modules.stats.service.NodeExpenseService;



@Service("nodeExpenseService")
public class NodeExpenseServiceImpl implements NodeExpenseService {
	@Autowired
	private NodeExpenseDao nodeExpenseDao;
	
	@Override
	public NodeExpenseEntity queryObject(Integer id){
		return nodeExpenseDao.queryObject(id);
	}
	
	@Override
	public List<NodeExpenseEntity> queryList(Map<String, Object> map){
		return nodeExpenseDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return nodeExpenseDao.queryTotal(map);
	}
	
	@Override
	public void save(NodeExpenseEntity nodeExpense){
		nodeExpenseDao.save(nodeExpense);
	}
	
	@Override
	public void update(NodeExpenseEntity nodeExpense){
		nodeExpenseDao.update(nodeExpense);
	}
	
	@Override
	public void delete(Integer id){
		nodeExpenseDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		nodeExpenseDao.deleteBatch(ids);
	}
	
}
