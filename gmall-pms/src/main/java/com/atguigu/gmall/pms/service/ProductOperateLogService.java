package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.ProductOperateLogEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-28 23:53:43
 */
public interface ProductOperateLogService extends IService<ProductOperateLogEntity> {

    PageVo queryPage(QueryCondition params);
}

