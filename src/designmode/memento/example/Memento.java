package designmode.memento.example;

import java.util.ArrayList;
import java.util.Date;

/**
 * 表示Gamer状态的类
 */
class Memento {
    int money;
    long time;
    String remark;
    ArrayList<String> fruits;

    /**
     * default:只有当前包里的类可以创建Memento对象
     */
    Memento(int money,String remark){
        this.money = money;
        this.remark = remark;
        fruits = new ArrayList<>();
        time = System.currentTimeMillis();
    }

    public int getMoney() {
        return money;
    }

    public Date getTime() {
        return new Date(time);
    }

    void addFruit(String fruit){
        fruits.add(fruit);
    }

    public ArrayList<String> getFruits() {
        return (ArrayList<String>) fruits.clone();
    }

    @Override
    public String toString() {
        return "Memento{" +
                "money=" + money +
                ", time=" + new Date(time) +
                ", remark='" + remark + '\'' +
                ", fruits=" + fruits +
                '}';
    }
}
