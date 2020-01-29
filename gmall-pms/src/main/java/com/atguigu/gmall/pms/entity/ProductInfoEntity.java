package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-28 23:53:43
 */
@ApiModel
@Data
@TableName("pms_product_info")
public class ProductInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "商品id")
	private Long id;
	/**
	 * 商品名称
	 */
	@ApiModelProperty(name = "productName",value = "商品名称")
	private String productName;
	/**
	 * 商品描述(后台简述）
	 */
	@ApiModelProperty(name = "description",value = "商品描述(后台简述）")
	private String description;
	/**
	 * 三级分类id
	 */
	@ApiModelProperty(name = "catalog3Id",value = "三级分类id")
	private Long catalog3Id;
	/**
	 * 品牌id
	 */
	@ApiModelProperty(name = "tmId",value = "品牌id")
	private Long tmId;

}
