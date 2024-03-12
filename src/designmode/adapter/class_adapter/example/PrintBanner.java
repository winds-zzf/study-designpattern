package designmode.adapter.class_adapter.example;

class PrintBanner extends Banner implements Print{  //实际适配器的实现
    public PrintBanner(String string){
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
