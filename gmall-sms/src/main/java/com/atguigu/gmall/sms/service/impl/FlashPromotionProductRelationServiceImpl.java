package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.FlashPromotionProductRelationDao;
import com.atguigu.gmall.sms.entity.FlashPromotionProductRelationEntity;
import com.atguigu.gmall.sms.service.FlashPromotionProductRelationService;


@Service("flashPromotionProductRelationService")
public class FlashPromotionProductRelationServiceImpl extends ServiceImpl<FlashPromotionProductRelationDao, FlashPromotionProductRelationEntity> implements FlashPromotionProductRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FlashPromotionProductRelationEntity> page = this.page(
                new Query<FlashPromotionProductRelationEntity>().getPage(params),
                new QueryWrapper<FlashPromotionProductRelationEntity>()
        );

        return new PageVo(page);
    }

}