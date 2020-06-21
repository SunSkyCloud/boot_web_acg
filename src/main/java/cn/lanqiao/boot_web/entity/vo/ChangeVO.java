package cn.lanqiao.boot_web.entity.vo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class ChangeVO {
    private int id;
    private String refundNo;
    private String applyTime;
    private String goodsName;
    private String goodsColor;
    private String goodsPicket;
    private String balance;
    private String refundBalance;
    private String status;

}
