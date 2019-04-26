package club.zqg.prision.dao;

import club.zqg.prision.domain.PrisionAdmin;
import club.zqg.prision.domain.PrisionAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrisionAdminMapper {
    long countByExample(PrisionAdminExample example);

    int deleteByExample(PrisionAdminExample example);

    int deleteByPrimaryKey(Short prisionAdminId);

    int insert(PrisionAdmin record);

    int insertSelective(PrisionAdmin record);

    List<PrisionAdmin> selectByExample(PrisionAdminExample example);

    PrisionAdmin selectByPrimaryKey(Short prisionAdminId);

    PrisionAdmin selectSingle(PrisionAdmin admin); // 登陆查询

    int updateByExampleSelective(@Param("record") PrisionAdmin record, @Param("example") PrisionAdminExample example);

    int updateByExample(@Param("record") PrisionAdmin record, @Param("example") PrisionAdminExample example);

    int updateByPrimaryKeySelective(PrisionAdmin record);

    int updateByPrimaryKey(PrisionAdmin record);
}