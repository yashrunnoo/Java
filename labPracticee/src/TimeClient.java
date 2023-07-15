import java.rmi.Naming;
public class TimeClient {
    public static void main(String[] args) throws Exception{
        PerfectTime1 local = (PerfectTime1) Naming.lookup("//localhost:1099/object");
        System.out.println("I am Client");
        System.out.println(local.getPerfectTime());
    }
}