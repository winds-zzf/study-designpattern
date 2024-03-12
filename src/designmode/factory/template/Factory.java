package designmode.factory.template;

/**
 * 工厂方法模式的抽象Factory类：是负责生成Product角色的抽象类，具体的处理由ConcreteFactory决定
 */
abstract class Factory {
    /**
     * 抽象方法，子类重写该方法以生产商品
     * 调用工厂方法的时候可以传递一些参数，以生产不同规格的产品
     */
    protected abstract Product factoryMethod(Object attribute);
    //more factory methods

    /**
     * 模板方法：抽象类的模板方法给出了生产产品的框架
     * @param attribute 通过控制不同的参数可以生成不同规格参数的产品
     * @return 生产的产品
     */
    public final Product create(Object attribute){
        return factoryMethod(attribute);
    }
}
