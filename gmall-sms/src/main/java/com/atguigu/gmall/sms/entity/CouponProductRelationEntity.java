package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券和产品的关系表
 * 
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:40
 */
@ApiModel
@Data
@TableName("sms_coupon_product_relation")
public class CouponProductRelationEntity implements Serializable {
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
	@ApiModelProperty(name = "couponId",value = "")
	private Long couponId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "productId",value = "")
	private Long productId;
	/**
	 * 商品名称
	 */
	@ApiModelProperty(name = "productName",value = "商品名称")
	private String productName;
	/**
	 * 商品编码
	 */
	@ApiModelProperty(name = "productSn",value = "商品编码")
	private String productSn;

}
