package com.atguigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.BaseAttrInfoDao;
import com.atguigu.gmall.pms.entity.BaseAttrInfoEntity;
import com.atguigu.gmall.pms.service.BaseAttrInfoService;


@Service("baseAttrInfoService")
public class BaseAttrInfoServiceImpl extends ServiceImpl<BaseAttrInfoDao, BaseAttrInfoEntity> implements BaseAttrInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<BaseAttrInfoEntity> page = this.page(
                new Query<BaseAttrInfoEntity>().getPage(params),
                new QueryWrapper<BaseAttrInfoEntity>()
        );

        return new PageVo(page);
    }

}