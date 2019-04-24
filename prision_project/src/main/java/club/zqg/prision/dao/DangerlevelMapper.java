package club.zqg.prision.dao;

import club.zqg.prision.domain.Dangerlevel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DangerlevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table danger_level
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    int deleteByPrimaryKey(Short dangerLevelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table danger_level
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    int insert(Dangerlevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table danger_level
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    Dangerlevel selectByPrimaryKey(Short dangerLevelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table danger_level
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    List<Dangerlevel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table danger_level
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    int updateByPrimaryKey(Dangerlevel record);
}