package designmode.interpreter.example;

/**
 * BNF描述：<primitive command> ::= go | right | left | back
 * 属于终结符表达式，因为他不可以再被细分为其他命令
 */
class PrimitiveCommandNode extends Node{
    private String name;

    @Override
    void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if(!name.equals("go") && !name.equals("right") && !name.equals("left")&& !name.equals("back")){
            throw new ParseException(name+" is undefined");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
