package club.zqg.prision.dao;

import club.zqg.prision.domain.PrisionChief;
import club.zqg.prision.domain.PrisionChiefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrisionChiefMapper {
    long countByExample(PrisionChiefExample example);

    int deleteByExample(PrisionChiefExample example);

    int deleteByPrimaryKey(Integer chiefId);

    int insert(PrisionChief record);

    int insertSelective(PrisionChief record);

    List<PrisionChief> selectByExample(PrisionChiefExample example);

    PrisionChief selectByPrimaryKey(Integer chiefId);

    int updateByExampleSelective(@Param("record") PrisionChief record, @Param("example") PrisionChiefExample example);

    int updateByExample(@Param("record") PrisionChief record, @Param("example") PrisionChiefExample example);

    int updateByPrimaryKeySelective(PrisionChief record);

    int updateByPrimaryKey(PrisionChief record);
}