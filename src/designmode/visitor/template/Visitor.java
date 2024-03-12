package designmode.visitor.template;

/**
 * 访问者接口：定义了访问数据结构元素(如树节点，链表节点等)的接口
 */
abstract class Visitor {
    /**
     * 分别用于访问元素ConcreteElementA和元素ConcreteElementB
     * 用于独立的访问数据结构的每个元素
     */
    public abstract void visit(ConcreteElementA element);
    public abstract void visit(ConcreteElementB element);
}
