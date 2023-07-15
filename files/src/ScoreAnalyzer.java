import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file containing the scores: ");
        String fileName = scanner.nextLine();
        scanner.close();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            int total = 0;
            int count = 0;

            while (fileScanner.hasNextInt()) {
                int score = fileScanner.nextInt();
                total += score;
                count++;
            }

            fileScanner.close();

            double average = (double) total / count;

            System.out.println("Total score: " + total);
            System.out.println("Average score: " + average);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
