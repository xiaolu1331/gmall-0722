package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.BaseCatalog3Dao;
import com.atguigu.gmall.pms.entity.BaseCatalog3Entity;
import com.atguigu.gmall.pms.service.BaseCatalog3Service;


@Service("baseCatalog3Service")
public class BaseCatalog3ServiceImpl extends ServiceImpl<BaseCatalog3Dao, BaseCatalog3Entity> implements BaseCatalog3Service {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BaseCatalog3Entity> page = this.page(
                new Query<BaseCatalog3Entity>().getPage(params),
                new QueryWrapper<BaseCatalog3Entity>()
        );

        return new PageVo(page);
    }

}