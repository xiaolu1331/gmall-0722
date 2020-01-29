package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.CouponProductCategoryRelationDao;
import com.atguigu.gmall.sms.entity.CouponProductCategoryRelationEntity;
import com.atguigu.gmall.sms.service.CouponProductCategoryRelationService;


@Service("couponProductCategoryRelationService")
public class CouponProductCategoryRelationServiceImpl extends ServiceImpl<CouponProductCategoryRelationDao, CouponProductCategoryRelationEntity> implements CouponProductCategoryRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CouponProductCategoryRelationEntity> page = this.page(
                new Query<CouponProductCategoryRelationEntity>().getPage(params),
                new QueryWrapper<CouponProductCategoryRelationEntity>()
        );

        return new PageVo(page);
    }

}