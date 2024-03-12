package designmode.adapter.object_adapter.example2;

class PrintBanner implements Print{
    private Adaptee adaptee;

    public PrintBanner(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void printWeak() {
        adaptee.showWithParen();
    }

    @Override
    public void printStrong() {
        adaptee.showWithAster();
    }
}
