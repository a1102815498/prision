package club.zqg.prision.domain;

import java.util.Date;

public class Prisioner {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prision_prisioner.prision_id
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    private Integer prisionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prision_prisioner.prision_name
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    private String prisionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prision_prisioner.prision_age
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    private Short prisionAge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prision_prisioner.prision_home
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    private String prisionHome;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prision_prisioner.prision_card
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    private String prisionCard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prision_prisioner.prision_enter_date
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    private Date prisionEnterDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prision_prisioner.prision_finsh_date
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    private Date prisionFinshDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prision_prisioner.prision_danger_level_id
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    private Short prisionDangerLevelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prision_prisioner.prision_relative_tel
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    private String prisionRelativeTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prision_prisioner.prision_police_id
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    private Integer prisionPoliceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prision_prisioner.prision_id
     *
     * @return the value of prision_prisioner.prision_id
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public Integer getPrisionId() {
        return prisionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prision_prisioner.prision_id
     *
     * @param prisionId the value for prision_prisioner.prision_id
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public void setPrisionId(Integer prisionId) {
        this.prisionId = prisionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prision_prisioner.prision_name
     *
     * @return the value of prision_prisioner.prision_name
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public String getPrisionName() {
        return prisionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prision_prisioner.prision_name
     *
     * @param prisionName the value for prision_prisioner.prision_name
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public void setPrisionName(String prisionName) {
        this.prisionName = prisionName == null ? null : prisionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prision_prisioner.prision_age
     *
     * @return the value of prision_prisioner.prision_age
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public Short getPrisionAge() {
        return prisionAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prision_prisioner.prision_age
     *
     * @param prisionAge the value for prision_prisioner.prision_age
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public void setPrisionAge(Short prisionAge) {
        this.prisionAge = prisionAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prision_prisioner.prision_home
     *
     * @return the value of prision_prisioner.prision_home
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public String getPrisionHome() {
        return prisionHome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prision_prisioner.prision_home
     *
     * @param prisionHome the value for prision_prisioner.prision_home
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public void setPrisionHome(String prisionHome) {
        this.prisionHome = prisionHome == null ? null : prisionHome.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prision_prisioner.prision_card
     *
     * @return the value of prision_prisioner.prision_card
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public String getPrisionCard() {
        return prisionCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prision_prisioner.prision_card
     *
     * @param prisionCard the value for prision_prisioner.prision_card
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public void setPrisionCard(String prisionCard) {
        this.prisionCard = prisionCard == null ? null : prisionCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prision_prisioner.prision_enter_date
     *
     * @return the value of prision_prisioner.prision_enter_date
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public Date getPrisionEnterDate() {
        return prisionEnterDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prision_prisioner.prision_enter_date
     *
     * @param prisionEnterDate the value for prision_prisioner.prision_enter_date
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public void setPrisionEnterDate(Date prisionEnterDate) {
        this.prisionEnterDate = prisionEnterDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prision_prisioner.prision_finsh_date
     *
     * @return the value of prision_prisioner.prision_finsh_date
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public Date getPrisionFinshDate() {
        return prisionFinshDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prision_prisioner.prision_finsh_date
     *
     * @param prisionFinshDate the value for prision_prisioner.prision_finsh_date
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public void setPrisionFinshDate(Date prisionFinshDate) {
        this.prisionFinshDate = prisionFinshDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prision_prisioner.prision_danger_level_id
     *
     * @return the value of prision_prisioner.prision_danger_level_id
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public Short getPrisionDangerLevelId() {
        return prisionDangerLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prision_prisioner.prision_danger_level_id
     *
     * @param prisionDangerLevelId the value for prision_prisioner.prision_danger_level_id
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public void setPrisionDangerLevelId(Short prisionDangerLevelId) {
        this.prisionDangerLevelId = prisionDangerLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prision_prisioner.prision_relative_tel
     *
     * @return the value of prision_prisioner.prision_relative_tel
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public String getPrisionRelativeTel() {
        return prisionRelativeTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prision_prisioner.prision_relative_tel
     *
     * @param prisionRelativeTel the value for prision_prisioner.prision_relative_tel
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public void setPrisionRelativeTel(String prisionRelativeTel) {
        this.prisionRelativeTel = prisionRelativeTel == null ? null : prisionRelativeTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prision_prisioner.prision_police_id
     *
     * @return the value of prision_prisioner.prision_police_id
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public Integer getPrisionPoliceId() {
        return prisionPoliceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prision_prisioner.prision_police_id
     *
     * @param prisionPoliceId the value for prision_prisioner.prision_police_id
     *
     * @mbg.generated Wed Apr 24 21:27:31 CST 2019
     */
    public void setPrisionPoliceId(Integer prisionPoliceId) {
        this.prisionPoliceId = prisionPoliceId;
    }
}