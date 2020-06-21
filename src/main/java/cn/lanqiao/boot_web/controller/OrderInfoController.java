package cn.lanqiao.boot_web.controller;

import cn.lanqiao.boot_web.entity.vo.AddressVO;
import cn.lanqiao.boot_web.entity.vo.LogisticsTrackVO;
import cn.lanqiao.boot_web.entity.vo.LogisticsVO;
import cn.lanqiao.boot_web.entity.vo.OrderVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class OrderInfoController {
    @GetMapping("/orderInfo")
    public String test(Model model,Integer orderId){
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

        List list =new ArrayList<LogisticsTrackVO>();
        list.add( LogisticsTrackVO.builder()
                .date("2020-06-22")
                .time("13:00:50")
                .info("【武汉市】快件已到达 光谷关山分部").build());
        LogisticsVO logistics = LogisticsVO.builder()
                .company("天天物流")
                .img("http://img2.imgtn.bdimg.com/it/u=369666028,3219032152&fm=26&gp=0.jpg")
                .tel("123456")
                .no("123456987654321")
                .status(1)
                .trackList(list).build();


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
        model.addAttribute("logistics",logistics);
        model.addAttribute("address",address);
        return "orderinfo";
    }
}
