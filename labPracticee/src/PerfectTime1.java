import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PerfectTime1 extends Remote {
    long getPerfectTime() throws RemoteException;
}
