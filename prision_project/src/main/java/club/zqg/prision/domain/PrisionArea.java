package club.zqg.prision.domain;

public class PrisionArea {
    private Short areaId;

    private String areaName;

    public Short getAreaId() {
        return areaId;
    }

    public void setAreaId(Short areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }
}