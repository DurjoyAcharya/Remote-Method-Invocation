package Shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperCaseServer extends Remote{
    String toUpperCase(String str) throws RemoteException;
    Integer NumberConversion(int num) throws RemoteException;
}
