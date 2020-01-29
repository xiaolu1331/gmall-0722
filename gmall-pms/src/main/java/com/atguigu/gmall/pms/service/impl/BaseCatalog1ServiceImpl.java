package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.BaseCatalog1Dao;
import com.atguigu.gmall.pms.entity.BaseCatalog1Entity;
import com.atguigu.gmall.pms.service.BaseCatalog1Service;


@Service("baseCatalog1Service")
public class BaseCatalog1ServiceImpl extends ServiceImpl<BaseCatalog1Dao, BaseCatalog1Entity> implements BaseCatalog1Service {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BaseCatalog1Entity> page = this.page(
                new Query<BaseCatalog1Entity>().getPage(params),
                new QueryWrapper<BaseCatalog1Entity>()
        );

        return new PageVo(page);
    }

}