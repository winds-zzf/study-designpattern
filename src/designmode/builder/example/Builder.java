package designmode.builder.example;

/**
 * Builder:构造器对象
 * 声明了编写文档的方法的抽象类
 */
abstract class Builder {
    abstract void makeTile(String title);
    abstract void makeString(String str);
    abstract void makeItems(String[] items);
    abstract void close();
}

