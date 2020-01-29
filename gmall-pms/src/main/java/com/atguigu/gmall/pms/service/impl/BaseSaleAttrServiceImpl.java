package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.BaseSaleAttrDao;
import com.atguigu.gmall.pms.entity.BaseSaleAttrEntity;
import com.atguigu.gmall.pms.service.BaseSaleAttrService;


@Service("baseSaleAttrService")
public class BaseSaleAttrServiceImpl extends ServiceImpl<BaseSaleAttrDao, BaseSaleAttrEntity> implements BaseSaleAttrService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BaseSaleAttrEntity> page = this.page(
                new Query<BaseSaleAttrEntity>().getPage(params),
                new QueryWrapper<BaseSaleAttrEntity>()
        );

        return new PageVo(page);
    }

}