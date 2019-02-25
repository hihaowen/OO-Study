/**
 * 参与者：图书馆（服务）
 */
public class LibraryService
{
    /**
     * 导入图书
     *
     * @param book
     */
    public void storeBook(BookEntity book)
    {
        System.out.println("导入图书成功，图书名字为: " + book.getName());
    }

    /**
     * 把书给借书人
     *
     * 检查书是否有可用，减库存，并记录下来
     *
     * @param book
     * @param borrower
     */
    public void giveBookToBorrower(BookEntity book, BorrowerRole borrower)
    {
        // 如果图书不存在则抛异常
        LibraryBookInfoEntity storeBookInfo = getBookInfoByBookName(book.getName());
        if (storeBookInfo.getBookId() == 0) {
            System.out.println("图书不存在: " + book.getName());
        }

        // 将图书状态设置为已借出
        System.out.println("该书设置成已借出: " + book.getName());

        // 生成某人借的书的信息并保存
        System.out.println("该书已生成'某人借的书的信息': " + borrower.getUserId());
    }

    /**
     * 根据图书名称查找图书信息
     *
     * @param bookName
     * @return
     */
    private LibraryBookInfoEntity getBookInfoByBookName(String bookName)
    {
        LibraryBookInfoEntity bookInfo = new LibraryBookInfoEntity();
        bookInfo.setBookId(1);
        bookInfo.setBookName(bookName);

        return bookInfo;
    }
}

