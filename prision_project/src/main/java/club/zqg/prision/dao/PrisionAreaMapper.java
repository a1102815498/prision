package club.zqg.prision.dao;

import club.zqg.prision.domain.PrisionArea;
import club.zqg.prision.domain.PrisionAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrisionAreaMapper {
    long countByExample(PrisionAreaExample example);

    int deleteByExample(PrisionAreaExample example);

    int deleteByPrimaryKey(Short areaId);

    int insert(PrisionArea record);

    int insertSelective(PrisionArea record);

    List<PrisionArea> selectByExample(PrisionAreaExample example);

    PrisionArea selectByPrimaryKey(Short areaId);

    int updateByExampleSelective(@Param("record") PrisionArea record, @Param("example") PrisionAreaExample example);

    int updateByExample(@Param("record") PrisionArea record, @Param("example") PrisionAreaExample example);

    int updateByPrimaryKeySelective(PrisionArea record);

    int updateByPrimaryKey(PrisionArea record);
}