package club.zqg.prision.domain;

public class Dangerlevel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column danger_level.danger_level_id
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    private Short dangerLevelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column danger_level.danger_level_name
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    private String dangerLevelName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danger_level.danger_level_id
     *
     * @return the value of danger_level.danger_level_id
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public Short getDangerLevelId() {
        return dangerLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danger_level.danger_level_id
     *
     * @param dangerLevelId the value for danger_level.danger_level_id
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public void setDangerLevelId(Short dangerLevelId) {
        this.dangerLevelId = dangerLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column danger_level.danger_level_name
     *
     * @return the value of danger_level.danger_level_name
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public String getDangerLevelName() {
        return dangerLevelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column danger_level.danger_level_name
     *
     * @param dangerLevelName the value for danger_level.danger_level_name
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public void setDangerLevelName(String dangerLevelName) {
        this.dangerLevelName = dangerLevelName == null ? null : dangerLevelName.trim();
    }
}