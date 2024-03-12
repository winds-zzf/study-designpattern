package designmode.decorator.template;

/**
 * 具体装饰者
 */
class ConcreteComponent extends Component{

    @Override
    public void method1() {
        System.out.println("original method 1");
    }

    @Override
    public void method2() {
        System.out.println("original method 2");
    }
}
