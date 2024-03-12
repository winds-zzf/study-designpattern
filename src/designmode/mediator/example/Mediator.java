package designmode.mediator.example;

/**
 * 中介者接口
 */
interface Mediator {
    /**
     * 生成Mediator要管理的组员
     */
    public void createColleagues();

    /**
     * 生成对话框中的按钮或文本输入框
     */
    public void colleagueChanged();
}
