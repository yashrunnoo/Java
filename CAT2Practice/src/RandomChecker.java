public class RandomChecker {
    public static void main(String[] args) {
        int x = 1;
        while (x != 0)
        {
            x = (int)(Math.random() * (6-1+1)+0);
            System.out.println(x);
        }
        //System.out.println(x);
    }
}