package club.zqg.prision.domain;

import java.util.Date;

public class Prisioner {

    public Prisioner() {
    }

    public Prisioner(Integer prisionId, String prisionName, String prisionHome) {
        this.prisionId = prisionId;
        this.prisionName = prisionName;
        this.prisionHome = prisionHome;
    }

    private Integer prisionId;

    private String prisionName;

    private Short prisionAge;

    private String prisionHome;

    private String prisionCard;

    private Date prisionEnterDate;

    private Date prisionFinshDate;

    private Short prisionDangerLevelId;

    private String prisionRelativeTel;

    private Integer prisionPoliceId;

    private PrisionPolice prisionPolice; // 关联狱警

    private Dangerlevel dangerlevel; // 关联危险等级

    public Dangerlevel getDangerlevel() {
        return dangerlevel;
    }

    public PrisionPolice getPrisionPolice() {
        return prisionPolice;
    }

    public void setDangerlevel(Dangerlevel dangerlevel) {
        this.dangerlevel = dangerlevel;
    }

    public void setPrisionPolice(PrisionPolice prisionPolice) {
        this.prisionPolice = prisionPolice;
    }

    public Integer getPrisionId() {
        return prisionId;
    }

    public void setPrisionId(Integer prisionId) {
        this.prisionId = prisionId;
    }

    public String getPrisionName() {
        return prisionName;
    }

    public void setPrisionName(String prisionName) {
        this.prisionName = prisionName == null ? null : prisionName.trim();
    }

    public Short getPrisionAge() {
        return prisionAge;
    }

    public void setPrisionAge(Short prisionAge) {
        this.prisionAge = prisionAge;
    }

    public String getPrisionHome() {
        return prisionHome;
    }

    public void setPrisionHome(String prisionHome) {
        this.prisionHome = prisionHome == null ? null : prisionHome.trim();
    }

    public String getPrisionCard() {
        return prisionCard;
    }

    public void setPrisionCard(String prisionCard) {
        this.prisionCard = prisionCard == null ? null : prisionCard.trim();
    }

    public Date getPrisionEnterDate() {
        return prisionEnterDate;
    }

    public void setPrisionEnterDate(Date prisionEnterDate) {
        this.prisionEnterDate = prisionEnterDate;
    }

    public Date getPrisionFinshDate() {
        return prisionFinshDate;
    }

    public void setPrisionFinshDate(Date prisionFinshDate) {
        this.prisionFinshDate = prisionFinshDate;
    }

    public Short getPrisionDangerLevelId() {
        return prisionDangerLevelId;
    }

    public void setPrisionDangerLevelId(Short prisionDangerLevelId) {
        this.prisionDangerLevelId = prisionDangerLevelId;
    }

    public String getPrisionRelativeTel() {
        return prisionRelativeTel;
    }

    public void setPrisionRelativeTel(String prisionRelativeTel) {
        this.prisionRelativeTel = prisionRelativeTel == null ? null : prisionRelativeTel.trim();
    }

    public Integer getPrisionPoliceId() {
        return prisionPoliceId;
    }

    public void setPrisionPoliceId(Integer prisionPoliceId) {
        this.prisionPoliceId = prisionPoliceId;
    }

    @Override
    public String toString() {
        return "Prisioner{" +
                "prisionId=" + prisionId +
                ", prisionName='" + prisionName + '\'' +
                ", prisionAge=" + prisionAge +
                ", prisionHome='" + prisionHome + '\'' +
                ", prisionCard='" + prisionCard + '\'' +
                ", prisionEnterDate=" + prisionEnterDate +
                ", prisionFinshDate=" + prisionFinshDate +
                ", prisionDangerLevelId=" + prisionDangerLevelId +
                ", prisionRelativeTel='" + prisionRelativeTel + '\'' +
                ", prisionPoliceId=" + prisionPoliceId +
                ", prisionPolice=" + prisionPolice +
                ", dangerlevel=" + dangerlevel +
                '}';
    }
}