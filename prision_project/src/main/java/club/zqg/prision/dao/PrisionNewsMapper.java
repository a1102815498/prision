package club.zqg.prision.dao;

import club.zqg.prision.domain.PrisionNews;
import club.zqg.prision.domain.PrisionNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PrisionNewsMapper {
    long countByExample(PrisionNewsExample example);

    int deleteByExample(PrisionNewsExample example);

    int deleteByPrimaryKey(Short newsId);

    int insert(PrisionNews record);

    int insertSelective(PrisionNews record);

    List<PrisionNews> selectByExample(PrisionNewsExample example);

    PrisionNews selectByPrimaryKey(Short newsId);

    int updateByExampleSelective(@Param("record") PrisionNews record, @Param("example") PrisionNewsExample example);

    int updateByExample(@Param("record") PrisionNews record, @Param("example") PrisionNewsExample example);

    int updateByPrimaryKeySelective(PrisionNews record);

    int updateByPrimaryKey(PrisionNews record);
}