package designmode.mediator.template;

/**
 * 中介者角色
 * 负责定义与Colleague角色进行通信和作出决定的接口API
 * Mediator
 * |____ConcreteMediator
 */
interface Mediator {
    /**
     * 用于控制创建具体的同事（需要持有同时的引用，以便和同事进行通信）
     */
    void createColleagues();

    /**
     * Mediator角色的仲裁控制逻辑
     * Colleague有事情处理时，Mediator的colleagueChanged()该方法将被调用，请求处理
     */
    void colleagueChanged(Colleague colleague);
}
