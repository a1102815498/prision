package springTest;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import club.zqg.prision.dao.PrisionNewsMapper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJunitTest {

    @Autowired
    PrisionNewsMapper prisionNewsMapper;

    @Test
    public void testMapper() {
        System.out.println(prisionNewsMapper);
    }
}
