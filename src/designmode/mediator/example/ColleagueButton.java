package designmode.mediator.example;

import java.awt.*;

/**
 *
 */
class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption){
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        this.setEnabled(enabled);   //设置Colleague是否可用，由于Colleague继承自Button，因此同时也是禁用Button
    }
}
