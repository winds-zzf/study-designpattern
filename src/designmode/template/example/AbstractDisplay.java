package designmode.template.example;

/**
 * open(),print(),close()是模板方法模式需要的子方法(抽象方法)
 * display()才是真正的模板方法（普通方法）
 */
abstract class AbstractDisplay {
    protected abstract void open();
    protected abstract void print();
    protected abstract void close();

    /**
     * 如果不希望模板方法被修改，只需设置为final方法
     */
    final void display(){
        open();

        for(int i=0;i<5;i++)
            print();

        close();
    }
}
