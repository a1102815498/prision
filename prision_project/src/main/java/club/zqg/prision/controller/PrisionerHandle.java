package club.zqg.prision.controller;


import club.zqg.prision.domain.Prisioner;
import club.zqg.prision.service.IPrisionerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/prisioner")
public class PrisionerHandle {

    @Autowired
    IPrisionerService prisionerService;

    @RequestMapping("/list")
    public String findAllPrisionerInfo(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model){
       // System.out.println("犯人列表");
        //每页显示 4条数据
        PageHelper.startPage(pn,4);
        List<Prisioner> allPrisionerInfo = prisionerService.findAllPrisionerInfo();
        // 页码连续显示4页
        PageInfo<Prisioner> pageInfo = new PageInfo<>(allPrisionerInfo,3);
        model.addAttribute("pageInfo",pageInfo);
        return "prision/table";
    }

    @ResponseBody
    @RequestMapping("/quickQuery")
    public Prisioner quickQuery(@RequestParam("prisionName")String name){
        System.out.println("接受的参数为"+name);
        System.out.println("快速查询方法 返回json");
        return new Prisioner(10001,"朱启刚","安徽");
    }

}
