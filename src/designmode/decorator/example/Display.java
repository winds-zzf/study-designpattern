package designmode.decorator.example;

/**
 * 抽象父类，可以理解为父节点，类似于组合模式为了保持一致性而定义的抽象父类
 * 结构：
 * <p>Component
 * <p>|____Decorator
 * <p>|____ConcreteComponent
 */
abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);

    public final void show(){
        for(int i=0;i<getRows();i++){
            System.out.println(getRowText(i));
        }
    }
}
