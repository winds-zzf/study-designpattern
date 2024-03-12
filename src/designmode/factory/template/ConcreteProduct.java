package designmode.factory.template;

/**
 * 具体产品
 */
class ConcreteProduct implements Product{
    private Object field;

    /**
     * 产品的构造器使用default域。
     * 这是可以让其他无关类通过工厂方法生产ConcreteProduct而不是直接通过构造器生成ConcreteProduct
     */
    ConcreteProduct(Object field){
        this.field = field;
    }

    @Override
    public void method1() {
        System.out.println("concrete product method1");
    }

    @Override
    public void method2() {
        System.out.println("concrete product method2");
    }

    @Override
    public void method3() {
        System.out.println("concrete product method3");
    }

    //more private methods
}
