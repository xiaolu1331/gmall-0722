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

import com.atguigu.gmall.pms.entity.ProductVertifyRecordEntity;
import com.atguigu.gmall.pms.service.ProductVertifyRecordService;




/**
 * 商品审核记录
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-28 23:53:43
 */
@Api(tags = "商品审核记录 管理")
@RestController
@RequestMapping("pms/productvertifyrecord")
public class ProductVertifyRecordController {
    @Autowired
    private ProductVertifyRecordService productVertifyRecordService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:productvertifyrecord:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = productVertifyRecordService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:productvertifyrecord:info')")
    public Resp<ProductVertifyRecordEntity> info(@PathVariable("id") Long id){
		ProductVertifyRecordEntity productVertifyRecord = productVertifyRecordService.getById(id);

        return Resp.ok(productVertifyRecord);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:productvertifyrecord:save')")
    public Resp<Object> save(@RequestBody ProductVertifyRecordEntity productVertifyRecord){
		productVertifyRecordService.save(productVertifyRecord);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:productvertifyrecord:update')")
    public Resp<Object> update(@RequestBody ProductVertifyRecordEntity productVertifyRecord){
		productVertifyRecordService.updateById(productVertifyRecord);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:productvertifyrecord:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		productVertifyRecordService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
