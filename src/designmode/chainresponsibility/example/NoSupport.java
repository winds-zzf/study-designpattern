package designmode.chainresponsibility.example;

/**
 * 用来解决问题的具体类（永远不处理问题）
 */
class NoSupport extends Support{

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
