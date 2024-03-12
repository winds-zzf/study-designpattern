package designmode.bridge.template;

/**
 * 实现者:
 * 1.这里的实现并不是实现一个接口，而是指的是实现了类的功能层次结构顶层类的抽象API，
 * 实现层次结构:
 * Implementor
 * |___ConcreteImplementor
 * |___OtherImplementor
 */
abstract class Implementor {
    public abstract void implMethod1();
    public abstract void implMethod2();
}
