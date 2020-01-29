package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.HomeNewProductDao;
import com.atguigu.gmall.sms.entity.HomeNewProductEntity;
import com.atguigu.gmall.sms.service.HomeNewProductService;


@Service("homeNewProductService")
public class HomeNewProductServiceImpl extends ServiceImpl<HomeNewProductDao, HomeNewProductEntity> implements HomeNewProductService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeNewProductEntity> page = this.page(
                new Query<HomeNewProductEntity>().getPage(params),
                new QueryWrapper<HomeNewProductEntity>()
        );

        return new PageVo(page);
    }

}