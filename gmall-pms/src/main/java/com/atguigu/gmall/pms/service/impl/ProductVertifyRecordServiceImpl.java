package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.ProductVertifyRecordDao;
import com.atguigu.gmall.pms.entity.ProductVertifyRecordEntity;
import com.atguigu.gmall.pms.service.ProductVertifyRecordService;


@Service("productVertifyRecordService")
public class ProductVertifyRecordServiceImpl extends ServiceImpl<ProductVertifyRecordDao, ProductVertifyRecordEntity> implements ProductVertifyRecordService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductVertifyRecordEntity> page = this.page(
                new Query<ProductVertifyRecordEntity>().getPage(params),
                new QueryWrapper<ProductVertifyRecordEntity>()
        );

        return new PageVo(page);
    }

}