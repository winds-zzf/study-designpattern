package designmode.visitor.template;

/**
 * 具体数据结构元素（树节点，链表节点等）
 * 实现Element接口的accept()方法，用于接受访问器的访问
 */
class ConcreteElementA implements Element{

    public void doSomething(){
        System.out.println("this is concrete element A");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
