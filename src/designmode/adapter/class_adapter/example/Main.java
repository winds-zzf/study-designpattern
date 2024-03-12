package designmode.adapter.class_adapter.example;

/**
 * 类适配器：使用继承的适配器（适配器类通过继承被适配类来工作的，因此叫做类适配器）
 */
class Main {
    public static void main(String[] args) {
        //这里的适配器继承继承了源对象，同时实现了目标接口，达到适配原对象的目的
        Print adapter = new PrintBanner("Hello");
        adapter.printWeak();
        adapter.printStrong();
    }
}
