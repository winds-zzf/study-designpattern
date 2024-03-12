package designmode.proxy.statical;

class Proxy implements TargetInterface{
    TargetInterface target;             //hold the references of target object

    public Proxy(TargetInterface target){
        this.target = target;
    }
    @Override
    public void teach() {
        System.out.println("执行代理......");
        target.teach();                         //invoke the target object's method
        System.out.println("代理执行结束......");
    }
}
