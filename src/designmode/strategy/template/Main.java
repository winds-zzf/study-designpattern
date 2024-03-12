package designmode.strategy.template;

class Main {
    public static void main(String[] args) {
        Context context1 = new Context(new ConcreteStrategy1());        //使用策略1提供的算法去解决问题
        Context context2 = new Context(new ConcreteStrategy2());        //使用策略2提供的算法去解决问题
        context1.contextMethod();
        context2.contextMethod();
    }
}
