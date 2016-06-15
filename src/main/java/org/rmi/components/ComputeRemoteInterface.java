package org.rmi.components;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ComputeRemoteInterface extends Remote {
    <T> T executeTask(Task<T> task) throws RemoteException;
}
