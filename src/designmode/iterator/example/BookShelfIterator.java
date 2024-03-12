package designmode.iterator.example;

/**
 * 针对书架（聚合角色）的迭代器
 */
public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;    //关联书架对象，一对一关联
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        if(index< bookShelf.getLength()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}
