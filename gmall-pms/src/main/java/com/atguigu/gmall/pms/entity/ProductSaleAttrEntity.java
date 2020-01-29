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
@TableName("pms_product_sale_attr")
public class ProductSaleAttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * 商品id
	 */
	@ApiModelProperty(name = "productId",value = "商品id")
	private Long productId;
	/**
	 * 销售属性id
	 */
	@ApiModelProperty(name = "saleAttrId",value = "销售属性id")
	private Long saleAttrId;
	/**
	 * 销售属性名称(冗余)
	 */
	@ApiModelProperty(name = "saleAttrName",value = "销售属性名称(冗余)")
	private String saleAttrName;

}
