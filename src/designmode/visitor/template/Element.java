package designmode.visitor.template;

/**
 * Element是Visitor的访问对象，定义了被Visitor访问所具备的API
 * 继承了该接口的类都是可以被访问器访问的
 */
interface Element {
    /**
     * accept()是固定的结构，在方法体中调用visitor的visit()方法以允许该元素被访问
     * 通过accept()方法将对元素的操作转移到Visitor的visit()上
     * @param visitor
     */
    void accept(Visitor visitor);
}
