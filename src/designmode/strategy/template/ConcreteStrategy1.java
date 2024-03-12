package designmode.strategy.template;

/**
 * 具体策略：使用具体的算法实现策略接口的API
 */
class ConcreteStrategy1 implements Strategy{

    @Override
    public void strategyMethod1() {
        System.out.println("实际的策略1");
    }

    //other self methods
}
