package club.zqg.prision.service.serviceImp;

import club.zqg.prision.dao.PrisionNewsMapper;
import club.zqg.prision.domain.PrisionNews;
import club.zqg.prision.service.IGeneralInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralInfoService implements IGeneralInfo {

    @Autowired
    PrisionNewsMapper prisionNewsMapper;

    public List<PrisionNews> query() {
        return prisionNewsMapper.selectAll();
    }
}
