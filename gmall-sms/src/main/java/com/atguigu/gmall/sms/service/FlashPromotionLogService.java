package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.FlashPromotionLogEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 限时购通知记录
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:40
 */
public interface FlashPromotionLogService extends IService<FlashPromotionLogEntity> {

    PageVo queryPage(QueryCondition params);
}

