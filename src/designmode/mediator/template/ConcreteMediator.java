package designmode.mediator.template;

/**
 * 具体中介者角色
 *  负责实现Mediator接口API
 */
class ConcreteMediator implements Mediator{
    /**
     * 中介者持有每一个Colleague的引用，同时Colleague持有Medaitor的引用，如此Mediator和Colleagues才能双向通信
     */
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;
    private ConcreteColleague3 colleague3;
    //more private concrete colleagues

    /**
     * 调用createMediator()为每一个Colleague引用创建实例
     */
    public ConcreteMediator(){
        createColleagues();
        colleague1.controlColleague();  //为了演示在这里调用该方法
    }

    @Override
    public void createColleagues() {
        /**
         *  持有Colleague的引用
         */

        this.colleague1 = new ConcreteColleague1();
        this.colleague2 = new ConcreteColleague2();
        this.colleague3 = new ConcreteColleague3();

        /**
         * 持有Mediator的引用
         */
        this.colleague1.setMediator(this);
        this.colleague2.setMediator(this);
        this.colleague3.setMediator(this);
    }

    @Override
    public void colleagueChanged(Colleague colleague) {
        /**
         * 仲裁控制逻辑
         * 这里为了演示，简化了处理步骤
         */
        colleague.controlColleague();
    }
}
