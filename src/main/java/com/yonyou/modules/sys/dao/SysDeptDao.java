package com.yonyou.modules.sys.dao;

import com.yonyou.modules.sys.entity.SysDeptEntity;

import java.util.List;

/**
 * 部门管理
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2017-06-20 15:23:47
 */
public interface SysDeptDao extends BaseDao<SysDeptEntity> {

    /**
     * 查询子部门ID列表
     * @param parentId  上级部门ID
     */
    List<Long> queryDetpIdList(Long parentId);
}
