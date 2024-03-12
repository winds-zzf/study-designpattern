package designmode.template.template;

/**
 * 具体类：在父类中定义程序行为的框架，在子类中决定具体的处理
 */
class ConcreteClass extends AbstractClass{
    @Override
    protected void method1() {
        System.out.println("concrete implement of method 1");
    }

    @Override
    protected void method2() {
        System.out.println("concrete implement of method 2");
    }

    @Override
    protected void method3() {
        System.out.println("concrete implement of method 3");
    }
}
