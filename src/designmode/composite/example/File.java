package designmode.composite.example;

class File extends Entry{
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
    }

    @Override
    protected void traverse(String prefix) {
        ;
    }

    @Override
    public String toString() {
        return name+":"+getSize();
    }
}
