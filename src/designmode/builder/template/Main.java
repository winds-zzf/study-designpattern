package designmode.builder.template;

class Main {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        System.out.println(((ConcreteBuilder)builder).getResult());
    }
}
