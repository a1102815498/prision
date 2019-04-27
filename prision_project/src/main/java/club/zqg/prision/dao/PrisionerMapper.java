package club.zqg.prision.dao;

import club.zqg.prision.domain.Prisioner;
import club.zqg.prision.domain.PrisionerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PrisionerMapper {
    long countByExample(PrisionerExample example);

    int deleteByExample(PrisionerExample example);

    int deleteByPrimaryKey(Integer prisionId);

    int insert(Prisioner record);

    int insertSelective(Prisioner record);

    List<Prisioner> selectByExample(PrisionerExample example);

    List<Prisioner> findQuickResult(@Param("prisionName") String prisionName); // 快捷查询

    List<Prisioner> selectDetailInfo(); // 犯人信息查询

    int selectAll(); // 查询所有服刑人数

    int selectDangerPrisioner(); // 查询危险犯人

    int selectFinishPrisioner(); // 查询即将出狱

    Prisioner selectByPrimaryKey(Integer prisionId);

    int updateByExampleSelective(@Param("record") Prisioner record, @Param("example") PrisionerExample example);

    int updateByExample(@Param("record") Prisioner record, @Param("example") PrisionerExample example);

    int updateByPrimaryKeySelective(Prisioner record);

    int updateByPrimaryKey(Prisioner record);
}