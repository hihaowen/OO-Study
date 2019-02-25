/**
 * 图书馆某图书信息
 */
public class LibraryBookInfoEntity
{
    /**
     * 图书在图书馆中的ID
     */
    private int BookId;

    /**
     * 图书名称
     */
    private String BookName;

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public int getBookId() {
        return BookId;
    }

    public String getBookName() {
        return BookName;
    }
}
