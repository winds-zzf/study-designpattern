package designmode.chainresponsibility.template;

/**
 * 抽象处理者Handler
 * 1.定义了处理请求的接口API
 * 2.Handler知道自己无法解决时下一个交给谁
 *
 * 结构
 * Handler
 * |____ConcreteHandler1
 * |____ConcreteHandler2
 * |____Others
 */
abstract class Handler {
    private String name;
    private Handler next;

    public Handler(String name) {
        this.name = name;
    }

    /**
     * 指定下一项
     * 通过返回下一项的引用，便于级联式的调用setNext()
     */
    public Handler setNext(Handler next){
        this.next = next;
        return next;
    }

    /**
     * 处理具体的请求，可以使用模板方法来定义处理流程
     * 参数和要具体的处理对象有关
     * 通过将处理委托给下一位来“推卸责任”
     * 责任链的遍历：递归/循环
     */
    public void handler(Object obj){
        if(request()){          //能处理
            System.out.println(name+"能处理");
        } else if (next!=null){ //不能处理，交给后面的节点
            System.out.println(name+"不能处理");
            next.handler(obj);
        } else {                //都无法处理
            System.out.println("无法解决");
        }
    }

/** 使用循环遍历责任链
    public void handler(Object obj){
        Handler cur = this;
        while(cur!=null){
            if(cur.request()){
                System.out.println(cur.name+"能处理");
            } else {
                System.out.println(cur.name+"不能处理");
                cur = cur.next; //使用下一个的引用去处理
            }
        }
        System.out.println("无法解决");
    }
*/

    protected abstract boolean request();
}
