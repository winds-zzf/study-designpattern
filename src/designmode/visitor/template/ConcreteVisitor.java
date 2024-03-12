package designmode.visitor.template;

/**
 * 具体的访问者
 * 具体实现了访问数据结构元素的功能
 */
class ConcreteVisitor extends Visitor{

    /**
     * 具体实现了相关的访问方法
     */
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("访问并处理结点中.....");
        elementA.doSomething();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("访问并处理结点中.....");
        elementB.doSomething();
    }
}
