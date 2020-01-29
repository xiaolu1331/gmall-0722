package com.atguigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.sms.dao.FlashPromotionLogDao;
import com.atguigu.gmall.sms.entity.FlashPromotionLogEntity;
import com.atguigu.gmall.sms.service.FlashPromotionLogService;


@Service("flashPromotionLogService")
public class FlashPromotionLogServiceImpl extends ServiceImpl<FlashPromotionLogDao, FlashPromotionLogEntity> implements FlashPromotionLogService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FlashPromotionLogEntity> page = this.page(
                new Query<FlashPromotionLogEntity>().getPage(params),
                new QueryWrapper<FlashPromotionLogEntity>()
        );

        return new PageVo(page);
    }

}