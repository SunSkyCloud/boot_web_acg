package cn.lanqiao.boot_web.entity.vo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class OrderVO {
   private String orderId;
   private String orderNo;
   private String goodsImg;
   private String goodsName;
   private String goodsColor;
   private String goodsPack;
   private String transTime;
   private String unit;
   private String num;
   private String totalMoney;
   private Integer status;
}
