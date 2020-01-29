package com.atguigu.gmall.sms.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gmall.sms.entity.FlashPromotionProductRelationEntity;
import com.atguigu.gmall.sms.service.FlashPromotionProductRelationService;




/**
 * 商品限时购与商品关系表
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:39
 */
@Api(tags = "商品限时购与商品关系表 管理")
@RestController
@RequestMapping("sms/flashpromotionproductrelation")
public class FlashPromotionProductRelationController {
    @Autowired
    private FlashPromotionProductRelationService flashPromotionProductRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:flashpromotionproductrelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = flashPromotionProductRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:flashpromotionproductrelation:info')")
    public Resp<FlashPromotionProductRelationEntity> info(@PathVariable("id") Long id){
		FlashPromotionProductRelationEntity flashPromotionProductRelation = flashPromotionProductRelationService.getById(id);

        return Resp.ok(flashPromotionProductRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:flashpromotionproductrelation:save')")
    public Resp<Object> save(@RequestBody FlashPromotionProductRelationEntity flashPromotionProductRelation){
		flashPromotionProductRelationService.save(flashPromotionProductRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:flashpromotionproductrelation:update')")
    public Resp<Object> update(@RequestBody FlashPromotionProductRelationEntity flashPromotionProductRelation){
		flashPromotionProductRelationService.updateById(flashPromotionProductRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:flashpromotionproductrelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		flashPromotionProductRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
