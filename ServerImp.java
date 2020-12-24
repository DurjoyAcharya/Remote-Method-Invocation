package Server;

import Shared.UpperCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImp implements UpperCaseServer {
    public ServerImp() throws RemoteException {
        UnicastRemoteObject.exportObject(this,1099);
    }
    @Override
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    @Override
    public Integer NumberConversion(int num)  {
        return Integer.valueOf(Integer.toBinaryString(num));
    }
}
