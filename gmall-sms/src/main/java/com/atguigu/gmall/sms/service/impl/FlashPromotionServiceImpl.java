package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.FlashPromotionDao;
import com.atguigu.gmall.sms.entity.FlashPromotionEntity;
import com.atguigu.gmall.sms.service.FlashPromotionService;


@Service("flashPromotionService")
public class FlashPromotionServiceImpl extends ServiceImpl<FlashPromotionDao, FlashPromotionEntity> implements FlashPromotionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FlashPromotionEntity> page = this.page(
                new Query<FlashPromotionEntity>().getPage(params),
                new QueryWrapper<FlashPromotionEntity>()
        );

        return new PageVo(page);
    }

}