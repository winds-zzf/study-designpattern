package designmode.bridge.template;

class ConcreteImplementor extends Implementor{
    @Override
    public void implMethod1() {
        System.out.println("implement method 1");
    }

    @Override
    public void implMethod2() {
        System.out.println("implement method 2");
    }
}
