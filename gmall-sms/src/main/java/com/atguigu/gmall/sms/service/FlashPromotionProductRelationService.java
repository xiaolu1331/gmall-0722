package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.FlashPromotionProductRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品限时购与商品关系表
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:39
 */
public interface FlashPromotionProductRelationService extends IService<FlashPromotionProductRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

