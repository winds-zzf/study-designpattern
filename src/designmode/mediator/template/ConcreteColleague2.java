package designmode.mediator.template;

import java.util.Random;

/**
 * 具体同事角色：
 * 负责具体实现Colleague角色的接口
 */
class ConcreteColleague2 extends Colleague{

    @Override
    protected void controlColleague() {
        System.out.println("I am the colleague 2");
        System.out.println("finishes processing.");
        if(new Random().nextBoolean()) mediator.colleagueChanged(this);
    }
}
