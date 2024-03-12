package designmode.flyweight.template;

/**
 * 轻量级(蝇量)对象
 * Flyweight表示那些实例会被共享的类（不变且经常被重复使用）
 */
class Flyweight {
    private String name;

    public Flyweight(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Flyweight{" +
                "name='" + name + '\'' +
                '}';
    }
}
