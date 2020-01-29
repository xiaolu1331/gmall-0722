package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.BaseAttrValueEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 属性值表
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-28 23:53:44
 */
public interface BaseAttrValueService extends IService<BaseAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

