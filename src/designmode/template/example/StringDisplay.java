package designmode.template.example;

class StringDisplay extends AbstractDisplay{
    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.println("|"+str+"|");
    }

    @Override
    protected void close() {
        printLine();
    }

    public void printLine(){
        System.out.print("+");
        for(int i=0;i<str.getBytes().length;i++)
            System.out.print("-");
        System.out.println("+");
    }
}
