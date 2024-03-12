package designmode.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class ProxyFactory {
    //维护一个目标对象object
    private Object target = null;
    //构造器：对target进行初始化
    public ProxyFactory(Object target){
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance(){
        //ClassLoader loader:指定目标对象所使用的类加载器，获取加载器的方法固定
        //Class<?>[] interfaces:目标对象所拓展的接口类型，使用泛型方法确认类型
        //InvocationHandler h:时间处理
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {     //调用目标对象的方法
                System.out.println("JDK动态代理开始......");
                //使用反射机制调用目标对象的方法
                Object ret = method.invoke(target,args);
                System.out.println("JDK动态代理结束......");
                return ret;
            }
        });
    }
}
