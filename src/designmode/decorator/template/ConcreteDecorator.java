package designmode.decorator.template;

/**
 * 具体装饰者
 * 负责修饰具体的被修饰对象的方法
 */
class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component){
        super(component);
    }

    @Override
    public void method1() {
        System.out.println("Decorator:Start");
        component.method1();
        System.out.println("Decorator:End");
    }

    @Override
    public void method2() {
        System.out.println("Decorator:Start");
        component.method2();
        System.out.println("Decorator:End");
    }
}
