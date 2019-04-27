package club.zqg.prision.service;

import club.zqg.prision.domain.Dangerlevel;
import club.zqg.prision.domain.PrisionAdmin;
import club.zqg.prision.domain.PrisionPolice;
import club.zqg.prision.domain.Prisioner;

import java.util.List;

public interface IPrisionAdminService {

    // 管理员登陆校验
    PrisionAdmin login(PrisionAdmin admin);

    //所属狱警
    List<PrisionPolice> findAllPrisionPolice();

    List<Dangerlevel> findAllDangeLevel();

    List<Prisioner> findQuickResult(String prisionName);
}
