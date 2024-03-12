package designmode.template.template;

class Main {
    public static void main(String[] args) {
        //LSP:里氏替换原则
        AbstractClass template = new ConcreteClass();
        template.templateMethod();
    }
}

/**
 * 注意Template Method模式和Strategy模式的区别
 * Template method模式：使用继承改变程序的行为。在父类中定义程序行为的框架（算法），在子类中决定具体处理
 * Strategy模式：使用委托改变程序的行为。与模板方法模式中改变部分程序行为不同的是，策略模式用于替换整个算法
 */