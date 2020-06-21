package cn.lanqiao.boot_web.controller;

import cn.lanqiao.boot_web.entity.vo.LogisticsTrackVO;
import cn.lanqiao.boot_web.entity.vo.LogisticsVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LogisticsController {
    @GetMapping("/logistics")
    public String test(Model model){
        //构造数据
        List<LogisticsTrackVO> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(LogisticsTrackVO.builder()
                    .date("2020-06-2"+String.valueOf(i))
                    .time("13:00:50")
                    .info("【武汉市】快件已到达 光谷关山分部").build());
        }
        LogisticsVO logistics = LogisticsVO.builder()
                .company("天天物流")
                .img("http://img2.imgtn.bdimg.com/it/u=369666028,3219032152&fm=26&gp=0.jpg")
                .tel("123456")
                .no("123456987654321")
                .status(1)
                .trackList(list).build();
        model.addAttribute("logistics",logistics);
        return "logistics";
    }
}
