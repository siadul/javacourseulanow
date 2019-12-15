package exam.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        File file = new File("literki.txt");
        Scanner scanner;
        PrintWriter outHist;
        try {
            outHist = new PrintWriter("hist.txt");
            scanner = new Scanner(file);

            String line = "";
            StringBuilder stringBuilder = new StringBuilder();
            int[] hist = new int[128];
            while(scanner.hasNextLine()) {
                line = scanner.nextLine();
//                System.out.println(Arrays.toString(line.split(""))); // I sposób
                char[] lineChars = line.toCharArray(); // II sposób
                for(char c: lineChars) {
                    System.out.println(c);
                    if(c > 127) {
                        continue;
                    }
                    hist[c]++;
                }

                stringBuilder.append(line).append('\n');
            }

            String s = Arrays.toString(hist);
            System.out.println(s);
//            System.out.print('[');
//            for(int i=0; i<hist.length; i++) {
//                if(i < 33) {
//                    System.out.print(" , ");
//                } else {
//                    System.out.print((char) i + ", ");
//                }
//            }
            outHist.println(s);
            for(int i=0; i<hist.length; i++) {
                String s2 = (char) i + ": " + hist[i];
                System.out.println(s2);
                outHist.println(s2);
            }

            String fileContent = stringBuilder.toString();
            System.out.println(fileContent);
            char maxC1 = findMaxChar(fileContent, hist, (char) 128);
            char maxC2 = findMaxChar(fileContent, hist, maxC1);
            System.out.println(maxC1); // z
            System.out.println(maxC2); // a


            PrintWriter outZamiana = new PrintWriter("zamiana.txt");

            scanner.close();
            Scanner scanner2 = new Scanner(new File("literki.txt"));
            while(scanner2.hasNextLine()) {
                line = scanner2.nextLine();
                char[] lineChars = line.toCharArray(); // II sposób
                for(char c: lineChars) {
                    if(c == maxC1) {
                        outZamiana.print(maxC2);
                    } else if(c == maxC2) {
                        outZamiana.print(maxC1);
                    } else {
                        outZamiana.print(c);
                    }
                }
                outZamiana.println();
            }

            PrintWriter outWspak = new PrintWriter("wspak.txt");
            System.out.println(stringBuilder.reverse());
            outWspak.print(stringBuilder);

            outWspak.close();
            scanner2.close();
            outZamiana.close();
            outHist.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się otworzyć pliku literki.txt");
        }
    }

    private static char findMaxChar(String text, int[] hist, char ignoreChar) {
        char maxChar = 0;
        int count = 0;
        for(int i=0; i<hist.length; i++) {
            // szukaj hist[i] = max(hist), takiego że i != ignoreChar
            if(i != ignoreChar && hist[i] > count) {
                count = hist[i];
                maxChar = (char)i;
            }
        }

        return maxChar;
    }


}
