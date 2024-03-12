package designmode.memento.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * 表示游戏主人公的类
 */
class Gamer {
    private int money;
    private ArrayList<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private String[] fruitName = {"苹果","葡萄","香蕉","橘子"};

    public Gamer(int money){
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    private String obtainFruits() {
        return fruitName[random.nextInt(fruitName.length)];
    }

    public String bet(){
        int dice = random.nextInt(6)+1;
        switch(dice){
            case 1:
                money += 20;
                return "所持金钱增加了。";
            case 2:
                money/=3;
                return "所持金钱减少了。";
            case 6:
                String f = obtainFruits();
                fruits.add(f);
                return "获得了水果("+f+")。";
            default:
                return "什么都没有发生。";
        }
    }

    /**
     * 创建备忘录
     */
    public Memento createMemento(String remark) {
        Memento m = new Memento(money,remark);             //创建Memento，保存当前money
        Iterator<String> it = fruits.iterator();    //保存水果
        while (it.hasNext()){
            String f = it.next();
            m.addFruit(f);
        }
        return m;
    }

    /**
     * 使用备忘录恢复
     */
    public void recoveryMemento(Memento memento){
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "Memento{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
