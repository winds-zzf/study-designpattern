package designmode.prototype.example;

import java.util.HashMap;

/**
 * 框架类
 */
class Manager {
    private HashMap<String,Product> showcase = new HashMap<>();
    public void register(String name,Product proto){
        showcase.put(name,proto);
    }
    public Product create(String protoname){
        Product p = showcase.get(protoname);
        return p.createClone();
    }
}
