package club.zqg.prision.dao;

import club.zqg.prision.domain.PrisionRank;
import club.zqg.prision.domain.PrisionRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrisionRankMapper {
    long countByExample(PrisionRankExample example);

    int deleteByExample(PrisionRankExample example);

    int deleteByPrimaryKey(Short rankId);

    int insert(PrisionRank record);

    int insertSelective(PrisionRank record);

    List<PrisionRank> selectByExample(PrisionRankExample example);

    PrisionRank selectByPrimaryKey(Short rankId);

    int updateByExampleSelective(@Param("record") PrisionRank record, @Param("example") PrisionRankExample example);

    int updateByExample(@Param("record") PrisionRank record, @Param("example") PrisionRankExample example);

    int updateByPrimaryKeySelective(PrisionRank record);

    int updateByPrimaryKey(PrisionRank record);
}