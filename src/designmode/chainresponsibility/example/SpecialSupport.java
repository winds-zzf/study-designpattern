package designmode.chainresponsibility.example;

/**
 * 用来解决问题的具体类（仅解决指定编号的问题）
 */
class SpecialSupport extends Support{
    private int special;

    public SpecialSupport(String name,int special) {
        super(name);
        this.special = special;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return this.special==trouble.getNumber();
    }
}
