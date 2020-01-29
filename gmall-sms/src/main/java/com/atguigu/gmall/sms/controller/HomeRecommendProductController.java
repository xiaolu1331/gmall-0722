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

import com.atguigu.gmall.sms.entity.HomeRecommendProductEntity;
import com.atguigu.gmall.sms.service.HomeRecommendProductService;




/**
 * 人气推荐商品表
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:41
 */
@Api(tags = "人气推荐商品表 管理")
@RestController
@RequestMapping("sms/homerecommendproduct")
public class HomeRecommendProductController {
    @Autowired
    private HomeRecommendProductService homeRecommendProductService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:homerecommendproduct:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = homeRecommendProductService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:homerecommendproduct:info')")
    public Resp<HomeRecommendProductEntity> info(@PathVariable("id") Long id){
		HomeRecommendProductEntity homeRecommendProduct = homeRecommendProductService.getById(id);

        return Resp.ok(homeRecommendProduct);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:homerecommendproduct:save')")
    public Resp<Object> save(@RequestBody HomeRecommendProductEntity homeRecommendProduct){
		homeRecommendProductService.save(homeRecommendProduct);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:homerecommendproduct:update')")
    public Resp<Object> update(@RequestBody HomeRecommendProductEntity homeRecommendProduct){
		homeRecommendProductService.updateById(homeRecommendProduct);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:homerecommendproduct:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		homeRecommendProductService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
