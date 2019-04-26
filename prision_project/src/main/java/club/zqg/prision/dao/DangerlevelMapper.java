package club.zqg.prision.dao;

import club.zqg.prision.domain.Dangerlevel;
import club.zqg.prision.domain.DangerlevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DangerlevelMapper {
    long countByExample(DangerlevelExample example);

    int deleteByExample(DangerlevelExample example);

    int deleteByPrimaryKey(Short dangerLevelId);

    int insert(Dangerlevel record);

    int insertSelective(Dangerlevel record);

    List<Dangerlevel> selectByExample(DangerlevelExample example);

    Dangerlevel selectByPrimaryKey(Short dangerLevelId);

    int updateByExampleSelective(@Param("record") Dangerlevel record, @Param("example") DangerlevelExample example);

    int updateByExample(@Param("record") Dangerlevel record, @Param("example") DangerlevelExample example);

    int updateByPrimaryKeySelective(Dangerlevel record);

    int updateByPrimaryKey(Dangerlevel record);
}