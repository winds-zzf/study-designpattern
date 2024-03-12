package designmode.iterator.example;

/**
 * Aggregate：继承自Aggregate的类具有聚合的功能，需要能够返回迭代器
 */
class BookShelf implements Aggregate{
    private Book[] books;       //Aggregate:聚合关系，一对多的管关系，一个书架包含了多本书，这里书的生命周期和书架不必同步
    private int last = 0;

    public BookShelf(int number){
        books = new Book[number];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        this.last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
