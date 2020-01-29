package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.BaseAttrValueDao;
import com.atguigu.gmall.pms.entity.BaseAttrValueEntity;
import com.atguigu.gmall.pms.service.BaseAttrValueService;


@Service("baseAttrValueService")
public class BaseAttrValueServiceImpl extends ServiceImpl<BaseAttrValueDao, BaseAttrValueEntity> implements BaseAttrValueService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BaseAttrValueEntity> page = this.page(
                new Query<BaseAttrValueEntity>().getPage(params),
                new QueryWrapper<BaseAttrValueEntity>()
        );

        return new PageVo(page);
    }

}