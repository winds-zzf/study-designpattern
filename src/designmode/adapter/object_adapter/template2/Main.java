package designmode.adapter.object_adapter.template2;


class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new ConcreteAdaptee();
        Target target = new Adapter(adaptee);
        target.targetMethod1();
        target.targetMethod2();
    }
}
