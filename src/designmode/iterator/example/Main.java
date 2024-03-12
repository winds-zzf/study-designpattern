package designmode.iterator.example;

class Main {
    public static void main(String[] argv){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Book1"));
        bookShelf.appendBook(new Book("Book2"));
        bookShelf.appendBook(new Book("Book3"));
        bookShelf.appendBook(new Book("Book4"));
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
