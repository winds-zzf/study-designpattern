package designmode.strategy.template;

/**
 * 抽象策略（接口或抽象类）
 * 1.负责决定实现策略所必须的接口API
 * 2.通过里氏替换原则替换不同的策略
 * Strategy
 * |___ConcreteStrategy1
 * |___ConcreteStrategy2
 */
interface Strategy {
    void strategyMethod1();

    //more strategy methods
}
