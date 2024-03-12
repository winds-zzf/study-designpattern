package designmode.adapter.object_adapter.template1;


class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.targetMethod1();
        target.targetMethod2();
    }
}
