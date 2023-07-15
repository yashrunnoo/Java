/*Create a data file with 100 lines. Each line in the file consists of a faculty member’s first name, last name, rank, and salary. The faculty member’s first name and last name for the ith line are FirstName and LastName. The rank is randomly generated as assistant, associate, and full. The salary is randomly generated as a number with two digits after the decimal point. The salary for an assistant professor should be in the range from 50,000 to 80,000, for associate professor from 60,000 to 110,000, and for full professor from 75,000 to 130,000. Save the file in Salary.txt.*/

import java.io.*;
import java.util.Random;

public class SalaryGenerator {
    public static void main(String[] args) throws IOException {
        // Create the file
        File file = new File("Salary.txt");
        FileWriter writer = new FileWriter(file);

        // Random number generator
        Random rand = new Random();

        // Faculty member details
        String[] ranks = {"assistant", "associate", "full"};
        double[] salaryRanges = {50000.0, 80000.0, 60000.0, 110000.0, 75000.0, 130000.0};

        // Generate 100 lines of data
        for (int i = 0; i < 100; i++) {
            String firstName = "FirstName";
            String lastName = "LastName";
            String rank = ranks[rand.nextInt(3)];
            double salary;

            // Generate salary based on rank
            if (rank.equals("assistant")) {
                salary = salaryRanges[0] + (salaryRanges[1] - salaryRanges[0]) * rand.nextDouble();
            } else if (rank.equals("associate")) {
                salary = salaryRanges[2] + (salaryRanges[3] - salaryRanges[2]) * rand.nextDouble();
            } else {
                salary = salaryRanges[4] + (salaryRanges[5] - salaryRanges[4]) * rand.nextDouble();
            }

            // Write the data to the file
            writer.write(firstName + " " + lastName + " " + rank + " " + String.format("%.2f", salary) + "\n");
        }

        writer.close();
        System.out.println("File Salary.txt has been created.");
    }
}
