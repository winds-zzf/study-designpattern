package designmode.chainresponsibility.example;

/**
 * 用来解决问题的具体类（仅解决编号小于指定编号的问题）
 */
class LimitSupport extends Support{
    private int limit;

    public LimitSupport(String name,int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber()<limit;
    }
}
