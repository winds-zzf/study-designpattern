package designmode.singleton.template;

/**
 * 单例模式的类：
 * 注意：如果是多线程使用单例模式，要考虑线程安全问题
 * 为什么使用static？构造器是私有的，只能通过静态方法getInstance()获取实例，实例Singleton也必须是static的
 * 单例并不是只能生成一个该类的对象，也可以限制为指定个数
 */
class Singleton {
    /**
     * 私有单例变量
     * 在类被加载的时候初始化
     */
    private static Singleton singleton = new Singleton();

    /**
     * 私有构造器
     * 为了禁止从Singleton外部调用构造函数，从而保证Singleton的唯一性
     */
    private Singleton(){
        //singleton = new Singleton();  //错误写法，这样就陷入了递归死循环
    }

    /**
     * 静态获取方法
     * 提供从程序外部唯一获取Singleton的方法
     * getInstance()是习惯命名
     */
    public static Singleton getInstance(){
        return singleton;
    }
}
