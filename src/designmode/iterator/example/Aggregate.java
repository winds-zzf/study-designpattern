package designmode.iterator.example;

/**
 * 表示集合的接口
 */
interface Aggregate {
    //通过方法返回值关联接口Iterator
    Iterator iterator();
}
