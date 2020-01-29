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

import com.atguigu.gmall.pms.entity.CommentEntity;
import com.atguigu.gmall.pms.service.CommentService;




/**
 * 商品评价表
 *
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-28 23:53:43
 */
@Api(tags = "商品评价表 管理")
@RestController
@RequestMapping("pms/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:comment:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = commentService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:comment:info')")
    public Resp<CommentEntity> info(@PathVariable("id") Long id){
		CommentEntity comment = commentService.getById(id);

        return Resp.ok(comment);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:comment:save')")
    public Resp<Object> save(@RequestBody CommentEntity comment){
		commentService.save(comment);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:comment:update')")
    public Resp<Object> update(@RequestBody CommentEntity comment){
		commentService.updateById(comment);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:comment:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		commentService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
