package designmode.interpreter.example;

/**
 * 对应<program>的类
 * 对应整个程序范围
 * BNF描述：<program> ::= program <command list>
 */
class ProgramNode extends Node{
    /**
     * 用于保存<command list>对应的节点
     */
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");       //跳过Program字段
        commandListNode = new CommandListNode();    //创建一个CommandListNode用于解析<command list>子表达式
        commandListNode.parse(context);     //调用CommandListNode解析分支<command list>
    }

    @Override
    public String toString() {
        return "[program "+commandListNode+"]";
    }
}
