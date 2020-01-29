package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 优惠券和产品分类关系表
 * 
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:41
 */
@ApiModel
@Data
@TableName("sms_coupon_product_category_relation")
public class CouponProductCategoryRelationEntity implements Serializable {
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
	@ApiModelProperty(name = "productCategoryId",value = "")
	private Long productCategoryId;
	/**
	 * 产品分类名称
	 */
	@ApiModelProperty(name = "productCategoryName",value = "产品分类名称")
	private String productCategoryName;
	/**
	 * 父分类名称
	 */
	@ApiModelProperty(name = "parentCategoryName",value = "父分类名称")
	private String parentCategoryName;

}
