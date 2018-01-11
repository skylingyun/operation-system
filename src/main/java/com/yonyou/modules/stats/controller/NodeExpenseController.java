package com.yonyou.modules.stats.controller;

import java.util.List;
import java.util.Map;

import com.yonyou.common.utils.PageUtils;
import com.yonyou.common.utils.Query;
import com.yonyou.common.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.modules.stats.entity.NodeExpenseEntity;
import com.yonyou.modules.stats.service.NodeExpenseService;


/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
@RestController
@RequestMapping("nodeexpense")
public class NodeExpenseController {
	@Autowired
	private NodeExpenseService nodeExpenseService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("nodeexpense:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<NodeExpenseEntity> nodeExpenseList = nodeExpenseService.queryList(query);
		int total = nodeExpenseService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(nodeExpenseList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("nodeexpense:info")
	public R info(@PathVariable("id") Integer id){
		NodeExpenseEntity nodeExpense = nodeExpenseService.queryObject(id);
		
		return R.ok().put("nodeExpense", nodeExpense);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("nodeexpense:save")
	public R save(@RequestBody NodeExpenseEntity nodeExpense){
		nodeExpenseService.save(nodeExpense);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("nodeexpense:update")
	public R update(@RequestBody NodeExpenseEntity nodeExpense){
		nodeExpenseService.update(nodeExpense);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("nodeexpense:delete")
	public R delete(@RequestBody Integer[] ids){
		nodeExpenseService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
