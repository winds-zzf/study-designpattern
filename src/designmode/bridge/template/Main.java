package designmode.bridge.template;

class Main {
    public static void main(String[] args) {
        Implementor impl = new ConcreteImplementor();
        Abstraction ab = new Abstraction(impl);   //建立起两个结构层次顶层之间的桥梁
        RefinedAbstraction rab = new RefinedAbstraction(impl);
        ab.method3();
        rab.method3();
        rab.refinedMethodA();
        rab.refinedMethodB();
    }
}
