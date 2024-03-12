package designmode.adapter.object_adapter.template2;

class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void targetMethod1() {
        adaptee.providedMethod1();
    }

    @Override
    public void targetMethod2() {
        adaptee.providedMethod2();
    }
}
