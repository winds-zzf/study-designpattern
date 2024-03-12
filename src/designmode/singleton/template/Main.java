package designmode.singleton.template;

class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("是否是同一个实例?:"+(singleton1==singleton2));
    }
}
