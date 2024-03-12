package designmode.mediator.template;

/**
 * 同事角色
 *  Colleague角色负责定义与Mediator角色进行通信的接口
 * Colleague
 * |____ConcreteColleague1
 * |____ConcreteColleague2
 * |____ConcreteColleague3
 */
abstract class Colleague {
    /**
     * 具体同时需持有有中介者的引用，以便在有事情处理的时候告知中介者进行处理
     */
    protected Mediator mediator;

    /**
     * 传入中介者引用
     * @param mediator 抽象接口Mediator
     */
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 具体的Colleague方法，Mediator通过该方法控制Colleague执行任务
     */
    protected abstract void controlColleague();
}
