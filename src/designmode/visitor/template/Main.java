package designmode.visitor.template;

import java.util.Iterator;

/**
 * Visitor模式的目的是将处理从数据结构中分离出来
 * 保存数据结构和以数据结构为基础进行处理是不同的
 * ObjectStructure和Element用于保存数据结构，而Visitor用于对数据结构进行处理
 */
class Main {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementB());
        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementB());

        /**
         * 定义一个访问器
         */
        Visitor visitor = new ConcreteVisitor();

        Iterator<Element> it = structure.iterator();
        while (it.hasNext()){
            it.next().accept(visitor);      //调用元素的accept()方法以访问元素
        }
    }
}
