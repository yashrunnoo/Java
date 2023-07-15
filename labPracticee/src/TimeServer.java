import java.rmi.Naming;
public class TimeServer {
    public static void main(String[] args)throws Exception {
        PerfectTime1 rmobj = new PerfectTime();
        Naming.bind("//localhost:1099/object",rmobj);
        System.out.println("Ready to go");
    }
}
