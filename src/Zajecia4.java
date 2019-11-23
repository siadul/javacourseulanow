import java.util.Scanner;

class MyType {
    // metody...
    static void printClassName() {
        System.out.println("MyType");
    }

    // metoda niestatyczna (czyli dynamiczna)
    void printSomething() {
        System.out.println("Something");
    }
}

public class Zajecia4 {
    public static void main(String[] args) {
//        continueVsBreak(); // wywołanie funkcji (z ang. function call), przekazanie argumentu args do metody continueVsBreak
//        scannerDoWhileAndBreak();
//        switchDemonstration();
//        switchExcercise();
//        methods();
//        methods(); // wywołania metod możemy powtarzać
//        methods();
        classes();
    }

    private static void classes() {
        // Co to są klasy?
        // Klasy to typy zdefiniowane przez nas (programistów,
        // w odróżnieniu od typów podstawowych stworzonych przez projektantów języka).
        // mamy typy podstawowe np. int, double, char itp.
        // oraz mamy typy obiektowe np. String
        // Typy, które tworzmy za pomocą słowa kluczowego class to typy obiektowe
        // składnia:
        // class nazwa_klasy {
        //      definicja pól... (o tym później)
        //      definicja metod...
        // }

        MyType.printClassName();
        MyType myTypeExample; // String myString
        myTypeExample = new MyType();
        myTypeExample.printSomething();
    }

    // metoda nie musi przyjmować żadnych argumentów
    static void continueVsBreak() {
        System.out.println("I'm in continueVsBreak method!");
        // continue i break

        // continue - przejście do następnej iteracji (przebiegu pętli)
        // Przykład
        // Wyświetlić wszystkie liczby podzielne przez 2 lub 3 z przedziału 0 do 1000.
        for(int i=0; i<=1000; i++) {
            if(i % 2 == 0) {
                System.out.println("Liczba " + i + " jest podzielna przez 2");
                continue; // przechodzimy do następnej iteracji
            }
            if(i % 3 == 0) {
                System.out.println("Liczba " + i + " jest podzielna przez 3");
            }
        }

        for(int i=707; i<=1000; i++) {
            if(i % 23 == 0) {
                System.out.println("Liczba " + i + " jest podzielna przez 23");
                break; // wychodzimy z pętli
            }
            if(i % 37 == 0) {
                System.out.println("Liczba " + i + " jest podzielna przez 37");
                break;
            }
        }
    }

    static void scannerDoWhileAndBreak() {
        System.out.println("I'm in scannerDoWhileAndBreak method!");
        // Przykład
        // Wczytywać z klawiatury słowa i zamieniać wszystkie litery w tym słowie na wielkie,
        // dopóki użytkownik nie wpisze "koniec" lub "exit".
        do {
            Scanner scanner = new Scanner(System.in); // Tworzę obiekt Scanner, który umożliwia sczytywanie danych od użytkownika
            String text = scanner.nextLine(); // sczytuję linię podaną przez użytkownika
            //text.toUpperCase - upewnia nas, że będziemy mieć wielkie litery w Stringu
            System.out.println(text.toUpperCase()); // toLowerCase - analogicznie, upewnia nas, że będziemy mieć małe litery
//            if(text == "koniec") { uwaga! to nie zadziała!, stringi porównujemy za pomocą .equals
            if(text.equals("koniec") || text.equals("exit")) {
                break;
            }
        } while(true);
    }

    // Zadanie
    // 1. Proszę wydzielić 2 bloki kodu z metody "loops" do
    // metod "switchDemonstration" oraz "switchExcercise"
    // 2. Proszę wywołać obie te metody w metodzie main

