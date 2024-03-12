package designmode.adapter.class_adapter.example;

//实际情况：实际能提供的功能，可以使用接口来规定实际提供的功能
class Banner {
    private String string;

    public Banner(String string){
        this.string = string;
    }

    void showWithParen(){
        System.out.println("("+string+")");
    }
    void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
