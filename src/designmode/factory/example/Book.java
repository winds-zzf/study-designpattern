package designmode.factory.example;

/**
 * 书：归属于产品，继承自Product
 * 通过工厂BookFactory生产
 */
class Book extends Product{
    private String name;

    Book(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("使用"+name+"这本书");
    }

    public String getName(){
        return name;
    }
}
