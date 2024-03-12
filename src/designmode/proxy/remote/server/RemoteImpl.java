package designmode.proxy.remote.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class RemoteImpl extends UnicastRemoteObject implements RemoteInterface {
    String location;
    int count;
    String state;
    public RemoteImpl(String location,int count) throws RemoteException {
        this.location = location;
        this.count = count;
        this.state = "OK";
    }
    @Override
    public String getLocation() throws RemoteException {
        return location;
    }

    @Override
    public int getCount() throws RemoteException {
        return count;
    }

    @Override
    public String getState() throws RemoteException {
        return state;
    }
}
