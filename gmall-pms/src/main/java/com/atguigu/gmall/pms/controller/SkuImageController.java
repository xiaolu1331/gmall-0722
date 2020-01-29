package com.atguigu.gmall.pms.controller;

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

import com.atguigu.gmall.pms.entity.SkuImageEntity;
import com.atguigu.gmall.pms.service.SkuImageService;




/**
 * 库存单元图片表
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-28 23:53:43
 */
@Api(tags = "库存单元图片表 管理")
@RestController
@RequestMapping("pms/skuimage")
public class SkuImageController {
    @Autowired
    private SkuImageService skuImageService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:skuimage:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = skuImageService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:skuimage:info')")
    public Resp<SkuImageEntity> info(@PathVariable("id") Long id){
		SkuImageEntity skuImage = skuImageService.getById(id);

        return Resp.ok(skuImage);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:skuimage:save')")
    public Resp<Object> save(@RequestBody SkuImageEntity skuImage){
		skuImageService.save(skuImage);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:skuimage:update')")
    public Resp<Object> update(@RequestBody SkuImageEntity skuImage){
		skuImageService.updateById(skuImage);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:skuimage:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		skuImageService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
