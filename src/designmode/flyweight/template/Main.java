package designmode.flyweight.template;

class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = FlyweightFactory.getInstance();
        Flyweight flyweight1 = factory.getFlyweight("A");
        Flyweight flyweight2 = factory.getFlyweight("B");
        Flyweight flyweight3 = factory.getFlyweight("C");
        Flyweight flyweight4 = factory.getFlyweight("D");
        Flyweight flyweight5 = factory.getFlyweight("A");
        Flyweight flyweight6 = factory.getFlyweight("B");

        System.out.println(flyweight1);
        System.out.println(flyweight2);
        System.out.println(flyweight3);
        System.out.println(flyweight4);
        System.out.println(flyweight5);
        System.out.println(flyweight6);
        //测试是否是同一个实例
        System.out.println(flyweight1==flyweight5);
        System.out.println(flyweight2==flyweight6);
    }
}
