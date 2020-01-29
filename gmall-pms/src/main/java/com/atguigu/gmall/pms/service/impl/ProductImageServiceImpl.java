package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.ProductImageDao;
import com.atguigu.gmall.pms.entity.ProductImageEntity;
import com.atguigu.gmall.pms.service.ProductImageService;


@Service("productImageService")
public class ProductImageServiceImpl extends ServiceImpl<ProductImageDao, ProductImageEntity> implements ProductImageService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductImageEntity> page = this.page(
                new Query<ProductImageEntity>().getPage(params),
                new QueryWrapper<ProductImageEntity>()
        );

        return new PageVo(page);
    }

}