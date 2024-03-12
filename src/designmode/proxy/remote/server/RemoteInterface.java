package designmode.proxy.remote.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    public String getLocation() throws RemoteException;
    public int getCount() throws RemoteException;
    public String getState() throws RemoteException;
}
