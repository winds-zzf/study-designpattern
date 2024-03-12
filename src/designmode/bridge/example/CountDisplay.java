package designmode.bridge.example;

/**
 * CountDisplay是Display的派生类，在Display的基础上增添了multiDisplay()功能
 * Display
 * |___CountDisplay
 * 当我需要在当前功能层次结构中添加新功能时，我需要先看看我要添加的功能和功能层次结构中的哪一个比较接近，然后在这个类的基础上派生该新功能
 * Display
 * |___MultiDisplay（功能接近于Display）
 * |___CountDisplay
 *        |___DetailCountDisplay（功能接近于CountDisplay）
 */
class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    /**
     * 处于类的功能层次结构的第二层，继承自Display，并添加了新的功能，所以他属于功能层次结构
     * @param times
     */
    public void multiDisplay(int times){
        open();
        for(int i=0;i<times;i++){
            print();
        }
        close();
    }
}
