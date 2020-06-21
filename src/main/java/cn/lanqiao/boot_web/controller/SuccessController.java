package cn.lanqiao.boot_web.controller;

import cn.lanqiao.boot_web.entity.vo.AddressVO;
import cn.lanqiao.boot_web.entity.vo.OrderVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class SuccessController {
    @GetMapping("/success")
    public String test(Model model, Integer orderId){
        //根据orderId查询物流、订单信息
        //构造数据
        AddressVO address = AddressVO.builder()
                .id("1")
                .name("张三")
                .tel("15225319126")
                .province("湖北")
                .city("武汉")
                .dist("洪山区")
                .street("北京路")
                .flag("1")
                .build();

        OrderVO order = OrderVO.builder()
                .orderId("1")
                .goodsColor("蓝色")
                .goodsImg("http://t9.baidu.com/it/u=3891392581,3960749234&fm=193")
                .goodsPack("箱")
                .goodsName("摩托")
                .unit("2000")
                .num("1")
                .transTime("2020-6-21 09:18")
                .totalMoney(String.valueOf(2000 * 1))
                .status(new Random().nextInt(5))
                .build();
        model.addAttribute("order" ,order);
        model.addAttribute("address",address);
        return "success";
    }


}
