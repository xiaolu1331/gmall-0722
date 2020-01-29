package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponProductRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券和产品的关系表
 * 
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:40
 */
@Mapper
public interface CouponProductRelationDao extends BaseMapper<CouponProductRelationEntity> {
	
}
