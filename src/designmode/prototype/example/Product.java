package designmode.prototype.example;

/**
 * 框架类
 */
interface Product extends Cloneable{    //实现了Cloneable的类的实例可以调用clone方法来自动复制实例
    void use(String s);
    Product createClone();
}

