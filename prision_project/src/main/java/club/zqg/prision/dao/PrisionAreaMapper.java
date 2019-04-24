package club.zqg.prision.dao;

import club.zqg.prision.domain.PrisionArea;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrisionAreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prision_area
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    int deleteByPrimaryKey(Short areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prision_area
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    int insert(PrisionArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prision_area
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    PrisionArea selectByPrimaryKey(Short areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prision_area
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    List<PrisionArea> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prision_area
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    int updateByPrimaryKey(PrisionArea record);
}