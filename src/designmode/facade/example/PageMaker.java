package designmode.facade.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * 根据邮件地址编写该用户的Web页面
 */
class PageMaker {
    private PageMaker(){}

    public static void makeWelcomePage(String mailAddr,String filename){
        Properties mailprop = Database.getProperties("maildata");
        String username = mailprop.getProperty(mailAddr);
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to"+username+"'s page!");
            writer.paragraph(username+"欢迎来到"+username+"的主页");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailAddr,username);
            writer.close();
            System.out.println(filename+" is created for "+mailAddr+"("+username+")");
        } catch (IOException e) {}
    }

    /**
     * 习题例子
     */
    public static void makeLinePage(String filename){
        Properties props = Database.getProperties("maildata");
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            Set addrs = props.keySet();
            for(Object addr:addrs){
                String address = (String) addr;
                writer.link(address, props.getProperty(address));
            }
            writer.close();
            System.out.println(filename+" is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
