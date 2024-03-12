package designmode.factory.example;

/**
 * 工厂方法的抽象父类使用了模板方法来给出生产产品的框架，将具体的生产任务交给了工厂子类
 * 所有的具体工厂都将继承自抽象工厂，并且生产特定的一种产品
 */
abstract class Factory {
    /**
     * 生成产品
     */
    protected abstract Product createProduct(String owner);

    /**
     * 注册产品
     */
    protected abstract void registerProduct(Product product);

    /**
     * 模板方法:具体给出了生产产品的框架
     */
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
}
