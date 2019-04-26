package club.zqg.prision.dao;

import club.zqg.prision.domain.PrisionPolice;
import club.zqg.prision.domain.PrisionPoliceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrisionPoliceMapper {
    long countByExample(PrisionPoliceExample example);

    int deleteByExample(PrisionPoliceExample example);

    int deleteByPrimaryKey(Integer policeId);

    int insert(PrisionPolice record);

    int insertSelective(PrisionPolice record);

    List<PrisionPolice> selectByExample(PrisionPoliceExample example);

    PrisionPolice selectByPrimaryKey(Integer policeId);

    int updateByExampleSelective(@Param("record") PrisionPolice record, @Param("example") PrisionPoliceExample example);

    int updateByExample(@Param("record") PrisionPolice record, @Param("example") PrisionPoliceExample example);

    int updateByPrimaryKeySelective(PrisionPolice record);

    int updateByPrimaryKey(PrisionPolice record);


    // 狱警人数查询
    int selectAll();
}