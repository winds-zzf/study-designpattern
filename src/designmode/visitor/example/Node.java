package designmode.visitor.example;

/**
 * 被访问数据结构元素
 */
class Node implements Element{
    protected String name;
    private Node node = null;

    public Node(String name){
        this.name = name;
    }

    public void append(Node node) {
        this.node = node;
    }

    public String getName() {
        return name;
    }

    public Node next() {
        return node;
    }

    /**
     *  这是一种固定的写法
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
