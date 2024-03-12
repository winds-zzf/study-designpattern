package designmode.proxy.remote.client;

import designmode.proxy.remote.server.RemoteInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

class RMIClient1 {
    public static void main(String[] argv){
        try {
            //通过Naming的静态方法lookup()查找url=localhost:8859地址对应的注册表中的RemoteMachine，并返回对应的Stub对象
            RemoteInterface remoteMachine1 = (RemoteInterface) Naming.lookup("rmi://localhost:8859/RemoteMachine1");
            report(remoteMachine1);
            Thread.sleep(60000);
        }
        catch (RemoteException e) {e.printStackTrace();}
        catch (InterruptedException e) {e.printStackTrace();}
        catch (MalformedURLException e) {e.printStackTrace();}
        catch (NotBoundException e) {e.printStackTrace();}
    }

    public static void report(RemoteInterface remoteMachine) throws RemoteException{
        System.out.println("Gumball Machine: "+remoteMachine.getLocation());
        System.out.println("Current inventory: "+remoteMachine.getCount()+" gumballs");
        System.out.println("Current state: "+remoteMachine.getState());
    }
}
