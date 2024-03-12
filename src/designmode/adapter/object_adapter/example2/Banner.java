package designmode.adapter.object_adapter.example2;

class Banner implements Adaptee{
    private String string;

    public Banner(String string){
        this.string = string;
    }

    @Override
    public void showWithParen() {
        System.out.println("("+string+")");
    }

    @Override
    public void showWithAster() {
        System.out.println("*"+string+"*");
    }
}
