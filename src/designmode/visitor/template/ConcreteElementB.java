package designmode.visitor.template;

/**
 * 具体数据结构节点
 */
class ConcreteElementB implements Element{

    public void doSomething(){
        System.out.println("this is concrete element B");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
