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

import com.atguigu.gmall.sms.entity.CouponProductRelationEntity;
import com.atguigu.gmall.sms.service.CouponProductRelationService;




/**
 * 优惠券和产品的关系表
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:40
 */
@Api(tags = "优惠券和产品的关系表 管理")
@RestController
@RequestMapping("sms/couponproductrelation")
public class CouponProductRelationController {
    @Autowired
    private CouponProductRelationService couponProductRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:couponproductrelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = couponProductRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:couponproductrelation:info')")
    public Resp<CouponProductRelationEntity> info(@PathVariable("id") Long id){
		CouponProductRelationEntity couponProductRelation = couponProductRelationService.getById(id);

        return Resp.ok(couponProductRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:couponproductrelation:save')")
    public Resp<Object> save(@RequestBody CouponProductRelationEntity couponProductRelation){
		couponProductRelationService.save(couponProductRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:couponproductrelation:update')")
    public Resp<Object> update(@RequestBody CouponProductRelationEntity couponProductRelation){
		couponProductRelationService.updateById(couponProductRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:couponproductrelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		couponProductRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
