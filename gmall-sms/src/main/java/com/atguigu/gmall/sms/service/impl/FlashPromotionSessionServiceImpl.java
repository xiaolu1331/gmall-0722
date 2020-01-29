package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.FlashPromotionSessionDao;
import com.atguigu.gmall.sms.entity.FlashPromotionSessionEntity;
import com.atguigu.gmall.sms.service.FlashPromotionSessionService;


@Service("flashPromotionSessionService")
public class FlashPromotionSessionServiceImpl extends ServiceImpl<FlashPromotionSessionDao, FlashPromotionSessionEntity> implements FlashPromotionSessionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FlashPromotionSessionEntity> page = this.page(
                new Query<FlashPromotionSessionEntity>().getPage(params),
                new QueryWrapper<FlashPromotionSessionEntity>()
        );

        return new PageVo(page);
    }

}