package designmode.strategy.template;

/**
 * 上下文角色
 * 负责使用Strategy角色
 */
class Context {
    /**
     * 策略使用者需要持有策略的引用，使用委托将具体执行交给concreteStrategy
     */
    private Strategy strategy;

    /**
     * 通过构造方法传入使用的策略，也可以设置setStrategy()方法来动态修改策略
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * 策略的使用者
     */
    public void contextMethod(){
        strategy.strategyMethod1();
    }
}
