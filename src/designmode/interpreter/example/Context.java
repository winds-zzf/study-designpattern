package designmode.interpreter.example;

import java.util.StringTokenizer;

/**
 *
 */
class Context {
    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text){
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    /**
     * 获取下一个标记
     */
    public String nextToken(){
        if(tokenizer.hasMoreTokens()){
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    /**
     * 获取当前的标记
     */
    public String currentToken(){
        return currentToken;
    }

    /**
     * 前进至下一个标记
     */
    public void skipToken(String token) throws ParseException {
        if (!token.equals(currentToken)){
            throw new ParseException("Warning: "+token+" is expected, but "+currentToken+" is found.");
        }
        nextToken();
    }

    /**
     * 获取当前标记对应的数值
     */
    public int currentNumber() throws ParseException{
        int number = 0;
        try{
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e){
            throw new ParseException("Warning:"+e);
        }
        return number;
    }
}
