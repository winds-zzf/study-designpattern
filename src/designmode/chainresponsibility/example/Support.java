package designmode.chainresponsibility.example;

/**
 * 用来解决问题的抽象类
 * 结构：
 * Support
 * |____NoSupport
 * |____LimitSupport
 * |____OddSupport
 * |____SpecialSupport
 */
abstract class Support {
    private String name;    //要解决问题的实例的名字
    private Support next;   //要推卸给的对象

    public Support(String name) {
        this.name = name;
    }

    /**
     * 返回后继Support结点的好处是可以级联的添加next节点
     */
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    /**
     * 使用模板方法规定解决问题的步骤,判断是否支持解决该问题，并通过将具体步骤设置为protected，来向外部隐藏具体处理细节
     */
    public final void support(Trouble trouble){
        /**
         * 1.先调用自己的resolve方法尝试解决问题。
         * 2.当自己解决不了的时候才会交给下一位。
         * 3.没有一个可以解决该问题，那么该问题无法解决
         */
        if(resolve(trouble)){
            System.out.println(trouble+" is resolved by "+this + ".");
        } else if(next!=null){
            next.support(trouble);  //如果未解决，就交给下一个人解决，如果下一个人也解决不了，则输出无法解决
        } else {
            System.out.println(trouble + " can't be resolved.");
        }
    }

    /**
     * 解决问题的实体
     */
    protected abstract boolean resolve(Trouble trouble);

    @Override
    public String toString() {
        return "["+name+"]";
    }
}

