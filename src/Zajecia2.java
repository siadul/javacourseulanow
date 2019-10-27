import java.util.Arrays;

public class Zajecia2 {
    public static void main(String[] args) {
        System.out.println("Zajecia2");

        // typy liczbowe całkowite
        int calkowita; // aby korzystać ze zmiennej
        // musi ona być ZAINICJALIZOWANA
        // INICJALIZACJA oznacza przypisanie do zmiennej wartości
        // początkowej
        calkowita = 5;
        System.out.println(calkowita);


        byte b1 = (byte) 69; // -128, 127
        byte b2 = (byte) 1000; // UWAGA! tutaj zachodzi utrata pewnej informacji zapisanej
        // na bitach, które się nie mieszczą w 8 bitach

        // 0-9
        // 0-1
        // byte - 1111 1111

        System.out.println(b1);
        System.out.println(b2); // 1000 nie mieści się w zakresie -128, 127, dostaniemy
        // wynik, którego się nie spodziewamy

        short s1 = (short) 1000; // 2 bajty, -32 768 do 32 767
        short s2 = (short) 100000; // znowu tracimy część bitów
        System.out.println(s1);
        System.out.println(s2);

        short s3 = 3;
        short s4 = (short) (s3 + s3); // dopiero rzutowanie umożliwia nam taką operacje
        // ponieważ kompilator zakłada pesymistyczne, że suma 2 shortów może przekroczyć
        // zakres

        // int - 4 bajty, -2 147 483 648 do 2 147 483 647

        long l1 = 1; // 8 bajtów, -2^63 do (2^63)-1
        l1 = 455555555;

        // jeżeli potrzebujemy operować na jeszcze większych liczbach całkowitych
        // używamy BigInteger z pakietu java.math

        // typy liczbowe rzeczywiste
        float f = 5.67f; // 4 bajty - domyślnie stałe zmiennoprzecinkowe są typu double
        //
        double d = 5.67; // 8 bajtów
        System.out.println(f);
        System.out.println(d);
        // dla większych liczb rzeczywistych - BIGDECIMAL

        // typ znakowy
        char c1 = 'a'; // 2 bajty, UNICODE
        // UWAGA!
        // Do tworzenie Stringów używamy cudzysłowu "jakiś tekst"
        // Do tworzenia znaków (char) używamy apostrofów 'a'

        System.out.println(c1);

        char c2 = '\uaF0F'; // mogę utworzyć dowolny znak unicode
        // za pomocą \\uXXXX, gdzie X - cyfra w systemie heksadecymalnym
        System.out.println(c2);
        char c3 = '\n'; // UWAGA! znaki specjalne musimy poprzedzić znakiem BACKSLASH (\)
        char c4 = '\t';
        char c5 = '"';
        char c6 = '\"'; // np. String "ksiazka pt. \"Thinking in Java\" ";
        char c7 = '\\'; // np. String "4\\5"
        char c8 = '\'';
        System.out.println(c3);
        System.out.print(c4); // wypisywanie bez przejścia do nowej linii metoda print
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println("równanie 10\5 = 2"); // równanie 10 = 2
        System.out.println("równanie 10\\5 = 2"); // równanie 10\5 = 2

        // typ logiczny
        boolean boolean1 = true; // true lub false - 1 bit
        System.out.println(boolean1);
        boolean boolean2 = false; // true lub false - 1 bit
        System.out.println(boolean2);
//        boolean boolean3 = 0; // UWAGA! NIE MA domyślnego rzutowania int na boolean jak np. w C++


        // inicjalizacja zmiennych
        int i1 = 10;
        int i2 = 0xA; // możemy tworzyć stałe zapisując je w systemie
        // heksadecymalnym, musimy ją poprzedzić znakami 0x
        int i3 = 0xF; // 15
        int i4 = 010; // 15
        // cyfry w systemie hexadecymalnym
        // 0123456789ABCDEF
        // cyfry w systemie ósemkowym
        // 01234567
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4); // 8

        // 01234 - system ósemkowy
        // 4*8^0 + 3*8^1 + 2*8^2 + 1*8^3 =  4 + 24 + 128 + 512 = 668
        System.out.println(01234);

        // system szesnastkowy (hexadecymalny)
        // 0XABCD = D*16^0 + C*16^1 + B*16^2 + A*16^3
        // = 13 + 12*16 + 11*256 + 4096 = 13 + 192 + 2816 + 40960 = 43981
        System.out.println(0xABCD);

        // 1010 1000 = 0*2^0+0*2^1+0*2^2
        // + 1*2^3 + 0*2^4 + 1*2^5 + 0*2^6 + 1*2^7
        // = 2^3 + 2^5 + 2^7 = 8 + 32 + 128 = 168

