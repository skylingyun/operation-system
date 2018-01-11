package com.yonyou.modules.job.dao;


import com.yonyou.modules.job.entity.ScheduleJobEntity;
import com.yonyou.modules.sys.dao.BaseDao;

import java.util.Map;

/**
 * 定时任务
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2016年12月1日 下午10:29:57
 */
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
