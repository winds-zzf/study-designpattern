package designmode.singleton.example;

/**
 * 只存在一个实例的类
 */
class Singleton {
    private static Singleton singleton = new Singleton();

    /**
     * 私有构造器
     */
    private Singleton(){
        //singleton = new Singleton();  //错误写法
        System.out.println("生成一个实例");
    }

    /**
     * 静态获取方法
     */
    public static Singleton getInstance(){
        return singleton;
    }

}
