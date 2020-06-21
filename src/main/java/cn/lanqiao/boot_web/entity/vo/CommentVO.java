package cn.lanqiao.boot_web.entity.vo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class CommentVO {
    private String imgSrc;
    private String comment1;
    private String time;
    private String name;
    private String goodsName;
    private String goodsColor;
    private String goodsPacket;

    private String price;

}
