package cn.lanqiao.boot_web.controller;

import cn.lanqiao.boot_web.entity.vo.AddressVO;
import cn.lanqiao.boot_web.entity.vo.OrderVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class PayController {
    @GetMapping("/pay")
    public String test(Model model){
        //构造数据（地址、订单数据）
        List<AddressVO> list= new ArrayList<AddressVO>();
        for (int i = 0; i <3 ; i++) {
            AddressVO build = AddressVO.builder()
                    .id(String.valueOf(i))
                    .name("张三")
                    .tel("15225319126")
                    .province("湖北")
                    .city("武汉")
                    .dist("洪山区")
                    .street("北京路")
                    .flag(String.valueOf(i))
                    .build();
            list.add(build);
        }


        ArrayList<OrderVO> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            OrderVO order = OrderVO.builder()
                    .orderId(String.valueOf(i))
                    .goodsColor("蓝色" + i)
                    .goodsImg("http://t9.baidu.com/it/u=3891392581,3960749234&fm=193")
                    .goodsPack("箱")
                    .goodsName("摩托")
                    .unit("2000")
                    .num(String.valueOf(i))
                    .transTime("2020-6-21 09:18")
                    .totalMoney(String.valueOf(2000 * i))
                    .status(new Random().nextInt(5))
                    .build();
            list2.add(order);
        }
        System.out.println(list);
        model.addAttribute("addressList",list);
        model.addAttribute("orderList",list2);
        return "pay";
    }

}
