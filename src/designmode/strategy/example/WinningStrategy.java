package designmode.strategy.example;

import java.util.Random;

/**
 * 具体策略
 */
class WinningStrategy implements Strategy{
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(){
        ;
    }

    @Override
    public Hand nextHand() {
        if(!won){
            prevHand = Hand.getInstance(new Random().nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
