package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.HomeRecommendSubjectDao;
import com.atguigu.gmall.sms.entity.HomeRecommendSubjectEntity;
import com.atguigu.gmall.sms.service.HomeRecommendSubjectService;


@Service("homeRecommendSubjectService")
public class HomeRecommendSubjectServiceImpl extends ServiceImpl<HomeRecommendSubjectDao, HomeRecommendSubjectEntity> implements HomeRecommendSubjectService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeRecommendSubjectEntity> page = this.page(
                new Query<HomeRecommendSubjectEntity>().getPage(params),
                new QueryWrapper<HomeRecommendSubjectEntity>()
        );

        return new PageVo(page);
    }

}