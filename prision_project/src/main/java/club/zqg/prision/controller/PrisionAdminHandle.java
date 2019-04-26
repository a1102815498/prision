package club.zqg.prision.controller;


import club.zqg.prision.domain.PrisionAdmin;
import club.zqg.prision.service.IPrisionAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

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
            return "/prision/user";
        }else{
            model.addAttribute("msg","用户名或密码错误");
            return "/prision/login";
        }
    }


    // 获取 session域用户名
    @RequestMapping("/getSessionAdminName")
    public void getSessionAdminName(ModelMap modelMap){
        System.out.println(modelMap.get("adminName"));
    }
}
