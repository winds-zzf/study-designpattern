package designmode.factory.example;

import java.util.LinkedList;
import java.util.List;

class BookFactory extends Factory{
    private List<String> books = new LinkedList<>();

    @Override
    protected Product createProduct(String name) {
        return new Book(name);
    }

    @Override
    protected void registerProduct(Product product) {
        books.add(((Book)product).getName());
    }

    public List<String> getNames(){
        return books;
    }
}
