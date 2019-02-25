/**
 * 图书入库场景
 */
public class StoreBookContext
{
    private LibraryService libraryService;

    public void process(BookEntity book)
    {
        libraryService.storeBook(book);
    }
}
