package designmode.flyweight.example;

/**
 * 表示多个BigChar组成的“大型字符串”的类
 */
class BigString {
    //大型字符串
    private BigChar[] bigString;
    //构造函数
    public BigString(String string){
        bigString = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigString.length; i++) {
            bigString[i] = factory.getBigChar(string.charAt(i));
        }
    }

    //显示
    public void print(){
        for (BigChar bigChar:bigString) {
            bigChar.print();
        }
    }
}
