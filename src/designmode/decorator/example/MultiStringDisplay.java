package designmode.decorator.example;

/**
 * 新增的具体被修饰对象
 */
class MultiStringDisplay extends Display{

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
