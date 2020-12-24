package Client;

import Shared.UpperCaseServer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    private UpperCaseServer server;
    public RMIClient() {
    }
    public void StartClient() throws RemoteException, NotBoundException {
      Registry registry=LocateRegistry.getRegistry("localhost",1099);
      server =(UpperCaseServer)registry.lookup("Server");
    }
    public String toUpperCase(String argument){
       String result=null;
        try {
            result=server.toUpperCase(argument);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new RuntimeException("Can't Connect server");
        }

        return result;
    }
    public Integer NumberConsversion(int num){
        int res = 0;
        try {
            res=server.NumberConversion(num);

        } catch (RemoteException e) {
            e.printStackTrace();

        }
        return res;
    }
}
