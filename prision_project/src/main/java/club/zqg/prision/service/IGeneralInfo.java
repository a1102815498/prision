package club.zqg.prision.service;

import java.util.List;

public interface IGeneralInfo {
    int countPrisioner(); // 服刑人数
    int countPolice();// 狱警人数
    int countDangerPrisioner(); //危险犯人
    int countFinishPrision(); // 即将出狱
    List<club.zqg.prision.domain.PrisionNews> query(); // 新闻查询

}
