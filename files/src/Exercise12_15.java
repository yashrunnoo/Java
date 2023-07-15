import java.io.*;
import java.util.*;

public class Exercise12_15 {
    public static void main(String[] args) throws IOException {
        // Create file if it does not exist
        File file = new File("Exercise12_15.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        // Write 100 random integers to file
        PrintWriter output = new PrintWriter(file);
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            output.print(rand.nextInt(1000) + " ");
        }
        output.close();

        // Read data back from file and sort it
        Scanner input = new Scanner(file);
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(input.nextInt());
        }
        input.close();
        Collections.sort(list);

        // Display sorted data
        System.out.println("Data in increasing order:");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}

