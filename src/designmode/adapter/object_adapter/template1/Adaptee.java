package designmode.adapter.object_adapter.template1;

/**
 * 具体的被适配对象
 */
class Adaptee {

    public Adaptee(){

    }

    public void providedMethod1() {
       System.out.println("provided method 1");
    }

    public void providedMethod2() {
        System.out.println("provided method 2");
    }
}
