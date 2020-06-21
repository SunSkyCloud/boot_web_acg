package cn.lanqiao.boot_web.controller;

import cn.lanqiao.boot_web.entity.vo.CommentVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CommentController {

    @GetMapping("/comment")
    public String test(Model  model){
        //构造数据
        List<CommentVO> list= new ArrayList<CommentVO>();
        for (int i = 0; i <1 ; i++) {
            CommentVO build = CommentVO.builder()
                   .imgSrc("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1592692777&di=5d29ebd4542e44e10c161d50c1b4b4cb&src=http://pic.qjimage.com/chineseview109/high/561-0844.jpg")
                    .goodsName("衣服")
                    .comment1("宝贝非常漂亮，非常nice")
                    .name("张三")
                    .goodsColor("蓝色")
                    .goodsPacket("裸装")
                    .time("2018-6-21").build();
            list.add(build);
        }
        System.out.println(list);
        model.addAttribute("list",list);
        return "comment";
    }

//    @PostMapping("address/save")
//    public String save(AddressDto addressDto){
//        System.out.println(addressDto);
//        return "address";
//    }
}
