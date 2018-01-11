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

import com.yonyou.modules.stats.entity.NodeCommunicateEntity;
import com.yonyou.modules.stats.service.NodeCommunicateService;


/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:19:59
 */
@RestController
@RequestMapping("nodecommunicate")
public class NodeCommunicateController {
	@Autowired
	private NodeCommunicateService nodeCommunicateService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("nodecommunicate:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<NodeCommunicateEntity> nodeCommunicateList = nodeCommunicateService.queryList(query);
		int total = nodeCommunicateService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(nodeCommunicateList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("nodecommunicate:info")
	public R info(@PathVariable("id") Integer id){
		NodeCommunicateEntity nodeCommunicate = nodeCommunicateService.queryObject(id);
		
		return R.ok().put("nodeCommunicate", nodeCommunicate);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("nodecommunicate:save")
	public R save(@RequestBody NodeCommunicateEntity nodeCommunicate){
		nodeCommunicateService.save(nodeCommunicate);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("nodecommunicate:update")
	public R update(@RequestBody NodeCommunicateEntity nodeCommunicate){
		nodeCommunicateService.update(nodeCommunicate);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("nodecommunicate:delete")
	public R delete(@RequestBody Integer[] ids){
		nodeCommunicateService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
