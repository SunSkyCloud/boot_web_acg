package cn.lanqiao.boot_web.controller;

import cn.lanqiao.boot_web.entity.vo.ChangeVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ChangeController {

    @GetMapping("/change")
    public String test(Model  model){
        //构造数据
        List<ChangeVO> list= new ArrayList<ChangeVO>();
        for (int i = 0; i <10 ; i++) {
            ChangeVO build = ChangeVO.builder()
                    .id(i)
                    .refundNo("57001")
                    .applyTime("2020-6-20")
                    .goodsName("上衣")
                    .goodsColor("蓝色")
                    .goodsPicket("箱")
                    .balance("200")
                    .refundBalance("180")
                    .status("1").build();
            list.add(build);
        }
        model.addAttribute("list",list);
        return "change";
    }

    @GetMapping("/change/selectChangeById")
    public String save(Integer id,Model model){
        System.out.println(id);
        return "change";
    }
}
