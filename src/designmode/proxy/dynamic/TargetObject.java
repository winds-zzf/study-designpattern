package designmode.proxy.dynamic;

class TargetObject implements TargetInterface{
    @Override
    public void teach() {
        System.out.println("Teaching......");
    }
}
