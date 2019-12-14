import java.io.*;
import java.util.*;

public class Zajecia11 {
    public static void main(String[] args) throws IOException {
//        saveToFile();
//        appendTofile();
        readFile();

    }

    private static void readFile() {
        File file = new File("text1.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line;
            while(scanner.hasNext()) {
                line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się otworzyć pliku!");
        }
    }

    private static void appendTofile() throws IOException {
        FileWriter fileWriter = new FileWriter("text1.txt", true);
        PrintWriter out = new PrintWriter(fileWriter);
        out.println("Raz");
        out.println("Dwa");
        out.print("Trzy");
        out.println("Cztery");

        // UWAGA! zamykamy plik metodą close!
        out.close();
    }

    private static void saveToFile() throws FileNotFoundException {
        PrintWriter out = new PrintWriter("text.txt");
        out.println("Raz");
        out.println("Dwa");
        out.print("Trzy");
        out.println("Cztery");

        // Kontenery - gridy, stackpane itp.
        // łańcuchy znaków II wzorce

        // UWAGA! zamykamy plik metodą close!
        out.close();
    }
}
