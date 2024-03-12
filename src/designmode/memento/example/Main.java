package designmode.memento.example;

import java.util.ArrayList;
import java.util.Iterator;

class Main {
    public static void main(String[] args) throws InterruptedException {
        Gamer gamer = new Gamer(100);
        ArrayList<Memento> mementos = new ArrayList<>();
        mementos.add(gamer.createMemento("初始状态"));    //保存最初状态

        while (gamer.getMoney()>0) {
            System.out.println("当前的状态:"+gamer); //显示当前状态
            String remark = gamer.bet();    //进行游戏
            mementos.add(gamer.createMemento(remark));    //保存该局的状态

            //等待一段时间{
            Thread.sleep(500);
        }

        Iterator<Memento> it = mementos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
