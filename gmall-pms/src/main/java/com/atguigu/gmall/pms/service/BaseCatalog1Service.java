package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.BaseCatalog1Entity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 一级分类表
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-28 23:53:44
 */
public interface BaseCatalog1Service extends IService<BaseCatalog1Entity> {

    PageVo queryPage(QueryCondition params);
}