        // 1, 2, 4, 8, 16, 32, 64, 128, 256
        // 0, 1, 2, 3,  4,  5,  6,   7,   8
        // 128 + 32 + 8 = 2^7 + 2^5 + 2^3
        // 2^7 = 10000000 w systemie binarnym
        // 2^5 = 00100000 w systemie binarnym
        // 2^3 = 00001000 w systemie binarnym
// dodaje kolumn.10101000

        int i5 = 3_000_000; // możemy używać znaku '_' dla zwiększenia czytelności
        System.out.println(i5);

        // stałe zmiennoprzecinkowe
        double d1 = 4.;
        double d2 = 4.0;
        System.out.println(d1);
        System.out.println(d2);
        double d3 = 300_000_000;
        double d4 = 3E8; // 3E8 = 3*10^8 = 300000000
        double d5 = 3e6; // 3E6 = 3*10^5 = 3000000
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        double d6 = .345;
        System.out.println(d6);

        // stałe znakowe
        char c9 = '\uFFFF'; // podając kod w systemie 16tkowym
        char c10 = '\142'; // podając kod ósemkowy
        System.out.println(c9);
        System.out.println(c10);


        // PODSUMOWANIE
        // typy podstawowe:
        // byte, short, int, long, float, double, boolean, char

        // typy obiektowe:
        // np. String, Array, WŁASNY_TYP
        // WŁASNY_TYP tworzymy za pomocą słowa kluczowego class

        // String - łańcuchy znaków
        String nazwaZmiennej;
        nazwaZmiennej = "jakiś tekst";
        System.out.println(nazwaZmiennej);
        // typy obiektowe mają swoje metody oraz pola
        String A1;
        A1 = "cośsdfxfdsfsdsdfsddssdfs";
        // Cel: chce policzyć znaki w stringu str1
        // Podpowiedź: metoda length zwraca liczbę znaków w stringu
        // I sposób
        System.out.println(
                A1.length()
        );


        // II sposób
        int A2;
        A2 = A1.length(); // length jest metodą należącą do klasy String
        System.out.println(A2);
        // length zwraca liczbę znaków występujących w Stringu

        // Zadanie - wyświetlić tekst zbudowany z 3 stringów, oddzielone " "
        String str2 = "I";
        String str3 = "<3";
        String str4 = "Java";

        // I sposób
        System.out.print(str2);
        System.out.print(" ");
        System.out.print(str3);
        System.out.print(" ");
        System.out.println(str4);

        // II sposób - w jednym println
        System.out.println(str2 + " " + str3 + " " + str4); // operator konkatenacji +
        // konkatenacja to łączenie łańcuchów znaków

        // ZADANIE
        // wypisać ciąg znaków zbudowanych z str2, str3 i str4 korzystając z POMOCNICZEJ ZMIENNEJ
        // str5
        // III sposób
        String str5 = str2 + " " + str3 + " " + str4;
        System.out.println(str5);

        // str.charAt(pozycja) - zwraca znak stojący na pozycji,
        //                       którą przekaże jako argument do tej funkcji
        System.out.println(str5.charAt(0));
        System.out.println(str5.charAt(1));
        System.out.println(str5.charAt(3));

        // Zadanie 2
        // a) stworzyć zmienną typu int "z2i", zainicjalizować ją jakąś wartością
        // b) stworzyć zmienną typu String "z2str", zainicjalizować ją jakimś łańcuchem znaków
        // c) stworzyć zmienną typu short "z2s", przypisać do niej długość Stringa "z2str"
        //    uwaga, będzie trzeba użyć rzutowania (short)
        // d) stworzyć zmienną typu char "z2c", przypisać do niej znak znajdujący się w stringu
        //    "z2str" stojący na pozycji o indeksie "z2i"
        // e) wyświetlić wartości zmiennych "z2i", "z2str", "z2s", "z2c"


        // Tablice
        // Tablica to jest zbiór zmiennych o ustalonym rozmiarze (TEGO SAMEGO TYPU),
        // do których możemy odwoływać się za pomocą indeksów.
        int[] array; // deklaracja zmiennej
        // musimy ją zainicjalizować przed skorzystaniem z niej
        array = new int[10];
        System.out.println(array);

        // UWAGA!
        // tablice są typami obiektowymi
        // typy obiektowe przekazane do metody System.out.println sprawiają, że wypisywany jest
        // adres tego obiektu w komórce pamięci
        // [I@5b6f7412
        // [ - tablica
        // I - int
        // @5b6f7412 - adres komórki pamięci w której przechowywany jest obiekt

        double[] array2; // deklaracja zmiennej
        // musimy ją zainicjalizować przed skorzystaniem z niej
        array2 = new double[10];
        System.out.println(array2);

        // jak wypisać zawartość tablicy array2?
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println(array2[3]);
        System.out.println(array2[4]);
        System.out.println(array2[5]);
        System.out.println(array2[6]);
        System.out.println(array2[7]);
        System.out.println(array2[8]);
        System.out.println(array2[9]);

        // inicjalizując tablicę za pomocą operatora new "new double[10]" otrzymuję
        // tablicę wypełnioną wartościami domyślnymi

