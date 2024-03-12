package designmode.strategy.example;

/**
 * 策略接口：
 * Strategy
 * |___WinningStrategy(具体策略1)
 * |___ProbStrategy(具体策略2)
 */
interface Strategy {
     Hand nextHand();
    void study(boolean win);
}
