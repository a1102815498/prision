package club.zqg.prision.service.serviceImp;


import club.zqg.prision.dao.DangerlevelMapper;
import club.zqg.prision.dao.PrisionAdminMapper;
import club.zqg.prision.dao.PrisionPoliceMapper;
import club.zqg.prision.dao.PrisionerMapper;
import club.zqg.prision.domain.Dangerlevel;
import club.zqg.prision.domain.PrisionAdmin;
import club.zqg.prision.domain.PrisionPolice;
import club.zqg.prision.domain.Prisioner;
import club.zqg.prision.service.IPrisionAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrisionAdminService implements IPrisionAdminService {


    @Autowired
    PrisionAdminMapper adminMapper; // 管理员Mapper

    @Autowired
    PrisionPoliceMapper policeMapper; // 狱警信息

    @Autowired
    DangerlevelMapper dangerlevelMapper; // 危险等级

    @Autowired
    PrisionerMapper prisionerMapper;

    // 登陆校验
    @Override
    public PrisionAdmin login(PrisionAdmin admin) {
        return adminMapper.selectSingle(admin);
    }
    // 所属狱警信息
    public List<PrisionPolice> findAllPrisionPolice(){
        return policeMapper.selectByExample(null);
    }

    // 所属危险等级
    @Override
    public List<Dangerlevel> findAllDangeLevel() {
        return dangerlevelMapper.selectByExample(null);
    }

    // 快捷查询
    @Override
    public List<Prisioner> findQuickResult(String prisionName) {
        return prisionerMapper.findQuickResult(prisionName) ;
    }
}