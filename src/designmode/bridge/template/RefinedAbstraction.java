package designmode.bridge.template;

/**
 * 改善后的抽象化
 * 1.拓展和改善了Abstraction的功能
 */
class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    /**
     * 新增功能
     */
    public void refinedMethodA(){
        method1();
        method1();
    }

    /**
     * 新增功能
     */
    public void refinedMethodB(){
        method2();
        method2();
    }

    //other new methods
}
