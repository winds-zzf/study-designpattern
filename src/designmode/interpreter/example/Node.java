package designmode.interpreter.example;

/**
 * 表示语法树“节点”的类
 * 所有节点的顶层抽象父类
 * 结构：
 * Node
 * |____ProgramNode
 * |____CommandListNode
 * |____CommandNode
 * |____RepeatCommandNode
 * |____PrimitiveCommandNode(终结符表达式，不可以再被细分)
 */
abstract class Node {
    /**
     * 进行语法解析处理
     * @param context
     * @throws ParseException
     */
    abstract void parse(Context context) throws ParseException;
}
