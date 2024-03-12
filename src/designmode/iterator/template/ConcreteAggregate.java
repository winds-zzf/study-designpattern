package designmode.iterator.template;

class ConcreteAggregate implements Aggregate{
    private Element[] elements;
    private int size;

    public ConcreteAggregate(int size){
        this.elements = new Element[size];
        this.size = 0;
    }

    public void add(Element e){
        if(size<elements.length){
            elements[size++] = e;
        }
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public Object get(int index) {
        if(index>=size) return null;
        else return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    public Object remove(int index) {
        if(index>=size) return null;
        Object e = elements[index];
        for(int i=index;i<size;i++){
            elements[i] = elements[i+1];
        }
        size--;
        return e;
    }
}
