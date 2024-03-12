package designmode.chainresponsibility.example;

class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob",100);
        Support charlie = new SpecialSupport("charlie",429);
        Support diana = new LimitSupport("Diana",200);
        Support elmo = new OddSupport("Elmo");
        Support frep = new LimitSupport("Fred",300);

        //形成责任链
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(frep);
        //制造问题
        for (int i = 0; i < 500; i+=33) {
            alice.support(new Trouble(i));
        }
    }
}
