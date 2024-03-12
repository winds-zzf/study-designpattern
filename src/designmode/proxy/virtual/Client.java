package designmode.proxy.virtual;

class Client {
    public static void main(String[] argv) {
        ProxyObject proxy1 = new ProxyObject();
        ProxyObject proxy2 = new ProxyObject();
        ProxyObject proxy3 = new ProxyObject();
        ProxyObject proxy4 = new ProxyObject();
        //由于仅仅是创建目标对象的代理，并没有创建真正消耗资源的目标对象，所以上面四个代理创建会迅速完成
        System.out.println("proxy end");
        proxy1.display();
        proxy2.display();
        proxy3.display();
        proxy4.display();

        TargetObject real1 = new TargetObject();
        TargetObject real2 = new TargetObject();
        TargetObject real3 = new TargetObject();
        TargetObject real4 = new TargetObject();
        //如果直接创建目标对象的话，每一个目标对象的创建都会花费较多的时间
        System.out.println("real end");
        real1.display();
        real2.display();
        real3.display();
        real4.display();

        //综上，创建四个代理速度远比创建四个真实对象要快的多
        //创建虚拟代理的目的：使用虚拟代理来代替真是实对象，因为初始情况下，代理仅仅持有目标对象的引用，
        //并没有进行目标对象创建，因此创建代理速度要比直接创建目标对象快。
        //要用到目标对象的时候代理会创建目标对象--延时初始化
        //由于目标对象和代理拓展自同一个接口，因此用户操作Proxy就像直接操作目标对象一样
        //在目标对象创建完成后，用户对Proxy的调用将被委托给目标对象执行
        //和普通的静态代理不同之处在于：这里的目标对象并不是在构造时传递过来的，而是在使用时才被创建的，其他大致和静态代理一样
        //对于静态代理来说，代理中维护的目标对象是由外部创建并传入的，但是如果目标对象的创建非常耗时的话，那么创建代理对象也会比较费时，就会影响进程推进速度
        //但是如果将目标对象的实例化延迟到代理对象中的话，创建代理对象的过程就会比较迅速。
    }
}
