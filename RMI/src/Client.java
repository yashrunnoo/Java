import java.rmi.Naming;

public class Client {
    public static void main(String[] args) throws Exception{
        AddI myObj = (AddI) Naming.lookup("yash");
        System.out.println(myObj.add(2,3));
    }
}
