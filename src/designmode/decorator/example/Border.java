package designmode.decorator.example;

/**
 * 装饰器：对具体的类进行修饰
 */
abstract class Border extends Display{
    /**
     * 1.需要持有被修饰对象的引用
     * 2.因为装饰器和被装饰对象都是继承自Display，因此装饰器即可以装饰目标对象，也可以装饰装饰器，这里就是组合模式的一致性
     * 3.与组合模式不同的是，组合模式里的引用是一对多的关系，这里是一对一的关系
     * 4.注意：display不能设置为private方法，应为private字段对子类是隐藏的
     */
    protected Display display;
    protected Border(Display display){
        this.display = display;
    }
}
