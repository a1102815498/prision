package club.zqg.prision.domain;

public class PrisionRank {
    private Short rankId;

    private String rankName;

    public Short getRankId() {
        return rankId;
    }

    public void setRankId(Short rankId) {
        this.rankId = rankId;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName == null ? null : rankName.trim();
    }
}