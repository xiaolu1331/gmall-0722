package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.HomeRecommendProductEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 人气推荐商品表
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:41
 */
public interface HomeRecommendProductService extends IService<HomeRecommendProductEntity> {

    PageVo queryPage(QueryCondition params);
}

