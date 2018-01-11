package com.yonyou.common.annotation;

import java.lang.annotation.*;

/**
 * 数据过滤
 *
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018/1/6 14:20
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataFilter {
    /**  表的别名 */
    String tableAlias() default  "";

    /**  true：没有本部门数据权限，也能查询本人数据 */
    boolean user() default true;
}
