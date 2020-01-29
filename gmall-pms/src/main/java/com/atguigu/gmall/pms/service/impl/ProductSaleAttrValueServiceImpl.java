package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.ProductSaleAttrValueDao;
import com.atguigu.gmall.pms.entity.ProductSaleAttrValueEntity;
import com.atguigu.gmall.pms.service.ProductSaleAttrValueService;


@Service("productSaleAttrValueService")
public class ProductSaleAttrValueServiceImpl extends ServiceImpl<ProductSaleAttrValueDao, ProductSaleAttrValueEntity> implements ProductSaleAttrValueService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductSaleAttrValueEntity> page = this.page(
                new Query<ProductSaleAttrValueEntity>().getPage(params),
                new QueryWrapper<ProductSaleAttrValueEntity>()
        );

        return new PageVo(page);
    }

}