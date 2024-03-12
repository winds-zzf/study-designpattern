package designmode.prototype.template;

/**
 * 具体的原型类：执行拷贝的时候拷贝的就是ConcretePrototype
 * 这个就是需要通过原型模式拷贝的兑现
 */
class ConcretePrototype implements Prototype{
    private String attribute;

    public ConcretePrototype(String attribute){
        this.attribute = attribute;
    }

    @Override
    public Prototype createClone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) clone();
        } catch (CloneNotSupportedException e) {e.printStackTrace();}
        return prototype;   //返回原型（拷贝）
    }

    public void selfMethod(){
        System.out.println("concrete prototype:"+attribute);
    }
    //more self methods
}
