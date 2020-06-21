package cn.lanqiao.boot_web.entity.vo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class LogisticsTrackVO {
    private String date;
    private String time;
    private String info;
}
