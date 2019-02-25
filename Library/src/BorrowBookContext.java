/**
 * 借书场景
 */
public class BorrowBookContext
{
    public void process(UserEntity user, BookEntity book)
    {
        // 用户以借书人的身份借书
        BorrowerRole borrower = new BorrowerRole((UserEntity) user);
        borrower.borrowBook(book);
    }
}
