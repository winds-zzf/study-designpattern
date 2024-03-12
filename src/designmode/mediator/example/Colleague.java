package designmode.mediator.example;

/**
 * Colleague接口
 * 向仲裁者进行报告的组员的接口
 */
interface Colleague {
    /**
     * 调用setMediator()方法注册总裁者，这样Colleague在有任务汇报时就可以调用colleagueChanged()方法进行汇报
     */
    public void setMediator(Mediator mediator);

    /**
     *  由仲裁者决定是否启用一个Colleague
     */
    public void setColleagueEnabled(boolean enabled);
}
