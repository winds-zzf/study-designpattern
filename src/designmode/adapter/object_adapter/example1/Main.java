package designmode.adapter.object_adapter.example1;

/**
 * 对象适配器：使用委托的适配器（适配器类通过持有被适配对象或接口的引用来工作的，因此叫对象适配器）
 * （关于委托，委托就是交给其他人，在Java语言中，委托就是将某个方法中的实际处理交给其他实例的方法）
 */
class Main {
    public static void main(String[] args) {
        Banner banner = new Banner("Hello");
        Print adapter = new PrintBanner(banner);
        adapter.printWeak();
        adapter.printStrong();
    }
}
