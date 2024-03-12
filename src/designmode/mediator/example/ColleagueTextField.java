package designmode.mediator.example;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class ColleagueTextField extends TextField implements Colleague, TextListener {
    private Mediator mediator;

    public ColleagueTextField(String caption,int columns){
        super(caption,columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        this.setEnabled(enabled);
        setBackground(enabled? Color.white:Color.lightGray);
    }

    @Override   //监听文本内容的变化
    public void textValueChanged(TextEvent e) {
        /**
         * 当文本值发生改变后，告知中介者
         */
        mediator.colleagueChanged();
    }
}
