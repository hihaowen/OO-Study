/**
 * 角色：借书人
 */
public class BorrowerRole
{
    private UserEntity user;
    private LibraryService libraryService;

    public BorrowerRole(UserEntity userEntity)
    {
        user = userEntity;
        libraryService = new LibraryService();
    }

    /**
     * 借书
     *
     * @param book
     */
    public void borrowBook(BookEntity book)
    {
        libraryService.giveBookToBorrower(book, this);
    }

    /**
     * 获取用户ID
     *
     * @return
     */
    public int getUserId()
    {
        return this.user.getId();
    }
}
