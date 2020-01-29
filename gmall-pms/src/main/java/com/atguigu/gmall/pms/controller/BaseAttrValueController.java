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

import com.atguigu.gmall.pms.entity.BaseAttrValueEntity;
import com.atguigu.gmall.pms.service.BaseAttrValueService;




/**
 * 属性值表
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-28 23:53:44
 */
@Api(tags = "属性值表 管理")
@RestController
@RequestMapping("pms/baseattrvalue")
public class BaseAttrValueController {
    @Autowired
    private BaseAttrValueService baseAttrValueService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:baseattrvalue:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = baseAttrValueService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:baseattrvalue:info')")
    public Resp<BaseAttrValueEntity> info(@PathVariable("id") Long id){
		BaseAttrValueEntity baseAttrValue = baseAttrValueService.getById(id);

        return Resp.ok(baseAttrValue);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:baseattrvalue:save')")
    public Resp<Object> save(@RequestBody BaseAttrValueEntity baseAttrValue){
		baseAttrValueService.save(baseAttrValue);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:baseattrvalue:update')")
    public Resp<Object> update(@RequestBody BaseAttrValueEntity baseAttrValue){
		baseAttrValueService.updateById(baseAttrValue);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:baseattrvalue:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		baseAttrValueService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
