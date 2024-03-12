package designmode.visitor.example;

class Main {
    public static void main(String[] args) {
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");
        Node node4 = new Node("D");
        Node node5 = new Node("E");
        node1.append(node2);
        node2.append(node3);
        node3.append(node4);
        node4.append(node5);

        node1.accept(new ListVisitor());
    }
}
