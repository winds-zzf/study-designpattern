package designmode.chainresponsibility.template;

import java.util.Random;

/**
 * 具体责任链2
 * 进行具体的处理
 */
class ConcreteHandler2 extends Handler{

    public ConcreteHandler2(String name) {
        super(name);
    }

    @Override
    public boolean request() {
        return new Random().nextBoolean();
    }
}
