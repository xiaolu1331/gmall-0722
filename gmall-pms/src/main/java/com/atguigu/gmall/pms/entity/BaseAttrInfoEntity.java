package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 属性表
 * 
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-28 23:53:44
 */
@ApiModel
@Data
@TableName("pms_base_attr_info")
public class BaseAttrInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "编号")
	private Long id;
	/**
	 * 属性名称
	 */
	@ApiModelProperty(name = "attrName",value = "属性名称")
	private String attrName;
	/**
	 * 
	 */
	@ApiModelProperty(name = "catalog3Id",value = "")
	private Long catalog3Id;
	/**
	 * 启用：1 停用：0
	 */
	@ApiModelProperty(name = "isEnabled",value = "启用：1 停用：0")
	private String isEnabled;

}
