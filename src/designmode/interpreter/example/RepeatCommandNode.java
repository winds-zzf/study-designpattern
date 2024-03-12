package designmode.interpreter.example;

/**
 * BNF描述：<repeat command> ::= repeat <number> <command list>
 */
class RepeatCommandNode extends Node{
    private int number;    //存储<number>
    private Node commandListNode;  //存储<command list>

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();   //获取数字
        context.nextToken();                //跳过数字
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat "+number+" "+commandListNode+"]";
    }
}
