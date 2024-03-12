package designmode.prototype.template;

class Main {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("attribute");  //原型类的实例
        ConcretePrototype copy1 = (ConcretePrototype) prototype.createClone();    //创建原型类的副本
        copy1.selfMethod();
        System.out.println("是否是同一个实例?:"+(prototype==copy1));

        //注意强制类型转换并不会改变引用变量的值，因为转换前后它们都是同一片内存间
    }
}
