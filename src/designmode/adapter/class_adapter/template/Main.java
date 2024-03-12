package designmode.adapter.class_adapter.template;

class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.targetMethod1();
        target.targetMethod2();
    }
}
