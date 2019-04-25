package club.zqg.prision.service.serviceImp;

import club.zqg.prision.dao.PrisionerMapper;
import club.zqg.prision.domain.Prisioner;
import club.zqg.prision.service.IPrisionerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrisionerService implements IPrisionerService {

    @Autowired
    PrisionerMapper prisionerMapper;

    // 查询犯人具体信息
    @Override
    public List<Prisioner> findAllPrisionerInfo() {
        return prisionerMapper.selectDetailInfo();
    }
}
