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

import com.yonyou.modules.stats.entity.NodeTravelEntity;
import com.yonyou.modules.stats.service.NodeTravelService;


/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
@RestController
@RequestMapping("nodetravel")
public class NodeTravelController {
	@Autowired
	private NodeTravelService nodeTravelService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("nodetravel:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<NodeTravelEntity> nodeTravelList = nodeTravelService.queryList(query);
		int total = nodeTravelService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(nodeTravelList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("nodetravel:info")
	public R info(@PathVariable("id") Integer id){
		NodeTravelEntity nodeTravel = nodeTravelService.queryObject(id);
		
		return R.ok().put("nodeTravel", nodeTravel);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("nodetravel:save")
	public R save(@RequestBody NodeTravelEntity nodeTravel){
		nodeTravelService.save(nodeTravel);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("nodetravel:update")
	public R update(@RequestBody NodeTravelEntity nodeTravel){
		nodeTravelService.update(nodeTravel);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("nodetravel:delete")
	public R delete(@RequestBody Integer[] ids){
		nodeTravelService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
