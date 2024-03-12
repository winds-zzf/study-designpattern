package designmode.chainresponsibility.template;

class Main {
    public static void main(String[] args) {
        Handler a = new ConcreteHandler1("A");
        Handler b = new ConcreteHandler1("B");
        Handler c = new ConcreteHandler1("C");
        Handler d = new ConcreteHandler1("D");

        /**
         * 形成责任链：
         * 可以按照一定规则形成或者动态改变责任链，比如将命中率高的排在前面
         */
        a.setNext(b).setNext(c).setNext(d);
        //制造各种问题
        for (int i = 0; i < 10; i++) {
            a.handler(new Object());
        }
    }
}
