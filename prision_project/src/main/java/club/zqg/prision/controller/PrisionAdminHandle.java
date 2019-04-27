package club.zqg.prision.controller;


import club.zqg.prision.domain.PrisionAdmin;
import club.zqg.prision.domain.Prisioner;
import club.zqg.prision.service.IPrisionAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

// 监狱管理员[负责犯人信息录入与查询，狱警信息录入与查询，新闻发布等]

@Controller
@SessionAttributes(value = {"adminName"})
@RequestMapping("/admin")
public class PrisionAdminHandle {

    @Autowired
    IPrisionAdminService adminService;

    // 转发login页面
    @RequestMapping("/dispatchLoginPage")
    public String dispatchLoginPage(){
        return "/prision/login";
    }

    // 登陆校验
    @RequestMapping("/login")
    public String login(PrisionAdmin admin, Model model){
        System.out.println("login---getAdminName---"+admin.getPrisionAdminName());
        if(adminService.login(admin)!=null){
            model.addAttribute("adminName",admin.getPrisionAdminName());
            model.addAttribute("AllprisionerPolice",adminService.findAllPrisionPolice());
            model.addAttribute("AllDangerLevel",adminService.findAllDangeLevel());
            return "/prision/user";
        }else{
            model.addAttribute("msg","用户名或密码错误");
            return "/prision/login";
        }
    }

    // 快捷查询
    @ResponseBody
    @RequestMapping("/quickQuery")
    public List<Prisioner> quickQuery(@RequestParam(value = "name")String prisionerName){
        System.out.println("接受的参数"+prisionerName);
        List<Prisioner> quickResult = adminService.findQuickResult(prisionerName);
        for (Prisioner prisioner:quickResult){
            System.out.println(prisioner.getPrisionPolice().getPoliceName());
        }
        return quickResult;
    }


    // 获取 session域用户名
    @RequestMapping("/getSessionAdminName")
    public void getSessionAdminName(ModelMap modelMap){
        System.out.println(modelMap.get("adminName"));
    }
}
