package designmode.factory.template;

class Main {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product1 = factory.create("1");
        Product product2 = factory.create("2");
        Product product3 = factory.create("3");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
