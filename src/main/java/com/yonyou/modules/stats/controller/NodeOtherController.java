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

import com.yonyou.modules.stats.entity.NodeOtherEntity;
import com.yonyou.modules.stats.service.NodeOtherService;


/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:19:59
 */
@RestController
@RequestMapping("nodeother")
public class NodeOtherController {
	@Autowired
	private NodeOtherService nodeOtherService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("nodeother:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<NodeOtherEntity> nodeOtherList = nodeOtherService.queryList(query);
		int total = nodeOtherService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(nodeOtherList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("nodeother:info")
	public R info(@PathVariable("id") Integer id){
		NodeOtherEntity nodeOther = nodeOtherService.queryObject(id);
		
		return R.ok().put("nodeOther", nodeOther);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("nodeother:save")
	public R save(@RequestBody NodeOtherEntity nodeOther){
		nodeOtherService.save(nodeOther);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("nodeother:update")
	public R update(@RequestBody NodeOtherEntity nodeOther){
		nodeOtherService.update(nodeOther);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("nodeother:delete")
	public R delete(@RequestBody Integer[] ids){
		nodeOtherService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
