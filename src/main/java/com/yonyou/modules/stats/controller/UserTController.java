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

import com.yonyou.modules.stats.entity.UserTEntity;
import com.yonyou.modules.stats.service.UserTService;


/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
@RestController
@RequestMapping("usert")
public class UserTController {
	@Autowired
	private UserTService userTService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("usert:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<UserTEntity> userTList = userTService.queryList(query);
		int total = userTService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(userTList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("usert:info")
	public R info(@PathVariable("id") Integer id){
		UserTEntity userT = userTService.queryObject(id);
		
		return R.ok().put("userT", userT);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("usert:save")
	public R save(@RequestBody UserTEntity userT){
		userTService.save(userT);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("usert:update")
	public R update(@RequestBody UserTEntity userT){
		userTService.update(userT);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("usert:delete")
	public R delete(@RequestBody Integer[] ids){
		userTService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
