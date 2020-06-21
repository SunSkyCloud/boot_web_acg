package cn.lanqiao.boot_web.entity.vo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@Builder
public class LogisticsVO {

    private String company;
    private String no;
    private String tel;
    private String img;
    private Integer status;
    private List<LogisticsTrackVO> trackList;

}
