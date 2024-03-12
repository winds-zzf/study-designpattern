package designmode.abstractfactory.example.factory;

/**
 * Item抽象类
 */
public abstract class Item {
    protected String caption;

    public Item(String caption){
        this.caption = caption;
    }

    public abstract String makeHTML();
}
