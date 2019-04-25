package club.zqg.prision.service.serviceImp;

import club.zqg.prision.dao.PrisionNewsMapper;
import club.zqg.prision.dao.PrisionPoliceMapper;
import club.zqg.prision.dao.PrisionerMapper;
import club.zqg.prision.domain.PrisionNews;
import club.zqg.prision.service.IGeneralInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralInfoService implements IGeneralInfo {

    @Autowired
    PrisionNewsMapper prisionNewsMapper; // 监狱新闻dao接口

    @Autowired
    PrisionerMapper prisionerMapper;  // 犯人dao接口

    @Autowired
    PrisionPoliceMapper policeMapper;

    //服刑人数查询
    public int countPrisioner(){
        return prisionerMapper.selectAll();
    }
    // 狱警人数
    @Override
    public int countPolice() {
        return policeMapper.selectAll();
    }

    // 危险犯人查询
    @Override
    public int countDangerPrisioner() {
        return prisionerMapper.selectDangerPrisioner();
    }

    // 即将出狱
    @Override
    public int countFinishPrision() {
        return prisionerMapper.selectFinishPrisioner();
    }

    // 新闻查询
    public List<PrisionNews> query() {
        return prisionNewsMapper.selectByExample(null);
    }
}
