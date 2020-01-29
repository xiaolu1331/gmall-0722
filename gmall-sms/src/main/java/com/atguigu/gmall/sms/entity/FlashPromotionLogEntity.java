package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 限时购通知记录
 * 
 * @author fengge
 * @email lxf@atguigu.com
 * @date 2020-01-29 11:42:40
 */
@ApiModel
@Data
@TableName("sms_flash_promotion_log")
public class FlashPromotionLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Integer id;
	/**
	 * 
	 */
	@ApiModelProperty(name = "memberId",value = "")
	private Integer memberId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "productId",value = "")
	private Long productId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "memberPhone",value = "")
	private String memberPhone;
	/**
	 * 
	 */
	@ApiModelProperty(name = "productName",value = "")
	private String productName;
	/**
	 * 会员订阅时间
	 */
	@ApiModelProperty(name = "subscribeTime",value = "会员订阅时间")
	private Date subscribeTime;
	/**
	 * 
	 */
	@ApiModelProperty(name = "sendTime",value = "")
	private Date sendTime;

}
