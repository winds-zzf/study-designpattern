package designmode.composite.template;

class Main {
    public static void main(String[] args) {
        Branch root = new Branch("root");
        Branch branch1 = new Branch("branch1");
        Branch branch2 = new Branch("branch2");

        Leaf leaf1 = new Leaf("leaf1.txt");
        Leaf leaf2 = new Leaf("leaf2.txt");

        root.add(branch1);
        root.add(leaf2);
        branch1.add(branch2);
        branch1.add(leaf1);


        root.traverse("/root");
    }
}
