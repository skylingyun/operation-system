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

import com.yonyou.modules.stats.entity.NodeEatingEntity;
import com.yonyou.modules.stats.service.NodeEatingService;


/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
@RestController
@RequestMapping("nodeeating")
public class NodeEatingController {
	@Autowired
	private NodeEatingService nodeEatingService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("nodeeating:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<NodeEatingEntity> nodeEatingList = nodeEatingService.queryList(query);
		int total = nodeEatingService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(nodeEatingList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("nodeeating:info")
	public R info(@PathVariable("id") Integer id){
		NodeEatingEntity nodeEating = nodeEatingService.queryObject(id);
		
		return R.ok().put("nodeEating", nodeEating);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("nodeeating:save")
	public R save(@RequestBody NodeEatingEntity nodeEating){
		nodeEatingService.save(nodeEating);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("nodeeating:update")
	public R update(@RequestBody NodeEatingEntity nodeEating){
		nodeEatingService.update(nodeEating);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("nodeeating:delete")
	public R delete(@RequestBody Integer[] ids){
		nodeEatingService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
