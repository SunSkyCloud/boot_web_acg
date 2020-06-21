package cn.lanqiao.boot_web.controller;

import cn.lanqiao.boot_web.entity.dto.AddressDto;
import cn.lanqiao.boot_web.entity.vo.AddressVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AddressController {

    @GetMapping("/address")
    public String test(Model  model){
        //构造数据
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
        System.out.println(list);
        model.addAttribute("list",list);
        return "address";
    }

    @PostMapping("address/save")
    public String save(AddressDto addressDto){
        System.out.println(addressDto);
        return "address";
    }
}
