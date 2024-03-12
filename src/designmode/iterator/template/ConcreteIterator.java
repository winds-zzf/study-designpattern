package designmode.iterator.template;

public class ConcreteIterator implements Iterator{
    private Aggregate aggregate;    //持有和维护聚合的引用
    private int index;              //索引

    public ConcreteIterator(Aggregate aggregate){
        this.aggregate = aggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index<aggregate.size();
    }

    @Override
    public Object next() {
        return aggregate.get(index++);
    }
}
