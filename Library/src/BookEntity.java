/**
 * 参与者：书
 */
public class BookEntity
{
    /**
     * 书名
     */
    private String name;

    /**
     * 作者
     */
    private String author;

    /**
     * 发行时间
     */
    private int publishTs;

    public void setName(String name) {
        this.name = name;
    }

    public void setPublishTs(int publishTs) {
        this.publishTs = publishTs;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublishTs() {
        return publishTs;
    }

    public String getAuthor() {
        return author;
    }
}
