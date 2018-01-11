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

import com.yonyou.modules.stats.entity.NodeLoanbillEntity;
import com.yonyou.modules.stats.service.NodeLoanbillService;


/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
@RestController
@RequestMapping("nodeloanbill")
public class NodeLoanbillController {
	@Autowired
	private NodeLoanbillService nodeLoanbillService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("nodeloanbill:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<NodeLoanbillEntity> nodeLoanbillList = nodeLoanbillService.queryList(query);
		int total = nodeLoanbillService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(nodeLoanbillList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("nodeloanbill:info")
	public R info(@PathVariable("id") Integer id){
		NodeLoanbillEntity nodeLoanbill = nodeLoanbillService.queryObject(id);
		
		return R.ok().put("nodeLoanbill", nodeLoanbill);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("nodeloanbill:save")
	public R save(@RequestBody NodeLoanbillEntity nodeLoanbill){
		nodeLoanbillService.save(nodeLoanbill);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("nodeloanbill:update")
	public R update(@RequestBody NodeLoanbillEntity nodeLoanbill){
		nodeLoanbillService.update(nodeLoanbill);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("nodeloanbill:delete")
	public R delete(@RequestBody Integer[] ids){
		nodeLoanbillService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
