package designmode.proxy.dynamic;

class Client {
    public static void main(String[] args){
        TargetObject target = new TargetObject();       //创建目标对象,依赖于TargetInterface接口
        TargetInterface proxy = (TargetInterface) new ProxyFactory(target).getProxyInstance();
        proxy.teach();
    }
}
