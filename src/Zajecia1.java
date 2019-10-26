/**
 * @author krzysztof siadul
 */
public class Zajecia1 { // klasa - zawiera metody(funkcje) i pola
    // klasa publiczna musi nazywać się tak jak plik w którym się znajduje
    // (bez ".java")
    // Do zapisu nazw klas, metod i pol - konwencja CamelCase
    // Nazwy klasy zaczynamy Z DUŻEJ LITERY

    // pola (fields)
    // int x = 4;
    // int y = 5;
    // double z = 4.5;
    // String a = "";

    // funkcje
    // metoda główna - musi istnieć

    /**
     * Opis do metody głównej
     * Wyświetla Hello world i dwa argumenty podane jako wejście
     * @param args tablica argumentow; imie i nazwisko
     */
    public static void main(String[] args) {
        // od tego miejsca zaczyna się wykonywanie programu
        System.out.println("Hello world! My name is...");

//         zmienna - pozwala przechowywać dokładnie jedną wartość danego typu
//         tablica - pozwala przechowywać wiele wartości jednego typu
//         w tym przypadku
//         args jest tablicą łańcuchów znaków (String)
//         łańcuch znaków to tekst np. "abc", "def", "ghi"
//         w odróżnieniu od np. liczb całkowitych int 0,1,2 itp.

        System.out.println(args[0]); // folder1
        System.out.println(args[1]); // folder2

        // wyjaśnienie
        // aplikacje możemy uruchamiać w trybie tekstowym lub graficznym
        // domyślnie uruchamiane są w trybie tekstowym

        // komentarze
        // - jednoliniowy
        /*
        komentarz obejmujący wiele
        linii
        kodu
         */
        /**
         * komentarz dokumentujący
         * metody, pola lub klasy
         */

        // jak tworzymy zmienne
        // TYP NAZWA_ZMIENNEJ;

        // nazwa - konwencja camelcase, zaczynamy z małej litery
        int jakasZmiennaZbudowanaZWieluSlow;
        jakasZmiennaZbudowanaZWieluSlow = 1765; // PRZYPISANIE
        // wartości 1 do zmiennej jakasZmiennaZbudowanaZWieluSlow

        System.out.println(jakasZmiennaZbudowanaZWieluSlow);

        // Zadanie
        // stworzyć 2 zmienne i wyświetlić ich sumę
        // zmienna1 + zmienna2

        // I sposób
        int zmienna1;
        zmienna1 = 65;
        int zmienna2 = 35;

        System.out.println(zmienna1 + zmienna2); // println wyświetla
        // to co znajduje się pomiędzy nawiasami ()

        // II sposób
        int zmienna1b;
        int zmienna2b;
        int zmienna3b;
        zmienna1b = 65;
        zmienna2b = 35;
        zmienna3b = zmienna1b + zmienna2b;
        System.out.println(zmienna3b);

        // Operatory, instrukcje sterujące



    }
}
