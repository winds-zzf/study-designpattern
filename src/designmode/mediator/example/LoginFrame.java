package designmode.mediator.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 具体的仲裁者
 */
class LoginFrame extends JFrame implements Mediator, ActionListener {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title){
        super(title);
        this.setBackground(Color.lightGray);
        this.setLayout(new GridLayout(4,2));
        this.setLocation(500,300);
        this.setPreferredSize(new Dimension(500,309));
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        createColleagues();

        add(checkGuest);
        add(checkLogin);
        add(new Label("Username"));
        add(textUser);
        add(new Label("Password"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        //设置初始时的禁用状态
        colleagueChanged();
        //显示
        this.validate();

        pack();
    }

    @Override
    public void createColleagues() {
        //生成组件
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest",g,true);     //默认选中
        checkLogin = new ColleagueCheckbox("Login",g,false);
        textUser = new ColleagueTextField("",10);
        textPass = new ColleagueTextField("",10);
        textPass.setEchoChar('*');
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        //为具体的colleague添加终结者
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        //为组件添加监视器
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonOk.addActionListener(this);
    }

    /**
     * 负责具体的逻辑控制处理
     */
    @Override
    public void colleagueChanged() {
        if(checkGuest.getState()){      //默认是游客模式
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        } else {
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    private void userpassChanged(){
        if(textUser.getText().length()>0){
            textPass.setColleagueEnabled(true);
            if(textPass.getText().length()>0){
                buttonOk.setColleagueEnabled(true);
            }else{
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
