import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PerfectTime extends UnicastRemoteObject implements  PerfectTime1 {

    //Constructor
    public PerfectTime() throws RemoteException
    {
    }
    public long getPerfectTime() throws RemoteException{
        return System.currentTimeMillis();
    }
}
