package designmode.decorator.template;

/**
 * 顶层父类：
 * 1.规定了被修饰对象的API（修饰着需要修饰的API）
 * 2.用于保持装饰对象和被装饰对象的一致性
 *
 * 结构：
 * Component
 * |____ConcreteComponent
 * |____Decorator
 *      |____ConcreteDecorator
 * 在保持透明性的接口(API)不变的前提下，像类中增加功能：
 *   由于具体装饰器和具体组价实现了相同的Component接口API，因此即使组件被装饰器包裹起来，也可以但是仍然可以通过装饰器调用具体的API
 */
abstract class Component {
    public abstract void method1();
    public abstract void method2();
    //more public method

    /**
     * 也可以使用模板方法进行处理
     */
    public void templateMethod(){
        method1();
        method2();
    }
}
