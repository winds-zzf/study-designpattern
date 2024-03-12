package designmode.composite.template;

/**
 * 抽象类：定义了分支节点(容器)，叶子结点(内容)所共有的方法
 * 1.其中叶子节点和分支节点可以有不同的具体类(只要派生自抽象父类即可)
 * 2.可以在抽象类中实现一些默认的方法，子类可根据需要重写这些方法
 * 结构：
 * Composite
 * |____Branch(分支/容器)
 * |____Leaf(叶子/内容)
 */
abstract class Composite {
    /**
     * 共有属性:比如名称，创建时间等
     */
    public Object publicField;
    //more public fields

    /**
     * 抽象方法：共有方法
     */
    protected abstract void traverseDFS(String prefix);
    public abstract String getName();
    //more public methods

    /**
     * 默认实现并提供的方法：比如getName(),getTime()等
     */
    public void traverse(String prefix){
        System.out.println(prefix);
        traverseDFS("");    //将具体的遍历任务交给子类实现，并对其他类隐藏该方法(protected)
    }
    //more default method
}
