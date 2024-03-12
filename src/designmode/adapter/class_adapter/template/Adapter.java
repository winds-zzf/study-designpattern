package designmode.adapter.class_adapter.template;

/**
 * 适配器对象
 * 通过继承被适配类从而获得被适配类提供的方法，利用这些仅有的方法实现目标方法
 */
class Adapter extends Adaptee implements Target{
    public Adapter(){
        super();
    }

    @Override
    public void targetMethod1() {
        providedMethod1();
    }

    @Override
    public void targetMethod2() {
        providedMethod2();
    }
}
