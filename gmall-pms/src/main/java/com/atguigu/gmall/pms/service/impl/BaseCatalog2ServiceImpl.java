package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.BaseCatalog2Dao;
import com.atguigu.gmall.pms.entity.BaseCatalog2Entity;
import com.atguigu.gmall.pms.service.BaseCatalog2Service;


@Service("baseCatalog2Service")
public class BaseCatalog2ServiceImpl extends ServiceImpl<BaseCatalog2Dao, BaseCatalog2Entity> implements BaseCatalog2Service {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BaseCatalog2Entity> page = this.page(
                new Query<BaseCatalog2Entity>().getPage(params),
                new QueryWrapper<BaseCatalog2Entity>()
        );

        return new PageVo(page);
    }

}