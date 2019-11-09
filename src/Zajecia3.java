public class Zajecia3 {
    public static void main(String[] args) {
//        excercises(args);
        operators(args);
    }

    public static void operators(String[] args) {
        // operatory matematyczne
        // +,-,*,/,%

        // jednoargumentowe minus i plus
        int x = -10;
        int y = +10;
        System.out.println(x);
        System.out.println(y);
        System.out.println(20 * -10);

        // kolejność operatorów
        System.out.println(2 + 2 * 2); // 6

        // operator relacji
        System.out.println(4 < 20);
        System.out.println(4 > 20);
        System.out.println(4 >= 20);
        System.out.println(4 <= 20);
        System.out.println(4 == 20);
        System.out.println(4 != 20);

        // Uwaga! Stringi porównujemy korzystając z .equals
        char xx = 'a';
        String a = "" + xx + xx + xx;
        System.out.println(a);
        String b = "a" + "a" + 'a';
        System.out.println(b);
        System.out.println(a == b); // źle (porównywanie referencji)
        System.out.println(a.equals(b)); // poprawnie

        // przypisanie - =
        // +=, -=, *=, /= itd.
        x = 0;
        x += 5; // x = x + 5
        x -= 5; // x = x - 5
        x *= 5; // x = x * 5
        x /= 5; // x = x / 5

        x += 1; // x = x + 1
        x++; // x = x + 1 - postinkrementacja, zwrócenie, zwiekszenie o 1
        int i = 0;
        System.out.println(i++); // 0
        System.out.println(i); // 1
        int j = 0;
        System.out.println(++j); // 1, preinkrementacja, zwiekszenie o 1, zwrócenie
        System.out.println(j); // 1

        // dekrementacje
        i = 0;
        System.out.println(i--); // 0 // postdekrementacja, zwrócenie wartości i, zmniejszenie
        System.out.println(i); // -1
        j = 0;
        System.out.println(--j); // -1 , predekrementacja, zmniejszenie o 1, zwrócenie nowej wartości j
        System.out.println(j); // -1

        // operatory logiczne - &&, ||, !
        System.out.println(2 < 3 && 2 > 1); // true
        System.out.println(2 < 3 && 2 > 2); // false
        i = 0;
        System.out.println(2 > 3 && ++i > 2 && 4 > 5); // false
        System.out.println(i); // 0, ponieważ 2 > 3 nie jest prawdą,
        // cała reszta warunku jest pomijana (włącznie z inkrementacją!)

        System.out.println(2 > 3 || 2 < 3); // true
        i = 0;
        System.out.println(2 > 3 || 2 < 3 && ++i > 0); // true
        i = 0;
        System.out.println(2 > 3 || 2 < 3 && ++i > 1); // false
        // UWAGA!  najpierw koniunkcja! jeżeli mamy wątpliwości - używamy nawiasów

        System.out.println(!(2 > 3)); // true
        System.out.println(!!!!!!!!!(2 > 3)); // true

        // operatory bitowe
        // |, &, ~

        // a|b 1 0
        //   0 1 0
        //   1 1 1

        // a&b 1 0
        //   0 0 0
        //   1 1 0

        // a  1 0
        // ~a 0 1

        System.out.println(1 | 2); // 1 | 10

        // 01
        // 10
        // 11 = 3

        System.out.println(8 | 13);
        System.out.println(8 & 13);

        // Przykład obliczanie adresu ip za pomocą maski podsieci
//        ip = "192.168.1.10";
//        maska = "255.255.224.0";
//        Zadanie: obliczyć adres ip sieci
        // Rozwiązanie: ip & maska
        System.out.println("ip w tej sieci to: " +
                (192 & 255) + '.' + (168 & 255) + '.' + (1 & 224) + '.' + (10 & 0)
        );


        byte b0 = 8;
        System.out.println(~8); // not
        // 00001000
        // 11110111 = 247 - 256 = -9
        System.out.println(8 ^ 13); // xor - albo to albo tamto - tylko jedno musi być prawdą żeby była prawda
        // 1 ^ 1 = 0
        // 0 ^ 0 = 0
        // 0 ^ 1 = 1
        // 1 ^ 0 = 1

        // operatory przesunięć bitowych - dzielenie/mnożenie liczb przez 2 w wydajny sposób
        System.out.println(1 << 1); // 00000001 -> 00000010
        System.out.println(1 << 2); // 00000001 -> 00000100
        System.out.println(127 >> 1); // 01111111 -> 00111111
        System.out.println(127 >> 6); // 01111111 -> 00000001

        // operatory bitowe oraz przesunięć bitowych możecie łączyć z operatorem
        // przypisania
        x = 1;
        x <<= 2;
        System.out.println(x);

        // todo
        // operator 3 argumentowy - "uproszczony if-else"
        // skladnia:
        // wyrazenie1 ? wyrazenie jezeli wyrazenie1 = true : wyrazenie jesli wyrazenie1 jest false
        System.out.println(10 > 9 ? "10 jest wieksze od 9" : "9 jest wieksze od 10");
        System.out.println(9 > 9 ? "9 jest wieksze od 9" : "9 nie jest wieksze od 9");
        // zalety w porównaniu z if:
        // - zwięzlość
        // - możemy przekazywać do metod
        // wady:
        // - nieczytelność

        // Przykład
        // Sprawdzić jaka relacja zachodzi pomiędzy 2 liczbami (<,>,=).
        int a1 = 7;
        int b1 = 7;
        System.out.println(a1 > b1 ?
                "a1 > b1" :
                (a1 < b1 ? "a1 < b1" : "a1 = b1")
        );

        // pętle
        // for  - znamy
        // while

//      while(warunek) {
        // instrukcje powtarzane dopóki warunek jest spełniony
//      }

        int n = 3;
        System.out.println("while");
        while (n > 0) {
            System.out.println(n); // 3 2 1
            n--;
        }


        System.out.println("to samo za pomocą pętli for");
        for (n = 3; n > 0; n--) {
            System.out.println(n);
        }

        // Zadanie
        // Wypisać liczby od 100 do 20, co 20 -> 100, 80, 60, 40, 20
        // za pomocą pętli while
        int f = 100;
        while (f >= 20) {
            System.out.println(f);
            f -= 20; // f = f - 20
        }

        // do-while - najpierw wykonujemy instrukcje, potem sprawdzamy warunek
//        do {
//            // instrukcje wykonywane co najmniej 1 raz,
        // powtarzane, dopóki warunek jest spełniony
//        } while(warunek);

        // Przykład: wypisać liczby od 100 do 20 z krokiem 20
        n = 100;
        do {
            System.out.println(n);
            n -= 20;
        } while (n >= 20);

        // foreach - typ służący do operacji na elementach kolekcji np. tablic
        // składnia:
        // for(zmienna : kolekcja) {
        //      instrukcje potwarzane dopóki wyczerpią się elementy w kolekcji
        // }

        System.out.println("pętla foreach");
        int[] arr = {1, 9, 32, 17};
        for(int element: arr) {
            System.out.println(element);
        }

        // Zadanie
        // Wypisać elementy tablicy arr od końca (17, 32, 9, 1)
        // za pomocą pętli for, while lub do-while.
//        arr[0];
//        arr[1];
//        arr[2];
//        arr[i]; - dostęp do i-tego elementu tablicy

        System.out.println("arr = {1, 9, 32, 17}");
        for(i=3; i>=0; i--) {
            System.out.println(arr[i]);
        }



















    }

    public static void excercises(String[] args) {
        System.out.println("Zajecia3");
        // zad1
        // 1011 = 1 * 2^0 + 1 * 2^1 + 0 * 2^2 + 1 * 2^3 = 1 + 2 + 0 + 8 = 11
        // zad2
        // 13 = 8 + 4 + 1 = 2^3 + 2^2 + 2^0 = 1101
        // zad3
        // 32 = 2 * 8^0 + 3 * 8^1 = 2 + 24  = 26
        // zad4
        // 1000 = 1 * 16^3 = 4096
        // zad5
        System.out.println("****");
        System.out.println("*  *");
        System.out.println("*  *");
        System.out.println("****");
        // zad6
        System.out.println("zad. 6");
        int n = 5;
        for(int i=0; i<n; i = i + 1) {
            System.out.print("*");
        }

        // i = 0;
        // i<n? -> 0<5?
        // System.out.print("*");
        // i = i + 1

        // i<n? -> 1<5
        // System.out.print("*");
        // i = i + 1 // i = 2

        // 2<5
        // System.out.print("*");
        // i = 3

        // 3<5
        // System.out.print("*");
        // i = 4

        // 4<5
        // System.out.print("*");
        // i = 5

        // 5<5
        // KONIEC

        // jeszcze boki...
        System.out.println();

        for(int j=0; j<n-2; j=j+1) {
            System.out.print("*");
            for(int i=0; i<n-2; i=i+1) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        // n=5
        // j=0, j<n-2? -> 0<3?, PRAWDA - wchodzę w blok kodu pętli
        // System.out.print("*");
            // wewnętrzna pętla for
            // i=0, i<n-2? -> 0<3, PRAWDA - wchodzę w blok kodu pętli
            // System.out.print(" ");
            // i = 1

            // i<n-2? -> 1<3, PRAWDA
            // System.out.print(" ");
            // i = 2

            // 2<3, PRAWDA
            // System.out.print(" ");
            // i = 3

            // 3<3?, FAŁSZ - wychodzę z pętli
        // System.out.println("*");
        // j = j+1 -> j=1

        // na ten moment mamy
        // *****
        // *   *
        // j=1, j<n-2? -> 1<3, PRAWDA
            // System.out.print("*");
            // wewnętrzna pętla for, która wypisuje n-2 spacje "   "
            // System.out.println("*");
        // j=j+1 -> j=2

        // na ten moment mamy
        // *****
        // *   *
        // *   *

        // j=2, 2<3, PRAWDA
            // System.out.print("*");
            // wewnętrzna pętla for, która wypisuje n-2 spacje "   "
            // System.out.println("*");
        // j=j+1 -> j=3

        // na ten moment mamy
        // *****
        // *   *
        // *   *
        // *   *

        // j=3, 3<3, FAŁSZ - kończę działanie pętli

        // rysowanie podstawy
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("*");
        }

        // mamy
        // *****
        // *   *
        // *   *
        // *   *
        // *****

        // zad. 8 - trójkąt równoboczny o boku n
        System.out.println();
        System.out.println("zad. 8");
        // *
        // **
        // ***

        n = 4;
        // wypisywanie znaku '*' n razy
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();

        n = 3;
        // wypisywanie znaku '*' n razy
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();

        n = 2;
        // wypisywanie znaku '*' n razy
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();

        n = 1;
        // wypisywanie znaku '*' n razy
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // lepiej skorzystać z pętli...
        n = 5;
        System.out.println("lepiej skorzystać z pętli...");
        for(int j=0; j<n; j=j+1) {
            for(int i=0; i<=j; i=i+1) {
                System.out.print("*");
            }
            System.out.println();
        }

        // j=0, 0<5
            // i=0; i<=j? -> 0<=0
            // *
            // i = i+1 -> i = 1
            // i<=j? -> 1<=0, FAŁSZ
        // wypisujemy znak końca linii
        // j=j+1 -> j = 1
            // i=0; i<=j? -> 0<=1, PRAWDA
            // *
            // i=1; i<=j? -> 1<=1, PRAWDA
            // *
            // i=2; i<=j? -> 2<=1, FAŁSZ
        // wypisujemy znak końca linii

        // na ten moment:
        // *
        // **
        // j=j+1 -> j=2
            // i=0; i<=j? -> 0<=2, PRAWDA
            // *
            // i=1; i<=j? -> 1<=2, PRAWDA
            // *
            // i=2; i<=j? -> 2<=2, PRAWDA
            // *
            // i=3; i<=j? -> 3<=2, FAŁSZ
        // wypisujemy znak końca linii

        // itd.
        // do momentu kiedy i = n -> i = 5
        // j=4
            // *****
        // znak końca linii

        // j=5
        // j<n? -> 5<5? FAŁSZ, wychodze z pętli zewnętrznej

        // zad. 9 - sprawdzanie czy liczba jest podzielna przez 2
        // liczba n podzielna jest przez k, jeżeli reszta z dzielenia wynosi 0
        n = 4;
        if(n % 2 == 0) { // operator modulo
            System.out.println("n jest podzielne przez 2");
        }

        // n = 5, n % 2, 1
        // n % 2, jakie moge mieć reszty z dzielenia? 0, 1
        // n % 5, jakie moge mieć reszty z dzielenia? 0, 1, 2, 3, 4
        // n % k, jakie moge mieć reszty z dzielenia? 0, 1, 2, ..., k-1

        // a jak sprawdzić czy n jest podzielne przez n, nie używając %?
        n = 5;
        System.out.println(n/2); // 2
        // n jest typu int (całkowitego)
        // dziele liczbe całkowitą przez inną liczbę otrzymuję liczbę całkowitą
        // reszta jest ucinana (UWAGA! NIE MA ZAOKRĄGLANIA w tym przypadku)

        int k = n/2; // k = 2
        int l = k*2; // k = 4
        int m = n-l; // m - reszta
        System.out.println("n - n/2 * 2");
        System.out.println(m);
        if (m != 0) {
            System.out.println("n nie jest podzielna przez 2");
        } else {
            System.out.println("n jest podzielna przez 2");
        }

        // znaleźć najmniejszą liczbę z 3
        double a = 3.4;
        double b = 2.3;
        double c = 9.5;
        // I sposób
        if(a < b) {
            if(a < c) {
                System.out.println(a);
            } else { // c <= a < b
                System.out.println(c);
            }
        } else { // b <= a   | c
            if(b < c) { // b < c <= a
                System.out.println(b);
            } else { // c <= b <= a
                System.out.println(c);
            }
        }

        // II sposób
        if(a <= b && a <= c) {
            System.out.println(a);
        }
        if(b <= a && b <= c) {
            System.out.println(b);
        }
        if(c <= a && c <= b) {
            System.out.println(c);
        }

        // zad. 10
        // obliczyć sumę 1, 2, 3, ..., 10
        System.out.println("zad. 10");
        int sum = 0;
        for(int i=0; i<=10; i=i+1) {
            sum = sum + i;
            System.out.println(sum);
        }

        // 1 + 2 + 3 + ... + 9 + 10 =
        // 1 + 10 +
        // 2 + 9 +
        // 3 + 8 +
        // 4 + 7 +
        // 5 + 6 =
        // 11 * 5 = 55
        // korzystam ze wzoru na sumę wyrazów ciągu arytmetycznego
        // Sn = (a1+an)/2 * n
        int a1 = 1; // wyraz początkowy
        int an = 10; // wyraz końcowy
        n = 10; // liczba wyrazów
        System.out.println((a1+an) * n / 2);

        // Zad. 12
        // Napisz program, który liczy za pomocą pętli sumę ciągu arytmetycznego ​
        // n - wyrazów o wyrazie początkowym ​ a, ​
        // z krokiem ​ k ​ (a, a+k, a+k+k, a+3k, ..., a+(n-1)k).
        a1 = 1;
        n = 10;
        k = 1;
        // 45 nie!, 55
        sum = 0;

        // jak wyglądają elementy ciągu w naszym przypadku
        // 1, 2, 3, 4, ..., 10

        for(int i=0; i<n+1; i=i+1) {
            sum = sum + i;
            System.out.println(sum);
        }

        // niech k = 2
        // z krokiem ​ k ​ (a, a+k, a+k+k, a+3k, ..., a+(n-1)k).
        a1 = 5;
        n = 20;
        k = 3;
        // 1, 3, 5 = 9
        sum = 0;
        for(int i=0; i<n; i=i+1) {
            an = a1 + i*k;
            sum = sum + an;
            System.out.println("an: " + an);
            System.out.println("sum: " + sum);
        }

        // sum = 1 + 0 = 1
        // sum = sum + 2 = 1 + 2 = 3
        // sum = sum + 4 = 1 + 2 + 4 = 7
        // sum = sum + 6 = 1 + 2 + 4 + 6 = 13
        // ... 31

        System.out.println((1 + 19) * 10 / 2); // sprawdzenie za pomocą wzoru
        // na sumę ciągu arytmetycznego
        System.out.println((5 + 62) * 20 / 2); // sprawdzenie za pomocą wzoru

        // zad. domowe
        // obliczyć sumę ciągu geometrycznego wykorzystując pętle...

























    }
}
