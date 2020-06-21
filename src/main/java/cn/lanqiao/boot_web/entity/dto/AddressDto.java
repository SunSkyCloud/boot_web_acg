package cn.lanqiao.boot_web.entity.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AddressDto {
    private String receivePeople;
    private String receiveTel;
    private String receiveProvince;
    private String receiveCity;
    private String receiveArea;
    private String receiveAddress;

}
