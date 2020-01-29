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

import com.atguigu.gmall.pms.entity.BaseAttrInfoEntity;
import com.atguigu.gmall.pms.service.BaseAttrInfoService;




/**
 * 属性表
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-28 23:53:44
 */
@Api(tags = "属性表 管理")
@RestController
@RequestMapping("pms/baseattrinfo")
public class BaseAttrInfoController {
    @Autowired
    private BaseAttrInfoService baseAttrInfoService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:baseattrinfo:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = baseAttrInfoService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:baseattrinfo:info')")
    public Resp<BaseAttrInfoEntity> info(@PathVariable("id") Long id){
		BaseAttrInfoEntity baseAttrInfo = baseAttrInfoService.getById(id);

        return Resp.ok(baseAttrInfo);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:baseattrinfo:save')")
    public Resp<Object> save(@RequestBody BaseAttrInfoEntity baseAttrInfo){
		baseAttrInfoService.save(baseAttrInfo);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:baseattrinfo:update')")
    public Resp<Object> update(@RequestBody BaseAttrInfoEntity baseAttrInfo){
		baseAttrInfoService.updateById(baseAttrInfo);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:baseattrinfo:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		baseAttrInfoService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
