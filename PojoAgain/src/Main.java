import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            Student s = new Student("s1000" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "John";
                        case 3 -> "cena";
                        case 4 -> "roman";
                        case 5 -> "seth";
                        default -> "anonymous";
                    },
                    "01/01/2001",
                    "Comp");
            System.out.println(s);
        }
    }
}
