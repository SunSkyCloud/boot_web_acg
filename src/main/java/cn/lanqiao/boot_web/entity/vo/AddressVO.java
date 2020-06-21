package cn.lanqiao.boot_web.entity.vo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class AddressVO {
    private String id;
    private String name;
    private String tel;
    private String province;
    private String city;
    private String dist;
    private String street;

    private String flag; // 是否默认
}
