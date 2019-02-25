/**
 * 借书场景测试
 */
public class BorrowBookTestDrive
{
    public static void main(String[] args)
    {
        UserEntity user =  new UserEntity();
        user.setId(1);
        user.setName("George");

        BookEntity book = new BookEntity();
        book.setAuthor("Eric Evans");
        book.setName("领域驱动");
        book.setPublishTs(2002);

        BorrowBookContext borrowBookContext = new BorrowBookContext();
        borrowBookContext.process(user, book);
    }
}
