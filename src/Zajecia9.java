import zajecia9.*;

import java.util.*;

class DivisionBy0Exception extends Exception {}
//class DivisionBy0Exception extends RuntimeException {}
// UWAGA! Jeżeli klasa wyjątku, który jest rzucany, nie jest pochodną RuntimeException
// to wówczas musimy obsłużyć wyjątek (inaczej program sie nie skompiluje).
// Jeżeli klasa wyjątku, który jest rzucany, jest pochodną RuntimeException to wówczas
// nie ma obowiązku dodawania obsługi tego wyjątku.
// Obsługę wyjątku realizujemy za pomoca bloku try-catch lub oznaczając metodę,
// która wykonuje niebezpieczny kod za pomocą słowa kluczowego throws.

public class Zajecia9 {
    public static void main(String[] args) {
        // interfejsy - abstract i pola, dziedziczenie interfejsów
        // polimorfizm - ćwiczenia, instanceof, dziedziczenie interfejsów
        // klasy wewnętrzne skrót, anonimowe + lambda, static class
//        instanceofAnonymousLambdaAndExceptions();
//        ex1Lambda();

        // wyjątki
//        exceptions2();

        // tablice wielowymiarowe
//        multidimensionsArrays();

        // kontenery
        lists1();

        // wejście-wyjście
        // łańcuchy znaków
        // gui
    }

    private static void lists1() {
        // Tablice są fajne, ale mają stały rozmiar.
        // A co jeżeli chcemy dynamicznie zmieniać liczbę przechowywanych elementów?
        // Korzystamy z kontenerów.
        // Kontenery dzielą się na Collection oraz Map
        // Collection - pozwalają nam przechowywać elementy w jakiś określony sposób
        // np. zachowując kolejność dodawania, bądź posortowane wg wartości
        // Mapy - pozwalają nam przechowywać odwzorowania obiektów na inne obiekty
        // Najprostszym przykładem kolekcji jest ArrayList
        ArrayList list = new ArrayList();
        list.add(4);
        list.add(5);
        list.add(6);
        int[] arr = {4, 5, 6};
        System.out.println(list);
        System.out.println(arr);
        list.add(7);
        list.remove(0);
        list.clear();
//        list.removeAll();
        System.out.println(list);
        list.add("abc");
        list.add(7);
        list.add('3');
        list.add(true);
        list.add(new int[]{3,4,5});
        System.out.println(list);
        int sum = 0;
        for (Object el: list) {
            System.out.println(el);
            Zajecia9 zaj9 = new Zajecia9();
            zaj9.toString();
            try {
                sum += (int) el;
            } catch(ClassCastException e) {
                sum += 0;
            }
        }
        System.out.println(sum);

        ArrayList<Integer> listOfInt = new ArrayList<Integer>();
        listOfInt.add(3); // automatyczne pakowanie w obiekty! tzn. typy prymitywne
        // są opakowywane w klasy im odpowiadające
        listOfInt.add(4);
        listOfInt.add(5);
//        listOfInt.add("sdds"); // dzięki określeniu typu przechowywanych elementów
//        listOfInt.add('s'); // kompilator nie pozwoli nam umieścic obiektów nieprawidłowych
//        listOfInt.add(false); // typów w tym kontenerze

        sum = 0;
        for (int el: listOfInt) {
            sum += el;
        }
        System.out.println(sum);
//        Arrays.toString();
//        ArrayList.toString();
        // wszystkie kontenery mają zdefiniowaną wersję toString, która sprawia,
        // że jeżeli przekażemy taki kontener do System.out.println (lub każdej innej
        // korzystającej ze String.valueOf) to wówczas zawartość tego kontenera będzie
        // wypisana w "ładny" sposób (w odróżnieniu od tablic).

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("test1");
        linkedList.add("test2");
        linkedList.add("test3");
        System.out.println(linkedList);

        List<Integer> list1 = new ArrayList<Integer>();
        list1 = new LinkedList<Integer>();
        // ArrayList vs LinkedList
        // różnica jest w wewnętrznej implementacji, ArrayList może działać szybciej
        // gdy mamy dużą liczbę odczytów/zapisów.
        // LinkedList może działać szybciej jeżeli zmieniamy (dodajemy/usuwamy)
        // liczbę elementów w kontenerze.

        // Dzięki stosowaniu interfesjów mamy elastyczność tzn. w sytuacji
        // gdy nie jesteśmy pewni co do wybranej implementacji kontenera
        // nasz program nie ulegnie znacznej modyfikacji jeżeli operujemy na interfejsach
        // Minus: mamy do wyboru tylko metody wspólne na LinkedList i ArrayList

    }

    private static void multidimensionsArrays() {
        // Przykład
        // Stworzyć metodę, która przymuje int n i zwraca macierz kwadratową o wymiarach
        // n x n wypełnioną kolejnymi liczbami naturalnymi (> 0)
        int[][] matrix0 = createMatrix(3);

        // wypisywanie macierzy Arrays.toString - tylko dla tablic jednowymiarowych
        for(int i=0; i<matrix0.length; i++) {
            System.out.println(Arrays.toString(matrix0[i]));
        }

        // dla tablic wielowymiarowych
        System.out.println(
                Arrays.deepToString(matrix0)
        );
    }

