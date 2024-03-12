package designmode.decorator.example;

class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello world");     //具体被修饰对象
        Display d2 = new SideBorder(d1,'#');    //使用边框装置d1
        Display d3 = new FullBorder(d2);                   //装饰器
        d1.show();
        d2.show();
        d3.show();


        Display d4 =
                new SideBorder(
                    new FullBorder(
                        new FullBorder(
                            new SideBorder(
                                new FullBorder(
                                    new StringDisplay("Hello,World.")
                                ),
                                '*'
                            )
                        )
                    ),
                    '/'
                );
        d4.show();

    }
}
