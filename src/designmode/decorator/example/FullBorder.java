package designmode.decorator.example;

class FullBorder extends Border{

    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns()+2;
    }

    @Override
    public int getRows() {
        return display.getRows()+2;
    }

    @Override
    public String getRowText(int row) {
        if(row==0){                                 //上边框
            return "+"+makeLine('-',display.getColumns())+"+";
        } else if(row == display.getRows()+1){       //下边框
            return "+"+makeLine('-',display.getColumns())+"+";
        } else {                                    //中间文本
            return "|"+display.getRowText(row-1)+"|";
        }
    }

    private String makeLine(char ch,int count){
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(ch);
        }
        return buffer.toString();
    }
}
