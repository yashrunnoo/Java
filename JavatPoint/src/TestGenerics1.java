import java.util.ArrayList;
import java.util.Iterator;

public class TestGenerics1 {
    public static void main(String[] args) {

        ArrayList<String >list = new ArrayList<>();
        list.add("Mojumder");
        list.add("Arka");

        Iterator<String > itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
