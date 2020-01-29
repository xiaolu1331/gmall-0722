package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.HomeRecommendProductDao;
import com.atguigu.gmall.sms.entity.HomeRecommendProductEntity;
import com.atguigu.gmall.sms.service.HomeRecommendProductService;


@Service("homeRecommendProductService")
public class HomeRecommendProductServiceImpl extends ServiceImpl<HomeRecommendProductDao, HomeRecommendProductEntity> implements HomeRecommendProductService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeRecommendProductEntity> page = this.page(
                new Query<HomeRecommendProductEntity>().getPage(params),
                new QueryWrapper<HomeRecommendProductEntity>()
        );

        return new PageVo(page);
    }

}