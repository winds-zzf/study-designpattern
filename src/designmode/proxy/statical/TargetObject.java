package designmode.proxy.statical;

class TargetObject implements TargetInterface{
    @Override
    public void teach() {
        System.out.println("Teaching......");
    }
}