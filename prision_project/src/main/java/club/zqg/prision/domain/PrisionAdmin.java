package club.zqg.prision.domain;

public class PrisionAdmin {
    private Short prisionAdminId;

    private String prisionAdminName;

    private String prisionAdminPwd;

    public Short getPrisionAdminId() {
        return prisionAdminId;
    }

    public void setPrisionAdminId(Short prisionAdminId) {
        this.prisionAdminId = prisionAdminId;
    }

    public String getPrisionAdminName() {
        return prisionAdminName;
    }

    public void setPrisionAdminName(String prisionAdminName) {
        this.prisionAdminName = prisionAdminName == null ? null : prisionAdminName.trim();
    }

    public String getPrisionAdminPwd() {
        return prisionAdminPwd;
    }

    public void setPrisionAdminPwd(String prisionAdminPwd) {
        this.prisionAdminPwd = prisionAdminPwd == null ? null : prisionAdminPwd.trim();
    }
}