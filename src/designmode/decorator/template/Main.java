package designmode.decorator.template;

/**
 * 调用流程：
 * 被装饰对象->装饰器->装饰器
 * 经过层层包装装饰后，调用的方法是最外层装饰器的，然后进行一层层的递归，最后调用被修饰对象的方法，然后递归在一层层的返回
 */
class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();              //被修饰组件
        Decorator decorator1 = new ConcreteDecorator(component);    //装饰器修饰被装对象
        Decorator decorator2 = new ConcreteDecorator(decorator1);   //装饰器修饰装饰器
        decorator1.method1();
        decorator2.method2();
    }
}
