package designmode.singleton.template;

/**
 * 一个典型的单例模式
 * 广义上的单例模式：可以为该类分配指定种类的实例，每种实例只能有一个
 */
class Hand {
    /**
     * 每一种静态常量对应一种单例模式的实例
     * 这样可以实现获取不同的对象的目的，每一个对象都是一个单例
     */
    public static final int VALUE_GUU = 0;
    public static final int VALUE_CHO = 1;
    public static final int VALUE_PAA = 2;

    /**
     * 静态属性保证当类被加载的时候就完成初始化
     * 最多分配三个实例的单例模式
     */
    public static final Hand[] hands = {
            new Hand(VALUE_GUU),
            new Hand(VALUE_CHO),
            new Hand(VALUE_PAA)
    };
    private int value;
    private Hand(int value){
        this.value = value;
    }
    public static Hand getInstance(int value){
        return hands[value];
    }

    /**
     * 为多个实例分别命名
     */
    private static String[] name = {"石头","剪刀","布"};

    /**
     * 比较结果
     */
    public int compare(Hand that){
        if(this.value == that.value) return 0;
        else if((this.value+1)%3==that.value) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return name[value];
    }
}
