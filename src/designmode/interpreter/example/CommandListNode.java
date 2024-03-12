package designmode.interpreter.example;

import java.util.ArrayList;

/**
 * BNF描述：<command list> ::= <command>* end
 */
class CommandListNode extends Node {
    /**
     * 因为<command list>表达式包含许多的<command>，因此使用ArrayList<Node>来存储这些<command>
     */
    private ArrayList<Node> list = new ArrayList<>();

    @Override
    void parse(Context context) throws ParseException {
        /**
         * 使用while(true)循环是因为我们暂时无法预料有多少个command，所以只能先处理，当发现处理完后再break
         */
        while(true){
            /**
             * 依次读取end之前的commands，currentToken()==null说明已经读到文件尾了，
             * 正常情况下读取到end就结束循环了，不会出现null的情况，因此说明缺少end
             */
            if(context.currentToken()==null){
                throw new ParseException("Missing 'end'");
            } else if(context.currentToken().equals("end")){
                context.skipToken("end");
                break;
            } else {     //还未读取到end结尾，说明此时仍旧在读取commands
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();     //对于List的toString()方法，他会递归的调用每一个元素的toString()方法
    }
}
