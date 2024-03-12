package designmode.chainresponsibility.template;

import java.util.Random;

/**
 * 具体责任链1
 * 进行具体的处理
 */
class ConcreteHandler1 extends Handler{

    public ConcreteHandler1(String name) {
        super(name);
    }

    @Override
    public boolean request() {
        return new Random().nextBoolean();
    }
}
