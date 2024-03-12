package designmode.bridge.template;

/**
 * 抽象化:
 * 1.位于类的功能层次结构的顶层
 * 2.这里的抽象指的是功能上的抽象，而不是说这一定是个抽象类,比如说method1()和method2()并没有具体实现，而是将具体实现委托给了Implementor
 * 3.持有类的实现层次结构的顶层抽象的引用，在这两个顶层之间架起一座桥梁，是的他们彼此联系，但又相对独立
 * 功能层次结构:
 * Abstraction
 * |___RefinedAbstraction
 * |___OtherRefinedAbstraction
 */
class Abstraction {
    /**
     * 功能层次结构的顶层父类持有实现结构层次的顶层抽象的引用，
     * 这样这个引用就成了功能层次结构和实现层次结构的桥梁
     */
    private Implementor impl;

    /**
     * 通过构造函数传入Implementor的引用，从而建立起功能层次结构和实现层次结构之间的桥梁
     */
    public Abstraction(Implementor impl){
        this.impl = impl;
    }

    /**
     * 抽象API，需要委托Implementor实现
     */
    public void method1(){
        impl.implMethod1();
    }

    /**
     * 抽象API，需要委托Implementor实现
     */
    public void method2(){
        impl.implMethod2();
    }

    //others abstract APIs

    public void method3(){
        method1();
        method2();
    }

    //others plain methods
}
