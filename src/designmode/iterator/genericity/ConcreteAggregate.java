package designmode.iterator.genericity;

/**
 * 在ArrayList<E>中，将ConcreteIterator的实现放在了ConcreteAggregate里面，也就是ArrayList<E>里面，这样做可以优化很多的步骤
 * @param <E>
 */
class ConcreteAggregate<E> implements Aggregate<E> {
    private static final Object[] DEFAULT_SIZE = new Object[100];
    private Object[] elements;  //由于无法创建类型变量的数组，所用使用擦除后的替换类型Object代替，这也是类库里的做法
    private int size;

    public ConcreteAggregate(){
        this.elements = DEFAULT_SIZE;
        this.size = 0;
    }

    public void add(E e){
        if(size<elements.length){
            elements[size++] = e;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator();
    }

    public E get(int index) {
        if(index>=size) return null;
        else return (E)elements[index];     //可以使用泛型变量进行强制类型转换
    }

    public int size() {
        return size;
    }

    public E remove(int index) {
        if(index>=size) return null;
        Object e = elements[index];
        for(int i=index;i<size;i++){
            elements[i] = elements[i+1];
        }
        size--;
        return (E)e;
    }

    /**
     * 使用内部私有类来实现Iterator接口，这样有两个好处
     * 1.这个具体的迭代器可以直接操作具体的聚合对象，分开实现需要传参
     * 2.隐藏了实现细节，优化代码结构
     */
    private class ConcreteIterator<E> implements Iterator<E>{
        private int cursor; //index of the next element to return

        public ConcreteIterator(){
            cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public E next() {
            return (E)elements[cursor++];    //elements是Object[]类型，因此需要将取出的元素强转为E
        }

        @Override
        public void remove() {
            ;
        }
    }
}
