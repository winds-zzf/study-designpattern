package designmode.iterator.template;

interface Aggregate {
    Iterator iterator();
    Object get(int index);
    int size();
}
