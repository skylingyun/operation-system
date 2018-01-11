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

import com.yonyou.modules.stats.entity.NodeBusinessTripEntity;
import com.yonyou.modules.stats.service.NodeBusinessTripService;


/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
@RestController
@RequestMapping("nodebusinesstrip")
public class NodeBusinessTripController {
	@Autowired
	private NodeBusinessTripService nodeBusinessTripService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("nodebusinesstrip:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<NodeBusinessTripEntity> nodeBusinessTripList = nodeBusinessTripService.queryList(query);
		int total = nodeBusinessTripService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(nodeBusinessTripList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("nodebusinesstrip:info")
	public R info(@PathVariable("id") Integer id){
		NodeBusinessTripEntity nodeBusinessTrip = nodeBusinessTripService.queryObject(id);
		
		return R.ok().put("nodeBusinessTrip", nodeBusinessTrip);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("nodebusinesstrip:save")
	public R save(@RequestBody NodeBusinessTripEntity nodeBusinessTrip){
		nodeBusinessTripService.save(nodeBusinessTrip);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("nodebusinesstrip:update")
	public R update(@RequestBody NodeBusinessTripEntity nodeBusinessTrip){
		nodeBusinessTripService.update(nodeBusinessTrip);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("nodebusinesstrip:delete")
	public R delete(@RequestBody Integer[] ids){
		nodeBusinessTripService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
