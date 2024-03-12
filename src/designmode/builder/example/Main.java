package designmode.builder.example;

class Main {
    public static void main(String[] args) {
        test1();
        test2();
    }

    /**
     * 测试文本构造器TextBuilder
     */
    private static void test1(){
        TextBuilder builder = new TextBuilder();    //创建构造器示例
        Director director = new Director(builder);  //将构造器传入指导控制器中
        director.construct();                       //由控制器自动完成文章的构造
        String result = builder.getResult();        //获取构造后生成的文章
        System.out.println(result);
    }

    /**
     * 测试网页构造器HTMLBuilder
     */
    private static void test2(){
        HTMLBuilder builder = new HTMLBuilder();
        Director director = new Director(builder);
        director.construct();
        String result = builder.getResult();
        System.out.println(result);
    }
}
