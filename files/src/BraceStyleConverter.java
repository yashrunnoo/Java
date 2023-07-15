import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BraceStyleConverter {
    public static void main(String[] args) throws IOException {
        String inputFile = args[0];
        String outputFile = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.trim().endsWith("{")) {
                // remove the opening brace
                String newLine = line.trim().substring(0, line.trim().length() - 1);
                // append the opening brace to the previous line
                writer.write(newLine);
                writer.newLine();
                writer.write("{");
            } else {
                writer.write(line);
            }
            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}
