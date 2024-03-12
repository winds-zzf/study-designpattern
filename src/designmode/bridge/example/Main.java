package designmode.bridge.example;

class Main {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        test4();
    }

    /**
     * 测试示例程序
     */
    private static void test1(){
        Display d1 = new Display(new StringDisplayImpl("Hello,China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello,World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello,Universe."));        //CountDisplay增加了mutiDisplay的功能
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }

    /**
     * 测试RandomDisplay（新增功能）
     */
    private static void test2(){
        Display d1 = new RandomDisplay(new StringDisplayImpl("Hello,China."));
        RandomDisplay d2 = new RandomDisplay(new StringDisplayImpl("Hello,World."));
        d1.display();
        d2.display();
        d2.randomDisplay(10);
    }

    /**
     * 测试TextDisplayImpl(新增实现)
     */
    private static void test3(){
        Display d1 = new Display(new TextDisplayImpl("test.txt"));
        d1.display();
    }

    /**
     * 测试DecorateDisplayImpl(新增实现)
     */
    private static void test4(){
        Display d1 = new Display(new DecorateDisplayImpl('<','*','>',4,1));
        Display d2 = new Display(new DecorateDisplayImpl('|','*','-',6,2));
        d1.display();
        d2.display();
    }
}