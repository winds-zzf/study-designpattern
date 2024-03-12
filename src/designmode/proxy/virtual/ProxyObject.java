package designmode.proxy.virtual;

class ProxyObject implements TargetInterface{
    //在虚拟代理中，代理对象持有目标对象的引用，并进行维
    private TargetObject targetObject;

    @Override
    public String getFileName() {
        if(targetObject!=null){
            return targetObject.getFileName();
        }else{
            return "";
        }
    }

    @Override
    public void display() {
        if(targetObject!=null){
            System.out.println("Displaying the file......");
        }else{
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Loading the file.....");
                    targetObject = new TargetObject();          //加载耗时资源，创建对象是一个耗时的过程
                    System.out.println("Loading file successfully......");
                    targetObject.display();
                }
            }).start();
        }
    }
}
