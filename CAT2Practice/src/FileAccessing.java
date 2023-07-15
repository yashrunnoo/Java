import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAccessing{
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/yash/Desktop/java.txt");
        Scanner scan = new Scanner(file);
        String fileContent = "";
        while(scan.hasNextLine())
        {
//            System.out.println(scan.nextLine());
            fileContent = fileContent + scan.nextLine() + "\n";
        }

        FileWriter writer = new FileWriter("/Users/yash/Desktop/toWrite.txt");
        writer.write(fileContent);
        System.out.println(fileContent);
    }
}
