package designmode.template.template;

/**
 * 抽象类AbstractClass
 * 1.实现模板方法templateMethod
 * 2.声明模板方法中所使用到的抽象方法
 * 核心：在父类中定义程序行为的框架，在子类中决定具体的处理
 * 注意：抽象类中的抽象方法，大概率是抽象类所必需的，不然也没有必要强制其子类去实现这些抽象方法
 */
abstract class AbstractClass {
    /**
     * 抽象方法，
     * 1.由子类具体实现，不同的子类有不同的实现，从而体现不同的功能
     * 2.在不同的环境下，具体实现可能会有所不同，但是抽象接口提供的API不变
     * 3.有时候这些抽象方法不想让无关的类调用，将抽象方法用protected修饰，这样既能避免其他包里无关的类调用抽象方法，又可保证其子类可以实现抽象方法(default域的方法其他包里的子类是看不到的)
     */
    protected abstract void method1();
    protected abstract void method2();
    protected abstract void method3();
    //more abstract methods

    /**
     * 模板方法，在抽象类中实现
     * final避免了子类修改模板方法
     */
    public final void templateMethod(){
        method1();
        method2();
        method3();
    }
    //more template methods
}
