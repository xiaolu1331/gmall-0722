package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.HomeBrandDao;
import com.atguigu.gmall.sms.entity.HomeBrandEntity;
import com.atguigu.gmall.sms.service.HomeBrandService;


@Service("homeBrandService")
public class HomeBrandServiceImpl extends ServiceImpl<HomeBrandDao, HomeBrandEntity> implements HomeBrandService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeBrandEntity> page = this.page(
                new Query<HomeBrandEntity>().getPage(params),
                new QueryWrapper<HomeBrandEntity>()
        );

        return new PageVo(page);
    }

}