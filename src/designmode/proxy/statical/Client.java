package designmode.proxy.statical;

class Client {
    public static void main(String[] args){
        TargetObject targetObject = new TargetObject();     //target object
        Proxy proxy = new Proxy(targetObject);              //target's proxy
        proxy.teach();
    }
}