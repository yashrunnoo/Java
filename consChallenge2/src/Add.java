import java.util.Scanner;

public class Add {
    private static String genus = "asdas";
    int x = 0;
    Add(String genus)
    {
        this.genus = genus;
    }

    public String getGenus(){
        return this.genus;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int x1=sc.nextInt();
//        int x2 = sc.nextInt();

//        System.out.println(x1+x2);
//        System.out.println(Add.genus);
        Add une = new Add("une");
        Add deux = new Add("deux");

        System.out.println("une  : " + une.getGenus()+ une.x) ;
        System.out.println("deux  : " + deux.getGenus());
    }
}