    static void switchDemonstration() {
        System.out.println("I'm in switchDemonstration method!");

        // switch - "rozbudowany if-else"
        // składnia:
        // switch(zmienna) {
        //      case wartość1:
        //           instrukcje;
        //           ...;
        //           break; // opcjonalnie, break sprawia, że nie są wykonywane dalsze instrukcje z bloku switch
        //      case wartość2:
        //           instrukcje;
        //           ...;
        //           break; // opcjonalnie
        //      ...
        //      case wartośćN:
        //           instrukcje;
        //           ...;
        //           break; // opcjonalnie
        //      default:
        //           instrukcje;
        //           ...;
        // }

        String text1 = "koniec";
        switch(text1) {
            case "exit":
                System.out.println("-------------------------------");
                System.out.println("Zmienna text1 ma wartość " + text1);
                System.out.println("-------------------------------");
                break;
            case "koniec":
                System.out.println("*******************************");
                System.out.println("Zmienna text1 ma wartość " + text1);
                System.out.println("*******************************");
                break;
            default:
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("Zmienna text1 nie jest ani \"exit\" ani \"koniec\"");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
    }

    static void switchExcercise() {
        System.out.println("I'm in switchExcercise method!");

        // Zadanie
        // Pobrać za pomocą klasy Scanner od użytkownika 2 ciągi znaków (2 razy instrukcja nextLine):
        // imię oraz operacja
        // Jeżeli użytkownik poda operację "upper" proszę wypisać imię za pomocą dużych liter (toUpperCase)
        // Jeżeli użytkownik poda operację "lower" proszę wypisać imię za pomocą małych liter (toLowerCase)
        // Jeżeli użytkownik poda inny ciąg znaków niż "upper" i "lower"
        // proszę wypisać komunikat "niepoprawna operacja".
        // Skorzystać instrukcji switch.

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String operation = scanner.nextLine();
        switch (operation) {
            case "upper":
                System.out.println(name.toUpperCase());
                break;
            case "lower":
                System.out.println(name.toLowerCase());
                break;
            default:
                System.out.println("niepoprawna operacja");
        }

        // metody - bloki kodu, do których możemy się odwoływać (i je wykonać)
        // składnia - uproszczona wersja
        /*
        typ_zwracany nazwa_metody(typ_argumentu1 nazwa_argumentu1, typ_argumentu2 nazwa_argumentu2, ..., typ_argumentuN nazwa_argumentuN) {
            return; // opcjonalnie - kończy wykonywanie metody
        }

        w jaki sposób możemy się odwołać do metody?
        nazwa_metody(argumenty);
         */
    }

    static void methods() {
        System.out.println("I'm in methods method!");

        // argumenty przekazywane do metody
        // argumenty to mogą być stałe bądź zmienne, które chcemy
        // wykorzystać w bloku kodu zdefiniowanym w metodzie

        // Przykład 1
        // Napisać metodę "messageForUser", która wypisuje komunikat powitalny dla użytkownika.
        // Metoda powinna przyjąć 1 argument typu String o nazwie "name".

        // Zaczynamy od znalezienia właściwego miejsca dla tej metody.
        // Nie dodajemy definicji metody w obrębie innej metody!
        // Nie dodajemy definicji metody poza obrębem klasy!
        // Pilnujemy nawiasów!!!

        // wywołanie - I sposób - przekazujemy stałą do metody messageForUser
        messageForUser("Krzysztof");

        // wywołanie - II sposób - przekazujemy zmienną do metody messageForUser
        String name = "Krzysztof";
        messageForUser(name);

        // Przykład 2 - to samo co Przykładzie 1, ale chcemy teraz wypisywać imie i nazwisko
        // czyli 2 parametry typu String (name i surname)
        String surname = "Kowalski";
        messageForUser(name, surname);

        // Zadanie
        // Napisać metodę "operation1", która pobiera 2 argumenty String "name" oraz String "operation"
        // Metoda powinna wypisywać name z dużych liter, jeżeli operation = "upper" lub "duże"
        // Metoda powinna wypisywać name z małych liter, jeżeli operation = "lower" lub "małe"
        // Metoda powinna wypisywać "niepoprawne działanie", jeżeli operation != "lower" &&
        // operation != "duże" && operation != "upper" && operation != "małe
        // Wywołać metodę "operation1" z różnymi argumentami.
        operation1(name, "upper");
        operation1(name, "duże");
        operation1(name, "lower");
        operation1(name, "małe");
        operation1(name, "???");

        // Zwracanie wartości przez metody
        // Metoda może zwracać jakąś wartość - oznacza to, że metoda w wyniku wykonania
        // instrukcji z jej ciała produkuje jakąś wartość. Wartość tę możemy wykorzystać już poza
        // obrębem metody.

        // Ciało metody (z ang. body) to blok instrukcji zawarty pomiędzy nawiasami '{' i '}'
        // umieszczonymi zaraz po sygnaturze metody.

        // Sygnatura metody to nazwa metody oraz przyjmowane argumenty wraz z ich typami.
        // Przykład sygnatury metody: messageForUser(String name)

        // Przykład metody, która zwraca jakąś wartość
        // Napisać metodę, która zwraca kwadrat z liczby zmiennoprzecinkowej podanej jako argument.
        double result;
        result = square(10);
        System.out.println(result);

        // Przykład 2
        // Napisać metodę, która liczy sumę 3 liczb zmiennoprzecinkowych podanych jako argumenty
        System.out.println(sumOfThreeValues(2+3, 5+5, 10+5));

        // Przykład 3
        // Napisać metodę, która zwraca String zbudowany z 3 członów podanych jako argument:
        // prefix, text oraz suffix
        // oddzielonych sepratorem (pojedynczy znak) podanym jako argument.
        String builtString = buildString("Thinking", "in", "Java", '-');
        System.out.println(builtString);

        // Zadanie
        // Napisać metodę, która przyjmuje 4 argumenty: c1, c2, c3, order
        // c1 - znak
        // c2 - znak
        // c3 - znak
        // order - wartość typu logicznego (boolean)
        // Metoda ma zwracać String zbudowany z c1, c2 i c3 w taki sposób, że jeżeli
        // order = true, to zachowujemy kolejność, czyli String wyjściowy będzie wygladał
        // w taki sposób c1c2c3.
        // Jeżeli natomiast order = false, to budujemy Stringa w odwrotnej kolejności, czyli
        // String wyjściowy będzie wyglądał w ten sposób: c3c2c1.

        // In: 'x', 'y', 'z', true
        // Out: "xyz"
        // In: 'x', 'y', 'z', false
        // Out: "zyx"

        // wskazówka:
        // String result = "" + c1 + c2 + c3;

        // UWAGA!
        // Jeżeli w definicji metody określimy typ zwracany różny od void to wówczas w ciele tej metody
        // musi pojawić się return.
        // Instrukcje po słowie return nie wykonają się, więc ostatnia instrukcja w takiej metodzie
        // to musi być return.
        String e = excerciseV1('x', 'y', 'z', true);
        System.out.println(e);
        e = excerciseV1('x', 'y', 'z', false);
        System.out.println(e);

        e = excerciseV2('x', 'y', 'z', true);
        System.out.println(e);
        e = excerciseV2('x', 'y', 'z', false);
        System.out.println(e);

        e = excerciseV3('x', 'y', 'z', true);
        System.out.println(e);
        e = excerciseV3('x', 'y', 'z', false);
        System.out.println(e);


    }

    static String excerciseV1(char c1, char c2, char c3, boolean order) {
        String s1 = "" + c1 + c2 + c3;
        String s2 = "" + c3 + c2 + c1;
        String s;
        if(order) {
            s = s1;
        } else {
            s = s2;
        }

        return s;
    }

    static String excerciseV2(char c1, char c2, char c3, boolean order) {
        if(order) {
            return "" + c1 + c2 + c3;
        } else {
            return "" + c3 + c2 + c1;
        }
    }

    static String excerciseV3(char c1, char c2, char c3, boolean order) {
        //        warunek ? wartosc_jezeli_prawda : wartosc_jezeli_fałsz
        return order ? "" + c1 + c2 + c3 : "" + c3 + c2 + c1;
    }

    static String buildString(String prefix, String text, String suffix, char separator) {
        String result = prefix + separator + text + separator + suffix;

        return result;
    }

    static double sumOfThreeValues(double a, double b, double c) {
        return a + b + c;
    }

    static double square(double x) {
//        System.out.println("I'm in square method!");
        return x*x;
    }

    static void messageForUser(String name) {
        System.out.println("Hello " + name + "!");
    }

    static void messageForUser(String name, String surname) {
        System.out.println("Hello " + name + " " + surname + "!");
    }

    static void operation1(String name, String operation) {
        System.out.println("I'm in operation1 method!");

        switch (operation) {
            case "duże": // jeżeli pominiemy break; to wykonywane są pozostałe instrukcje aż do "break" z innego case albo końca bloku switch
            case "upper":
                System.out.println(name.toUpperCase());
                break;
            case "małe":
            case "lower":
                System.out.println(name.toLowerCase());
                break;
            default:
                System.out.println("niepoprawna operacja");
        }
    }
}



