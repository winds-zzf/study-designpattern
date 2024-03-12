package designmode.adapter.object_adapter.example2;

/**
 * 对象适配器：适配器持有被适配接口的应用
 * 面向接口编程：适配方和被适配方通过接口建立适配器，更符合生活实际
 */
class Main{
    public static void main(String[] args) {
        Adaptee adaptee = new Banner("Hello");
        Print adapter = new PrintBanner(adaptee);
        adapter.printWeak();
        adapter.printStrong();
    }
}
