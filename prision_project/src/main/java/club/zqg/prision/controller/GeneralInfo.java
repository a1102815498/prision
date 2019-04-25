package club.zqg.prision.controller;


import club.zqg.prision.domain.PrisionNews;
import club.zqg.prision.service.IGeneralInfo;
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

        // 服刑人数
        model.addAttribute("countPrisioner",generalInfoService.countPrisioner());
        // 狱警人数
        model.addAttribute("countPolice",generalInfoService.countPolice());
        // 危险犯人人数
        model.addAttribute("dangerPrisioner",generalInfoService.countDangerPrisioner());
        // 即将出狱人数
        model.addAttribute("finishPrision",generalInfoService.countFinishPrision());
        //监狱新闻信息
        List<PrisionNews> news = generalInfoService.query();
        model.addAttribute("news", news);
        //
        return "prision/index";
    }
}
