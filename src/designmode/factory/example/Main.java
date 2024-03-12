package designmode.factory.example;

class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();

        factory = new BookFactory();
        Product book1 = factory.create("《Book1》");
        Product book2 = factory.create("《Book2》");
        Product book3 = factory.create("《Book3》");
        book1.use();
        book2.use();
        book3.use();
    }
}