    private static int[][] createMatrix(int n) {
        // dla ustalonego n
        // pierwszy sposób inicjalizacji tablic
        int[][] matrix0 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        // drugi sposób

        int[] matrix1 = {1, 2, 3};
        int[] matrix2 = {4, 5, 6};
        int[] matrix3 = {7, 8, 9};

        int[][] matrix4 = {
                matrix1,
                matrix2,
                matrix3,
        };

        // 1 2
        // 3 4
        // 5 6
        // 7 8
        int[][] matrix5 = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
        };
        System.out.println(Arrays.deepToString(matrix5));

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 0
        int[][] matrix6 = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 0},
        };
        System.out.println(Arrays.deepToString(matrix6));
        for(int i = 0; i < matrix6.length; i++) {
            for(int j = 0; j < matrix6[i].length; j++) {
                System.out.println(matrix6[i][j]);
            }
        }

        int[][][] tensor0 = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}},
        };
        System.out.println(Arrays.deepToString(tensor0));

//        int k = 1; // I sposób
        int[][] result = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
//                result[i][j] = k++; I sposób
                result[i][j] = (j+1)+n*i;

                // 0 0
                // 0 1
                // 0 2
                // 1 0
                // 1 1
                // 1 2
                // 2 0
                // 2 1
                // 2 2

            }
        }

        return result;
    }

    private static void exceptions2() {
        // Przykład 3
        // Stworzyć metodę divide(double x, double y), która przyjmuje 2 argumenty i zwraca rezultat dzielenia ich
        // przez siebie.
        // Dodać metodę calculate, która w pętli będzie pobierać dane od użytkownika,
        // wpisane z klawiatury, wywoływać metodę divide i wypisywać wynik
        // na ekran. Wartość początkowa x = 1000.
        // Kiedy użytkownik wpisze "exit" powinniśmy wyjść z programu.
        // Jeżeli użytkownik jako dzielnik poda wartość 0 program
        // powinien się dalej wykonywać i jedynie powinniśmy wyświetlić stosowny
        // komunikat.
        // Jeżeli użytkownik zamiast liczby poda ciąg znaków różny od "exit" program
        // powinien się dalej wykonywać i jedynie powinniśmy wyświetlić stosowny komunikat.

        // Tworzenie własnych wyjątków.
        // Możemy utworzyć własne klasy, które reprezentują wyjątki, wówczas taka klasa
        // musi być pochodną klasy Exception.
        // rzucanie wyjątków:
        // throws wyjątek
        // np. throw new ExceptionClass()

        class Calculator {
            double divide(double x, double y) throws DivisionBy0Exception {
                if (0 == y) {
//                    throw new ArithmeticException();
                    throw new DivisionBy0Exception();
                }
                return x/y;
            }
            void calculate() throws ArithmeticException, DivisionBy0Exception {
                Scanner scanner = new Scanner(System.in);
                double x = 1000;
                while(true) {
                    String line = scanner.nextLine();
                    double y;
                    if(line.equals("exit")) {
                        System.exit(0);
                    }
                    try {
                        y = Double.parseDouble(line);
                    } catch(NumberFormatException e) {
                        System.out.println("Wprowadzono niepoprawny ciąg znaków. " +
                                "Podaj liczbe lub wpisz \"exit\".");
                        continue;
                    }
                    x = divide(x, y);
                    System.out.println(x);
                }
            }
        }

        Calculator calculator = new Calculator();
        double result = 0;
        try {
            result = calculator.divide(5, 0);
            // przechwytywanie wielu wyjątków w jednym bloku catch
        } catch(ArithmeticException | DivisionBy0Exception e) {
            System.out.println("Nie dziel przez 0!");
//            e.printStackTrace();
        }
        try {
            calculator.calculate();
        } catch(ArithmeticException e) {
            System.out.println("Nie dziel przez 0!");
        } catch(DivisionBy0Exception e) {
            System.out.println("Nie dziel przez 0!");
        }
        System.out.println(result);
    }

    private static void ex1Lambda() {
        // Game jest klasą wewnętrzną
        class Game {
            int start(Movable movable) {
                movable.move();
                return 0;
            }
            int start(Pawn pawn) {
                pawn.doSomething();
                return 0;
            }
            int start(Pawn pawn, Playable playable, Movable movable, Beatable beatable) {
                pawn.doSomething();
                pawn.move();
                pawn.attack();
                pawn.play();
                pawn.doSomething();
                playable.move();
                playable.attack();
                playable.play();
                movable.move();
                beatable.beat();
                return 0;
            }
        }

        Game game = new Game();
        game.start(() -> System.out.println("move1"));
        game.start(new Pawn(){
            @Override
            public void move() {
                System.out.println("move2");
            }

            @Override
            public void attack() {
                System.out.println("attack2");
            }

            @Override
            public void play() {
                System.out.println("play2");
            }
        });
        game.start(new Pawn() {
            @Override
            public void move() {
                System.out.println("move2");
            }

            @Override
            public void attack() {
                System.out.println("attack2");
            }

            @Override
            public void play() {
                System.out.println("play2");
            }
        }, new Playable() {
            @Override
            public void play() {
                System.out.println("play3");
            }

            @Override
            public void attack() {
                System.out.println("attack3");
            }

            @Override
            public void move() {
                System.out.println("move3");
            }
        },
                () -> System.out.println("move4"),
                () -> System.out.println("beat5")
        );


        // Stworzyć 1 nieabstrakcyjną klasę Game z przeciążoną metodą start
        // - int start(Movable movable)
        // - int start(Pawn pawn)
        // - int start(Pawn pawn, Playable playable, Movable movable, Beatable beatable)
        // Wywołać wszystkie wersje metody start nie tworząc zewnętrznych klas
        // za pomocą słowa kluczowego class.
        // Kiedy to możliwe użyj lambdy.
    }

    private static void instanceofAnonymousLambdaAndExceptions() {
        try {
            dangerousMethod();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

        // składnia
        // try {
        //  // niebezpieczne instrukcje tzn. mogące rzucić wyjątek
        // } catch(KlasaWyjątku nazwaZmiennejDoKtórejBędziePrzypisanyWyjątek) {
        //     instrukcje obsługi wyjątku
        // } finally {
        //     instrukcje wykonywane niezależnie od tego czy był rzucony jakikolwiek
        //     wyjątek (również ten nie przechwycony przez nas)
        // }

        // dalsze instrukcje wykonywane niezależnie od tego czy był rzucony wyjątek
        // "KlasaWyjątku" czy też nie


        System.out.println("after play");
    }

    private static void dangerousMethod() {
        // składnia:
        // object instanceof classname/interface

        // Przykład 1:
        // Stworzyć 3 interfejsy 2 bazowe (CanAttack, Movable) i 1 rozszerzający je
        // Playable. Każdy interfejs powinien zawierać 1 metodę.
        // Następnie utworzyć klase abstrakcyjną Pawn, która implementuje
        // interfejs pochodny (Playable), a potem klasę, która rozszerza tę klasę abstrakcyjną
        // ChessPawn oraz implementuje nowy interfejs Beatable z metodą beat();
        // Utworzyć tablicę Playable[] wypełnić ją różnymi obiektami.
        // Jeżeli Playable[n] implementuje Beatable powinna zostać wywołana ta metoda.
        Playable[] playables = new Playable[10];
        for (int i = 0; i < playables.length; i++) {
            if (i % 3 == 0) {
                playables[i] = new ChessPawn();
                if (playables[i] instanceof Beatable) { // jeżeli i-ty element playables implementuje Beatable
                    Beatable beatable = (Beatable) playables[i];
                    if (playables[i] instanceof CanDefend) {
                        CanDefend canDefend = (CanDefend) playables[i];
                        canDefend.defend();
                    }
                    System.out.print("movable: " + (playables[i] instanceof Movable) + " ");
                    beatable.beat();
                    int a = (int) 4.3;
                    // lub w jednej instrukcji ((Beatable) playables[i]).beat();
                }
            } else if (i % 3 == 1) {
                // anonimowe klasy wewnętrzne
                // Tworzę klasę w metodzie, w miejscu tworzenia obiektu.
                // Uwaga! Anonimowa klasa nie posiada nazwy w związku z tym, nie mogę
                // się do niej odwoływać w innych miejscach.
                // Uwaga! Anonimowa klasa wewnętrzna definiowana jest w obrębie metody!
                // (dotychczas klas definiowaliśmy poza obrębem metod i klas)
                // Zastosowanie:
                // Anonimową klasę wewnętrzną stosuję wtedy, gdy mam pewność, że
                // klasa ta nie przyda mi się w innych miejscach kodu i nie chcę
                // zaśmiecać sobie pakietu pełną definicją tej klasy (z nazwą i słowem
                // kluczowym class).
                // Uwaga po definicji klasy wewnętrznej dajemy średnik!!!
                playables[i] = new Playable() {
                    @Override
                    public void move() {
                        System.out.println("anonymous inner class - move");
                    }

                    @Override
                    public void attack() {
                        System.out.println("anonymous inner class - attack");
                    }

                    public void play() {
                        System.out.println("anonymous inner class - play");
                    }
                };

            } else {
                // lambda - jeszcze prostsza implementacja metod abstrakcyjnych

                Movable movable1 = new Movable() {
                    @Override
                    public void move() {
                        System.out.println("anonymous inner class - move");
                    }
                };

                // to samo za pomocą lambdy
                Movable movable2 = () -> System.out.println("anonymous inner class - move");

                Movable movable3 = () -> {
                    System.out.println("smth1");
                    System.out.println("smth2");
                };
            }

            System.out.print(i + ": ");
            playables[i].play(); // polimorfizm
        }
    }
}
