package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.HomeBrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页推荐品牌表
 * 
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:41
 */
@Mapper
public interface HomeBrandDao extends BaseMapper<HomeBrandEntity> {
	
}