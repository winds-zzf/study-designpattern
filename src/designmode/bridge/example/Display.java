package designmode.bridge.example;

/**
 * 功能层次结构的顶层类
 * 当我需要在当前功能层次结构中添加新功能时，我需要先看看我要添加的功能和功能层次结构中的哪一个比较接近，然后在这个类的基础上派生该新功能
 * Display
 * |___RandomDisplay（功能接近于Display）
 * |___CountDisplay
 *        |___DetailCountDisplay（功能接近于CountDisplay）
 */
class Display {
    /**
     * 在功能结构顶层类中持有实现结构顶层类或接口的引用，这个引用就是桥接模式的桥梁，这里的桥梁是impl
     */
    private DisplayImpl impl;

    public Display(DisplayImpl impl){
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawClose();
    }

    public final void display(){
        open();
        print();
        close();
    }
}
