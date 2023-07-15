import java.io.*;

public class RemoveStringFromFile {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java RemoveStringFromFile <string> <filename>");
            return;
        }

        String removeString = args[0];
        String filename = args[1];

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuilder stringBuilder = new StringBuilder();

            String line = null;

            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(removeString, "");
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
            }

            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("Removed all occurrences of \"" + removeString + "\" from file \"" + filename + "\".");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
