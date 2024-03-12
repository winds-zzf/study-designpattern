package designmode.mediator.example;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ColleagueCheckbox extends Checkbox implements Colleague, ItemListener {
    private Mediator mediator;

    public ColleagueCheckbox(String caption,CheckboxGroup group,boolean state){
        super(caption,group,state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        this.setEnabled(enabled);
    }

    @Override   //监听复选框项的变化
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
