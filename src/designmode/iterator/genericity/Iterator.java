package designmode.iterator.genericity;

interface Iterator<E> {
    boolean hasNext();
    E next();
    void remove();
}
