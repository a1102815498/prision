package club.zqg.prision.domain;

public class PrisionPolice {
    private Integer policeId;

    private String policeName;

    private Short rankId;

    private Short areaId;

    public Integer getPoliceId() {
        return policeId;
    }

    public void setPoliceId(Integer policeId) {
        this.policeId = policeId;
    }

    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName == null ? null : policeName.trim();
    }

    public Short getRankId() {
        return rankId;
    }

    public void setRankId(Short rankId) {
        this.rankId = rankId;
    }

    public Short getAreaId() {
        return areaId;
    }

    public void setAreaId(Short areaId) {
        this.areaId = areaId;
    }
}