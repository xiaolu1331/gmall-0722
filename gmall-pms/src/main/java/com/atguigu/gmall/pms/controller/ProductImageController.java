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

import com.atguigu.gmall.pms.entity.ProductImageEntity;
import com.atguigu.gmall.pms.service.ProductImageService;




/**
 * 商品图片表
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-28 23:53:43
 */
@Api(tags = "商品图片表 管理")
@RestController
@RequestMapping("pms/productimage")
public class ProductImageController {
    @Autowired
    private ProductImageService productImageService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:productimage:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productImageService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:productimage:info')")
    public Resp<ProductImageEntity> info(@PathVariable("id") Long id){
		ProductImageEntity productImage = productImageService.getById(id);

        return Resp.ok(productImage);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:productimage:save')")
    public Resp<Object> save(@RequestBody ProductImageEntity productImage){
		productImageService.save(productImage);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:productimage:update')")
    public Resp<Object> update(@RequestBody ProductImageEntity productImage){
		productImageService.updateById(productImage);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:productimage:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		productImageService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