        // wartości domyślne dla typów podstawowych
        // char - '\0'
        System.out.println(new char[3]);
        // int - 0
        // short - (short)0
        // long - 0l
        // byte - (byte)0
        // double - 0.0
        // float - 0.0f
        System.out.println(0l);
        // boolean - false
        boolean[] array3 = new boolean[3];
        System.out.println(array3[0]);

        // ta sama operacja, ale bez zmiennej pomocniczej
        System.out.println((new boolean[3])[0]); // utworzenie tablicy boolean
        // i jednoczesne pobranie zerowego elementu
        System.out.println((new boolean[3])[1]);
        System.out.println((new boolean[3])[2]);

        // wartość domyślna dla typów obiektowych
        System.out.println((new String[1])[0]); // null (typ pusty)
        // DLA TYPÓW OBIEKTOWYCH, null jest wartością domyślną
        // null oznacza, że zmienna typu obiektowe nie wskazuje na żaden konkretny obiekt

        // Skoro tablica może przechowywać typy obiektowe
        // a tablica jest typem obiektowym
        // to znaczy, że tablica może przechowywać inne tablice.
        // Tablice, które przechowują inne tablice nazywamy tablicami wielowymiarowymi.
        String[][] multiDimensionArray = new String[3][]; // wymagane jest tylko podanie ilości
        // elementów tablicy zewnętrznej
        System.out.println(multiDimensionArray);

        // operacje na tablicach jednowymiarowych
        // jak wypełnić tablicę?
        int[] intArray = new int[3];
        intArray[0] = 10;
        intArray[1] = 100;
        intArray[2] = 1000;
//        intArray[3] = 10000; // ArrayIndexOutOfBoundsException - wykraczam poza rozmiar tablicy
        System.out.println(intArray[2]);
        System.out.println(intArray[1]);
        System.out.println(intArray[0]);

        // inicjalizacja w miejscu definicji
        int[] intArray2 = {10, 100, 1000}; // kompilator sam jest w stanie sobie policzyć elementy
        // i wypełnić ją na podstawie wartości, które podamy w nawiasie {}
        System.out.println(intArray2[2]);
        System.out.println(intArray2[1]);
        System.out.println(intArray2[0]);
//        intArray2 = {10, 100, 1000}; // tutaj nie zadziała, możemy tak zrobić tylko
//        w definicji zmiennej tablicowej
        intArray2 = new int[]{10, 100, 1000};
        System.out.println(intArray2[2]);
        System.out.println(intArray2[1]);
        System.out.println(intArray2[0]);

        // wypisywanie zawartości tablicy przy pomocy metody pomocniczej Arrays.toString
        System.out.println(Arrays.toString(intArray2));

        // Operatory
        // operatory arytmetyczne
        System.out.println(4 + 6);
        System.out.println(4 - 6);
        System.out.println(4 * 6);
        System.out.println(4 / 6);

        // operator relacji
        System.out.println(4 > 6);
        System.out.println(4 < 6);
        System.out.println(4 >= 6);
        System.out.println(4 <= 6);
        // UWAGA, to poniżej nie zadziała
//        System.out.println(4 = 6); // ponieważ = to operator przypisania
        System.out.println(4 == 6);

        // if-else - chcemy uzależnić wykonywanie kodu od jakiegoś warunku
        // składnia
        // if(warunek1) {
        //      instrukcje jeżeli warunek1 jest spełniony
        // } else if(warunek2) {
        //      instrukcje jeżeli warunek1 jest niespełniony i warunek2 jest spełniony
        // } else {
        //      instrukcje jeżeli warunek1 oraz warunek2 są niespełnione
        // }

        // uwaga, blok else jest opcjonalny
        // uwaga, blok else if jest opcjonalny
        // Przykład:
        // jeżeli A > B
        // chcemy wypisywać komunikat: "zmienna A jest większa od zmiennej B"
        // jeżeli A < B
        // chcemy wypisywać komunikat: "zmienna B jest większa od zmiennej A"
        // jeżeli A == B
        // chcemy wypisywać komunikat: "zmienna A jest równa zmiennej B"

        int A = 10;
        int B = 10;
        if(A > B) {
            System.out.println("zmienna A jest większa od zmiennej B");
        } else {
            if(A < B) {
                System.out.println("zmienna B jest większa od zmiennej A");
            } else {
                System.out.println("zmienna A jest równa zmiennej B");
            }
        }

        // możemy uprościć naszą instrukcję if-else
        if(A > B) {
            System.out.println("zmienna A jest większa od zmiennej B");
        } else if (A < B) {
            System.out.println("zmienna B jest większa od zmiennej A");
        } else {
            System.out.println("zmienna A jest równa zmiennej B");
        }

        // Zadanie
        // wypisać stosowny komunikat w zależności od tego czy długość nazwiska
        // jest większa/mniejsza bądź równa 6 znaków
























    }
}
