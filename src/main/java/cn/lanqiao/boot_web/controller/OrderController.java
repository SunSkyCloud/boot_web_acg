package cn.lanqiao.boot_web.controller;

import cn.lanqiao.boot_web.entity.vo.OrderVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Random;

@Controller
public class OrderController {
    @GetMapping("/order")
    public String test(Model model){
        ArrayList<OrderVO> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

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
            list.add(order);
        }
        System.out.println(list);
        model.addAttribute("orderList",list);
        //构造数据
        return "order";
    }
}
