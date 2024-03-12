package designmode.decorator.example;

/**
 * 新增装饰器
 */
class UpDownBorder extends Border{

    protected UpDownBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 0;
    }

    @Override
    public int getRows() {
        return 0;
    }

    @Override
    public String getRowText(int row) {
        return null;
    }
}
