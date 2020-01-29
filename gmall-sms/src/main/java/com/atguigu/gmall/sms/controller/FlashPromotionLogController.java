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

import com.atguigu.gmall.sms.entity.FlashPromotionLogEntity;
import com.atguigu.gmall.sms.service.FlashPromotionLogService;




/**
 * 限时购通知记录
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:40
 */
@Api(tags = "限时购通知记录 管理")
@RestController
@RequestMapping("sms/flashpromotionlog")
public class FlashPromotionLogController {
    @Autowired
    private FlashPromotionLogService flashPromotionLogService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:flashpromotionlog:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = flashPromotionLogService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:flashpromotionlog:info')")
    public Resp<FlashPromotionLogEntity> info(@PathVariable("id") Integer id){
		FlashPromotionLogEntity flashPromotionLog = flashPromotionLogService.getById(id);

        return Resp.ok(flashPromotionLog);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:flashpromotionlog:save')")
    public Resp<Object> save(@RequestBody FlashPromotionLogEntity flashPromotionLog){
		flashPromotionLogService.save(flashPromotionLog);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:flashpromotionlog:update')")
    public Resp<Object> update(@RequestBody FlashPromotionLogEntity flashPromotionLog){
		flashPromotionLogService.updateById(flashPromotionLog);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:flashpromotionlog:delete')")
    public Resp<Object> delete(@RequestBody Integer[] ids){
		flashPromotionLogService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
