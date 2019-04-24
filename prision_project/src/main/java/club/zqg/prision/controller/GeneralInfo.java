package club.zqg.prision.controller;


import club.zqg.prision.domain.PrisionNews;
import club.zqg.prision.service.IGeneralInfo;
import club.zqg.prision.service.serviceImp.GeneralInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/prision")
public class GeneralInfo {

    @Autowired
    IGeneralInfo generalInfoService;

    @RequestMapping("/query")
    public String queryInfo(Model model) {
        //查询监狱新闻信息
        List<PrisionNews> news = generalInfoService.query();
        model.addAttribute("news", news);
        //
        return "prision/index";
    }
}
