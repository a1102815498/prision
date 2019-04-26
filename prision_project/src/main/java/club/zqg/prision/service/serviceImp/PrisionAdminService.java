package club.zqg.prision.service.serviceImp;


import club.zqg.prision.dao.PrisionAdminMapper;
import club.zqg.prision.dao.PrisionPoliceMapper;
import club.zqg.prision.domain.PrisionAdmin;
import club.zqg.prision.domain.PrisionPolice;
import club.zqg.prision.service.IPrisionAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrisionAdminService implements IPrisionAdminService {

    @Autowired
    PrisionAdminMapper adminMapper; // 管理员Mapper

    @Autowired
    PrisionPoliceMapper policeMapper;
    // 登陆校验
    @Override
    public PrisionAdmin login(PrisionAdmin admin) {
        return adminMapper.selectSingle(admin);
    }
    // 狱警信息
    public List<PrisionPolice> findAllPrisionPolice(){
        return policeMapper.selectByExample(null);
    }
}