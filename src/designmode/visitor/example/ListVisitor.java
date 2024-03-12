package designmode.visitor.example;

/**
 * 具体访问者
 */
class ListVisitor extends Visitor{
    @Override
    void visit(Node node) {
        System.out.println(node.getName());
        if(node.next()!=null)  node.next().accept(this);
    }
}
