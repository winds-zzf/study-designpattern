package designmode.factory.template;

/**
 * 具体工厂类：具体完成Factory的抽象方法
 * 每一个产品都有一个继承自Factory的具体工厂方法
 */
class ConcreteFactory extends Factory{
    @Override
    protected Product factoryMethod(Object attribute) {
        return new ConcreteProduct(attribute);
    }
}
