package club.zqg.prision.service;

import club.zqg.prision.domain.PrisionAdmin;
import club.zqg.prision.domain.PrisionPolice;

import java.util.List;

public interface IPrisionAdminService {

    // 管理员登陆校验
    PrisionAdmin login(PrisionAdmin admin);

    List<PrisionPolice> findAllPrisionPolice();

}
