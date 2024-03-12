package designmode.decorator.template;

/**
 * 抽象装饰者
 * 用于保存被装饰的对象
 * 注意：抽象类中的属性多数是需要protected，因为有些属性需要被子类使用但又不希望被无关类使用，因此使用protected
 */
abstract class Decorator extends Component{
    /**
     * 持有被装饰对象的引用
     * 由于装饰者和被装饰者都继承自这个抽象父类，因此装饰器装饰的对象可以是具体组件或另一个装饰器
     * 形成链表：组件->装饰器->装饰器->装饰器->装饰器->.....
     */
    protected Component component;

    protected Decorator(Component component){
        this.component = component;
    }
}
