import zajecia12.panes.Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zajecia12 {
    public static void main(String[] args) {
//        stringFormatting();
//        regexp();
        filesII();
//        panes(args);
    }

    private static void panes(String[] args) {
        // kontenery - AnchorPane, StackPane, GridPane
        Main.main(args);
    }

    private static void stringFormatting() {
        // printf %[indeks_argumentu$][znaczniki][szerokość][.precyzja]konwersja
        System.out.printf("%2$3d %1$3d", 1, 2);
        System.out.printf("%2$3.3f %1$3.3f", 1.0/3, 1.0/3);
        System.out.printf("\n%10s %10s", "test", "test2");
        System.out.printf("\n%-10s %-10s", "test", "test2");
        System.out.printf("\n%,100d", 50000000);
        System.out.printf("\n%10e", 500000d);

    }

    private static void filesII() {
        Path p = Path.of("wyniki.txt");
        Path p2 = Path.of("wyniki2.txt");
//        System.out.println(System.lineSeparator());
        try {
            List<String> list = Files.readAllLines(p);
            System.out.println(list);
            System.out.println(list.size());

            List<String> list2 = new ArrayList<>();
            list2.add("Jakiś tekst1");
            list2.add("Jakiś tekst2");
            Files.write(p2, list2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void regexp() {
        String s = "dsfsadsdf dssdfdsfsdf Java is the best adsfsd Jeva is the best";
        Pattern pattern = Pattern.compile("J..a is t.. b..t");
        Matcher matcher = pattern.matcher(s);
//        matcher.find();
////        String find = matcher.group();
//        System.out.println(matcher.start());
//        System.out.println(matcher.group());
//        matcher.find();
//        System.out.println(matcher.group());
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

        pattern = Pattern.compile("[a-v]+");
        matcher = pattern.matcher(s);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

        s = "jakis tekst <strong>j.k_owalski@poczta.pl</strong>";
        pattern = Pattern.compile("[a-z0-9_.]+@[a-z0-9_.]*\\.pl");
        matcher = pattern.matcher(s);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }


        s = "jakis tekst <strong>0 (48) 12 513\t514</strong>";
        pattern = Pattern.compile("(\\+?\\d\\d).\\s+([0-9]{2,3})\\s([0-9]+)\\s([0-9]{3})");
        matcher = pattern.matcher(s);
//        while(matcher.find()) {
//            System.out.println(matcher.group());
//        }
        matcher.find();
//        System.out.println(matcher.group(0));
//        matcher.find();
        System.out.println(matcher.group(1) + " " + matcher.group(2) + " " + matcher.group(3));
        String tekst = "ala ma kota";
        System.out.println(
                tekst.replaceAll("[am]", "o")
        );
//        matcher.find();
//        System.out.println(matcher.group(2));
    }
}
