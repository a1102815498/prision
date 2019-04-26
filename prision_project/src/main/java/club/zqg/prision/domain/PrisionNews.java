package club.zqg.prision.domain;

public class PrisionNews {
    private Short newsId;

    private String newsContent;

    public Short getNewsId() {
        return newsId;
    }

    public void setNewsId(Short newsId) {
        this.newsId = newsId;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }
}