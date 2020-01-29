package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.HomeRecommendProductEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 人气推荐商品表
 * 
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:41
 */
@Mapper
public interface HomeRecommendProductDao extends BaseMapper<HomeRecommendProductEntity> {
	
}
