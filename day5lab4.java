import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String fileName = scnr.nextLine();
        FileInputStream fileData = new FileInputStream(fileName);
        Scanner fileScanner = new Scanner(fileData);
        while (fileScanner.hasNextLine()) {
            String photoFileName = fileScanner.nextLine();
            int underscore = photoFileName.lastIndexOf("_");
            String infoFileName = photoFileName.substring(0,underscore) + "_info.txt";
            System.out.println(infoFileName);
        }
    }
}