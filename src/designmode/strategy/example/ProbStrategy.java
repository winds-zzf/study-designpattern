package designmode.strategy.example;

import java.util.Random;

/**
 * 具体策略
 */
class ProbStrategy implements Strategy{
    private int prevHand = 0;
    private int curHand = 0;
    private int[][] history = {
            { 1, 1, 1 },
            { 1, 1, 1 },
            { 1, 1, 1 },
    };

    public ProbStrategy(){}

    @Override
    public Hand nextHand() {
        int bet = new Random().nextInt();
        int handValue = 0;
        if (bet<history[curHand][0]){
            handValue = 0;
        } else if(bet<history[curHand][0]+history[curHand][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }
        prevHand = curHand;
        curHand = handValue;
        return Hand.getInstance(handValue);
    }

    @Override
    public void study(boolean win) {
        if(win){
            history[prevHand][curHand]++;
        } else {
            history[prevHand][(curHand+1)%3]++;
            history[prevHand][(curHand+1)%3]++;
        }
    }

    private int getSum(int hv){
        int sum = 0;
        for(int i=0;i<3;i++){
            sum+=history[hv][i];
        }
        return sum;
    }
}
