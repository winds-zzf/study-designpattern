package designmode.bridge.example;

class StringDisplayImpl extends DisplayImpl{
    private String string;

    public StringDisplayImpl(String string){
        this.string = string;
    }

    @Override
    void rawOpen() {
        printLine();
    }

    @Override
    void rawPrint() {
        System.out.println("|"+string+"|");
    }

    @Override
    void rawClose() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i=0;i<string.length();i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
