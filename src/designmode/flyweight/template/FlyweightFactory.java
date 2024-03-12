package designmode.flyweight.template;

import java.util.HashMap;

/**
 * 轻量级工厂（蝇量工厂）
 * 1.蝇量工厂角色是用于生成Flyweight角色的工厂
 * 2.使用单例模式获取工厂实例
 * 3.使用HashMap类型的pool来存储已创建的Flyweight实例
 * 4.蝇量模式：通过共享实例减少内存使用量
 */
class FlyweightFactory {
    /**
     * pool：用于存储共享的Flyweight对象，只有用到的时候才会添加信息对象实例
     */
    private HashMap<String,Flyweight> flyweights;

    /**
     * 单例模式
     */
    private static FlyweightFactory factory = new FlyweightFactory();
    private FlyweightFactory(){
        flyweights = new HashMap<>();
    }
    public static FlyweightFactory getInstance() {
        return factory;
    }

    /**
     * 获取蝇量的方法
     * 使用同步方法，保证并发访问时的线程安全
     */
    public synchronized Flyweight getFlyweight(String name){
        Flyweight flyweight = flyweights.get(name);
        if(flyweight==null){    //用到的时候查找，不存在该实例的时候才进行创建
            flyweight = new Flyweight(name);
            flyweights.put(name,flyweight);     //保存新建的Flyweight实例，下次可以直接使用
        }
        return flyweight;
    }
}
