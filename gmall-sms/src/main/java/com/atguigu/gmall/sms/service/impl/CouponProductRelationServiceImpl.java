package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.CouponProductRelationDao;
import com.atguigu.gmall.sms.entity.CouponProductRelationEntity;
import com.atguigu.gmall.sms.service.CouponProductRelationService;


@Service("couponProductRelationService")
public class CouponProductRelationServiceImpl extends ServiceImpl<CouponProductRelationDao, CouponProductRelationEntity> implements CouponProductRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CouponProductRelationEntity> page = this.page(
                new Query<CouponProductRelationEntity>().getPage(params),
                new QueryWrapper<CouponProductRelationEntity>()
        );

        return new PageVo(page);
    }

}