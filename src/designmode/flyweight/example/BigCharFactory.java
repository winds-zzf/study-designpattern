package designmode.flyweight.example;

import java.util.HashMap;

/**
 * 表示生成和共用BigChar类的实例的类
 */
class BigCharFactory {
    //管理已经生成的BigChar实例
    private HashMap<Character,BigChar> pool;
    //Singleton模式
    private static BigCharFactory singleton = new BigCharFactory();
    //构造函数
    private BigCharFactory(){
        pool = new HashMap<>();
    }
    //获取实例
    public static BigCharFactory getInstance(){
        return singleton;
    }

    //获取BigChar
    public synchronized BigChar getBigChar(char name){
        BigChar bc = pool.get(name);
        if(bc==null){
            bc = new BigChar(name);
            pool.put(name,bc);
        }
        return bc;
    }
}
