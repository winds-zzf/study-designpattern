package designmode.singleton.example;

class Main {
    public static void main(String[] args) {
        //testSingleton();
        //testTicketMaker();
        testTriple();
    }

    private static void testSingleton(){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("是否是同一个实例?:"+(singleton1==singleton2));
    }

    private static void testTicketMaker(){
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();
        System.out.println("是否是同一个实例?:"+(ticketMaker1==ticketMaker2));
    }

    private static void testTriple(){
        Triple triple0 = Triple.getInstance(0);
        Triple triple1 = Triple.getInstance(1);
        Triple triple2 = Triple.getInstance(2);
        Triple triple3 = Triple.getInstance(2);
        System.out.println(triple0);
        System.out.println(triple1);
        System.out.println(triple2);
        System.out.println(triple3);
    }
}
