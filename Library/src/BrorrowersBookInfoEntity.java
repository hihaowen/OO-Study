/**
 * 某人借的书的信息
 */
public class BrorrowersBookInfoEntity
{
    /**
     * 书名
     */
    private System bookName;

    /**
     * 书在图书馆中的ID
     */
    private int bookId;

    /**
     * 用户ID
     */
    private int userId;

    public int getBookId() {
        return bookId;
    }

    public int getUserId() {
        return userId;
    }

    public System getBookName() {
        return bookName;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(System bookName) {
        this.bookName = bookName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
