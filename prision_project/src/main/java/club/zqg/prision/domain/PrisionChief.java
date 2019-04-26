package club.zqg.prision.domain;

public class PrisionChief {
    private Integer chiefId;

    private String chiefName;

    private Short chiefRankId;

    public Integer getChiefId() {
        return chiefId;
    }

    public void setChiefId(Integer chiefId) {
        this.chiefId = chiefId;
    }

    public String getChiefName() {
        return chiefName;
    }

    public void setChiefName(String chiefName) {
        this.chiefName = chiefName == null ? null : chiefName.trim();
    }

    public Short getChiefRankId() {
        return chiefRankId;
    }

    public void setChiefRankId(Short chiefRankId) {
        this.chiefRankId = chiefRankId;
    }
}