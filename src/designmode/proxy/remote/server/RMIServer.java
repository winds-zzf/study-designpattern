package designmode.proxy.remote.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

class RMIServer {
    public static void main(String[] argv) {
        try {
            //创建三个远程对象
            RemoteInterface remoteObj1 = new RemoteImpl("school", 20);        //面相接口变成，用户不用考虑具体实现类是谁
            RemoteInterface remoteObj2 = new RemoteImpl("home", 100);
            RemoteInterface remoteObj3 = new RemoteImpl("company", 60);
            //开启RMI service并侦听8859端口
            LocateRegistry.createRegistry(8859);                                     //开启本地的RMI service并产生一个注册表，侦听来自端口8859的连接请求
            //在RMI服务的注册表中中注册绑定三台糖果机
            Naming.rebind("rmi://localhost:8859/RemoteMachine1", remoteObj1);          //注册远程对象，并绑定本机的URL，指定
            Naming.rebind("rmi://localhost:8859/RemoteMachine2", remoteObj2);
            Naming.rebind("rmi://localhost:8859/RemoteMachine3", remoteObj3);
            System.out.println("listening to port:8859");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}