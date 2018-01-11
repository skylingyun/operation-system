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

import com.yonyou.modules.stats.entity.NodePaymentEntity;
import com.yonyou.modules.stats.service.NodePaymentService;


/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
@RestController
@RequestMapping("nodepayment")
public class NodePaymentController {
	@Autowired
	private NodePaymentService nodePaymentService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("nodepayment:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<NodePaymentEntity> nodePaymentList = nodePaymentService.queryList(query);
		int total = nodePaymentService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(nodePaymentList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("nodepayment:info")
	public R info(@PathVariable("id") Integer id){
		NodePaymentEntity nodePayment = nodePaymentService.queryObject(id);
		
		return R.ok().put("nodePayment", nodePayment);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("nodepayment:save")
	public R save(@RequestBody NodePaymentEntity nodePayment){
		nodePaymentService.save(nodePayment);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("nodepayment:update")
	public R update(@RequestBody NodePaymentEntity nodePayment){
		nodePaymentService.update(nodePayment);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("nodepayment:delete")
	public R delete(@RequestBody Integer[] ids){
		nodePaymentService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
