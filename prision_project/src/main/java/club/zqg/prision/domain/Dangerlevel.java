package club.zqg.prision.domain;

public class Dangerlevel {
    private Short dangerLevelId;

    private String dangerLevelName;

    public Short getDangerLevelId() {
        return dangerLevelId;
    }

    public void setDangerLevelId(Short dangerLevelId) {
        this.dangerLevelId = dangerLevelId;
    }

    public String getDangerLevelName() {
        return dangerLevelName;
    }

    public void setDangerLevelName(String dangerLevelName) {
        this.dangerLevelName = dangerLevelName == null ? null : dangerLevelName.trim();
    }
}