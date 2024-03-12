package designmode.adapter.object_adapter.template2;

/**
 * 具体的被适配对象，它所能提供的功能通过Adaptee接口对外暴露
 */
class ConcreteAdaptee implements Adaptee{

    public ConcreteAdaptee(){

    }

    @Override
    public void providedMethod1() {
       System.out.println("provided method 1");
    }

    @Override
    public void providedMethod2() {
        System.out.println("provided method 2");
    }
}
