package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 运费模版
 * 
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-28 23:53:43
 */
@ApiModel
@Data
@TableName("pms_feight_template")
public class FeightTemplateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 
	 */
	@ApiModelProperty(name = "name",value = "")
	private String name;
	/**
	 * 计费类型:0->按重量；1->按件数
	 */
	@ApiModelProperty(name = "chargeType",value = "计费类型:0->按重量；1->按件数")
	private Integer chargeType;
	/**
	 * 首重kg
	 */
	@ApiModelProperty(name = "firstWeight",value = "首重kg")
	private BigDecimal firstWeight;
	/**
	 * 首费（元）
	 */
	@ApiModelProperty(name = "firstFee",value = "首费（元）")
	private BigDecimal firstFee;
	/**
	 * 
	 */
	@ApiModelProperty(name = "continueWeight",value = "")
	private BigDecimal continueWeight;
	/**
	 * 
	 */
	@ApiModelProperty(name = "continmeFee",value = "")
	private BigDecimal continmeFee;
	/**
	 * 目的地（省、市）
	 */
	@ApiModelProperty(name = "dest",value = "目的地（省、市）")
	private String dest;

}
