package springTest;


import club.zqg.prision.dao.PrisionNewsMapper;
import club.zqg.prision.dao.PrisionPoliceMapper;
import club.zqg.prision.dao.PrisionerMapper;
import club.zqg.prision.domain.PrisionPolice;
import club.zqg.prision.domain.Prisioner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJunitTest {

    @Autowired
    PrisionNewsMapper prisionNewsMapper;
    @Test
    public void testMapper() {
        System.out.println(prisionNewsMapper);
    }

    @Autowired
    PrisionerMapper prisionerMapper;

    @Test
    public void testFindAllDetail(){
        List<Prisioner> prisioners = prisionerMapper.selectDetailInfo();
        //System.out.println(prisioners);
        for(Prisioner prisioner:prisioners){
            System.out.println(prisioner);
            //System.out.println(prisioner.getDangerlevel().getDangerLevelName());
            //System.out.println(prisioner.getPrisionPolice().getPoliceName());
        }
    }

}
