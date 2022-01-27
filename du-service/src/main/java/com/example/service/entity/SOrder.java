package com.example.service.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;

/**
 * @Description  
 * @Author  linmengmeng
 * @Date 2021-11-22 11:02:27 
 */

@Getter
@Setter
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name ="s_order")
public class SOrder implements Serializable {

	private static final long serialVersionUID = 892625953348329511L;

	/**
	 * id
	 */
  	@Id
	@Column(name = "order_id")
	private String orderId;

	/**
	 * 订单编号
	 */
  	@Column(name = "order_no" )
	private String orderNo;

	/**
	 * 送货方式 1门店自提 2 快递 0自动收货
	 */
  	@Column(name = "deliver_type" )
	private Long deliverType;

	/**
	 * 取货人姓名
	 */
  	@Column(name = "name" )
	private String name;

	/**
	 * 取货人电话
	 */
  	@Column(name = "phone" )
	private String phone;

	/**
	 * 实付金额
	 */
  	@Column(name = "pay_amount" )
	private BigDecimal payAmount;

	/**
	 * 订单总额
	 */
  	@Column(name = "amount" )
	private BigDecimal amount;

	/**
	 * 支付方式 1微信支付
	 */
  	@Column(name = "pay_type" )
	private Long payType;

	/**
	 * 订单状态 1待支付 2待成团 3待取货 4已完成 5已取消 6退货审核中 7退货审核完成 8 待发货 9 已发货
	 */
  	@Column(name = "status" )
	private Long status;

	/**
	 * 优惠券优惠金额
	 */
  	@Column(name = "discounts" )
	private BigDecimal discounts;

	/**
	 * 优惠券名称
	 */
  	@Column(name = "coupon_name" )
	private String couponName;

	/**
	 * 使用积分数量
	 */
  	@Column(name = "use_integral" )
	private Long useIntegral;

	/**
	 * 积分优惠金额
	 */
  	@Column(name = "discounts_integerl" )
	private BigDecimal discountsIntegerl;

	/**
	 * 砍价优惠金额
	 */
  	@Column(name = "discounts_cut_price" )
	private BigDecimal discountsCutPrice;

	/**
	 * 取货地址
	 */
  	@Column(name = "address" )
	private String address;

	/**
	 * 店名
	 */
  	@Column(name = "store_name" )
	private String storeName;

	/**
	 * 创建时间
	 */
  	@Column(name = "create_time" )
	private Long createTime;

	/**
	 * 创建人
	 */
  	@Column(name = "create_id" )
	private String createId;

	/**
	 * 更改时间
	 */
  	@Column(name = "update_time" )
	private Long updateTime;

	/**
	 * 更新人
	 */
  	@Column(name = "update_id" )
	private String updateId;

	/**
	 * 1 正常 2 已删除 3 客服已删除
	 */
  	@Column(name = "is_delete" )
	private String isDelete;

	/**
	 * 所属商家
	 */
  	@Column(name = "seller_id" )
	private String sellerId;

	/**
	 * 1 导购核销 2 (后台)标记收货  3 用户自行确认收货
	 */
  	@Column(name = "out_goods_type" )
	private Integer outGoodsType;

	/**
	 * 出货人id
	 */
  	@Column(name = "out_goods_id" )
	private String outGoodsId;

	/**
	 * 出货人姓名
	 */
  	@Column(name = "out_goods_name" )
	private String outGoodsName;

	/**
	 * 出货人电话
	 */
  	@Column(name = "out_goods_phone" )
	private String outGoodsPhone;

	/**
	 * 支付时间
	 */
  	@Column(name = "pay_time" )
	private Long payTime;

	/**
	 * 收货时间
	 */
  	@Column(name = "take_time" )
	private Long takeTime;

	/**
	 * 备注
	 */
  	@Column(name = "remark" )
	private String remark;

	/**
	 * 取货店铺电话
	 */
  	@Column(name = "take_store_phone" )
	private String takeStorePhone;

	/**
	 * 订单类型 1商品/秒杀 2拼团 3砍价 4 竞拍
	 */
  	@Column(name = "type" )
	private Long type;

	/**
	 * 取货门店id
	 */
  	@Column(name = "take_store_id" )
	private String takeStoreId;

	/**
	 * 取货门店名称
	 */
  	@Column(name = "take_store_name" )
	private String takeStoreName;

	/**
	 * 上级关系
	 */
  	@Column(name = "path" )
	private String path;

	/**
	 * 购买商品消耗积分数
	 */
  	@Column(name = "consume_integral" )
	private Long consumeIntegral;

	/**
	 * 物流运费
	 */
  	@Column(name = "logistics_money" )
	private BigDecimal logisticsMoney;

	/**
	 * 物流地址
	 */
  	@Column(name = "logistics_address" )
	private String logisticsAddress;

	/**
	 * 快递单号
	 */
  	@Column(name = "express_no" )
	private String expressNo;

	/**
	 * 中通快递[ZTO]、申通快递[STO]、圆通速递[YTO]），顺丰(SF)
	 */
  	@Column(name = "express_company" )
	private String expressCompany;

	/**
	 * 快递公司名称
	 */
  	@Column(name = "express_name" )
	private String expressName;

  	@Column(name = "express_time" )
	private Long expressTime;

	/**
	 * 邮费模板id
	 */
  	@Column(name = "template_id" )
	private Long templateId;

	/**
	 * 0 未维权 1 维权中 2 维权已退款 
	 */
  	@Column(name = "refund_type" )
	private Integer refundType;

	/**
	 * 优惠信息 存储json 串
	 */
  	@Column(name = "favourable" )
	private String favourable;

	/**
	 * 0 未开启分账 1 已开启分账
	 */
  	@Column(name = "agent_type" )
	private Integer agentType;

	/**
	 * 推荐人id
	 */
  	@Column(name = "recommender" )
	private String recommender;

	/**
	 * 0 自提扫码核销确认收货 1自提成功购买 2快递物流签收 3 订单发货过后
	 */
  	@Column(name = "auto_take_type" )
	private Integer autoTakeType;

	/**
	 * 最后自动收货时间  auto_take_type 不为0 时 存在该值
	 */
  	@Column(name = "auto_take_day" )
	private Date autoTakeDay;

	/**
	 * auto_take_type = 2 距离快递签收几天自动确认收货
	 */
  	@Column(name = "auto_take_time" )
	private Long autoTakeTime;

}
