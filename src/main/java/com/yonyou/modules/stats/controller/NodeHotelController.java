package com.yonyou.modules.stats.controller;

import com.yonyou.common.utils.PageUtils;
import com.yonyou.common.utils.Query;
import com.yonyou.common.utils.R;
import com.yonyou.modules.stats.entity.NodeHotelEntity;
import com.yonyou.modules.stats.service.NodeHotelService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;



/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
@RestController
@RequestMapping("nodehotel")
public class NodeHotelController {
	@Autowired
	private NodeHotelService nodeHotelService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("nodehotel:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<NodeHotelEntity> nodeHotelList = nodeHotelService.queryList(query);
		int total = nodeHotelService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(nodeHotelList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("nodehotel:info")
	public R info(@PathVariable("id") Integer id){
		NodeHotelEntity nodeHotel = nodeHotelService.queryObject(id);
		
		return R.ok().put("nodeHotel", nodeHotel);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("nodehotel:save")
	public R save(@RequestBody NodeHotelEntity nodeHotel){
		nodeHotelService.save(nodeHotel);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("nodehotel:update")
	public R update(@RequestBody NodeHotelEntity nodeHotel){
		nodeHotelService.update(nodeHotel);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("nodehotel:delete")
	public R delete(@RequestBody Integer[] ids){
		nodeHotelService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
