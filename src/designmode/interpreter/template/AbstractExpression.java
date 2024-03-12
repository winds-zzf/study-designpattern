package designmode.interpreter.template;

/**
 * 抽象表达式角色
 * 定义了语法树节点的共同接口API
 */
abstract class AbstractExpression {
    /**
     * 执行翻译任务的递归方法
     */
    public abstract void interpreter();
}
