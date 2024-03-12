package designmode.facade.template;

/**
 * Facade角色向系统外部提供高层接口（API）
 * 综合利用许多类的功能来完成一些复杂的功能，但是API却很简洁
 */
class Facade {
    /**
     * 构成系统的其他角色：系统使用了许多其他的角色，并综合利用他们功能来实现一些API方法
     */
    private ClassA classA;
    private ClassB classB;
    private ClassC classC;

    public Facade(){
        this.classA = new ClassA();
        this.classB = new ClassB();
        this.classC = new ClassC();
    }

    /**
     * 向高层提供的简化的API接口
     */
    public void method1(){
        classA.methodA1();
        classB.methodB1();
        classC.methodC1();
    }
    public void method2(){
        classA.methodA2();
        classB.methodB2();
        classC.methodC2();
    }
    //more simple API methods
}
