package designmode.bridge.example;

class DecorateDisplayImpl extends DisplayImpl{
    private char start,fill,end;
    private int times,multiple;

    public DecorateDisplayImpl(char start, char fill, char end,int times,int multiple) {
        this.start = start;
        this.fill = fill;
        this.end = end;
        this.times = times;
        this.multiple = multiple;
    }


    @Override
    void rawOpen() {
        System.out.println(start+""+end);
    }

    @Override
    void rawPrint() {
        for(int i=1;i<times;i++){
            System.out.println(String.format("%c%"+(i*multiple+1)+"c",start,end).replace(" ",fill+""));
        }
    }

    @Override
    void rawClose() {
        //do nothing
    }
}
