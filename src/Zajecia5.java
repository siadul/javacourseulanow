import java.util.Arrays;
import java.util.Scanner;

class User {
    private String name;
    private String surname;

    void show() {
        System.out.println("Hello " + name + " " + surname + "!");
    }

    static void createUser() {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        user.name = scanner.nextLine();
        user.surname = scanner.nextLine();
        user.show();
    }
}

public class Zajecia5 {
    public static void main(String[] args) {
        excercises2();
//        fields();
        classesExcercise1();
    }

    private static void classesExcercise1() {
//         1. Stworzyć klasę User.
//            a) Do klasy User dodać 2 pola 'name' i 'surname'
//            b) Do klasy User dodać metodę nie statyczną 'show', która
//               wyświetla tekst: "Hello {imie} {nazwisko}!"
//            c) Do klasy User dodać metodę statyczną 'createUser', która
//               wczytuje z klawiatury za pomocą klasy Scanner imię oraz nazwisko
//               i tworzy użytkownika User zapisując imię w polu name,
//               nazwisko w polu surname.
//            d) Wyświetlić użytkownika za pomocą metody 'show'
        User.createUser();

    }

    private static void excercises2() {
        // zadanie1
//        System.out.println(ex1());
        ex2(3.2, 4.5, 6.7, 23.2, -6);
//        ex4();
//        ex5(3.2, 4.5, 6.7, 23.2, -6);
//        ex5(5, 10, 20, 40, 80);
//        ex5(5, 0, 0, 0, 0);
//        ex5(0, 0, 0, 0, 0);
//        ex5(-5, -10, -20, -40, -80);
//        ex5(128, 64, 32, 16, 8);
//        ex5(1, -1, 1, -1, 1);

//        System.out.println(ex5c(1, 2, 1));
//        System.out.println(ex5c(1, 2, 8));
//        uwaga 1 -> (int) 1
//                1.0 - > (double) 1.0
//        System.out.println(ex5c(1, -1.0/2, 8));

//        System.out.println(ex5d(1, 2, 1));
//        System.out.println(ex5d(1, 2, 4));
//        System.out.println(ex5d(10, 10, 5));
//        ex6();
//        ex7();

    }

    static double ex1() {
        double x;

        // wczytywanie z klawiatury
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        double min = Double.MAX_VALUE;
        do {
            String s = scanner.nextLine();
            x = Double.parseDouble(s);
            if(x < min) {
                min = x;
            }
        } while(i++ < 4);

        return min;
    }

    static void ex2(double x0, double x1,
                    double x2, double x3,
                    double x4
                    ) {
        double[] arr = new double[5];
        arr[0] = x0;
        arr[1] = x1;
        arr[2] = x2;
        arr[3] = x3;
        arr[4] = x4;
//        Arrays.sort(arr);
        arr = sort(arr);
        for(double el: arr) {
            System.out.println(el);
        }
    }

    static double[] sort(double[] arr) {
        // sortowanie... (przez wybieranie - w miejscu)
        for(int i=0; i<arr.length; i++) {
            double max = -Double.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    static double[] sort2(double[] arr) {
        double[] result = new double[arr.length];
        // sortowanie... (przez wybieranie - kopiowanie el. do nowej tablicy)
        // uwaga! zakładamy, że elementy w tablicy się nie powtarzają (bo inaczej sortowanie w tej wersji usunie duplikaty)
        for(int i=0; i<arr.length; i++) {
            double max = -Double.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                // uwaga na elementy powtarzające się
                if(i > 0 && arr[j] >= result[i-1]) {
                    continue;
                }
                if (arr[j] >= max) {
                    max = arr[j];
                }
            }
            result[i] = max;
        }

        return result;
    }

    private static void ex4() {
        Scanner scanner = new Scanner(System.in);
        String in;
        int i = 0;
        double result = 0;
        String operation = "";
        do {
            in = scanner.nextLine();
            if(i % 2 == 0) {
                // uzytkownik wprowadzil liczbe
                double d = Double.parseDouble(in);
                switch (operation) {
                    case "+":
                        result += d;
                        break;
                    case "-":
                        result -= d;
                        break;
                    case "*":
                        result *= d;
                        break;
                    case "/":
                        result /= d;
                        break;
                    default:
                        result = d;
                }

                System.out.println(result);
            } else {
                // uzytkownik wprowadzil operację
                operation = in;
            }

            i++;
        } while(!in.equals("exit"));
    }

    static void ex5(double x0, double x1, double x2,
                    double x3, double x4) {
        if(x0 == 0) {
            System.out.println("Ciąg "
                    + String.format("%.2f, %.2f, %.2f, %.2f, %.2f", x0, x1, x2, x3, x4)
            + " nie jest geometryczny");
            return;
        }

        if(x1 == 0) {
            // 5, 0, 0 (q = 0) - jest ciągiem geometrycznym
            System.out.println("Ciąg "
                            + String.format("%.2f, %.2f, %.2f, %.2f, %.2f", x0, x1, x2, x3, x4)
                    + " jest geometryczny, q = " + 0);
        } else {
            double q1 = x1/x0;
            double q2 = x2/x1;
            double q3 = x3/x2;
            double q4 = x4/x3;
            if(q1 == q2 && q2 == q3 && q3 == q4) {
                System.out.println("Ciąg "
                        + String.format("%.2f, %.2f, %.2f, %.2f, %.2f", x0, x1, x2, x3, x4)
                        + " jest geometryczny, q = " + q1);
            } else {
                System.out.println("Ciąg "
                        + String.format("%.2f, %.2f, %.2f, %.2f, %.2f", x0, x1, x2, x3, x4)
                        + " nie jest geometryczny");
            }

        }
    }

    static double ex5c(double a0, double q, int n) {
        double result = a0;
        for(int i=0; i<n-1; i++) {
            result = result * q;
        }

        return result;
    }

    static double ex5d(double a0, double q, int n) {
        double result = a0;
        double sum = a0;
        System.out.println(result);
        for(int i=0; i<n-1; i++) {
            result = result * q;
            sum += result;
            System.out.println(result);
        }

        return sum;
    }

    static void ex6() {
        // a)
        int i = 0, j = 0;
        j = (i < j && i++ < ++j) ? ++i : i++;
        System.out.println("i = " + i + ", j = " + j); // 1, 0

        // b)
        i = 0; j = 0;
        j = (i < j || i++ < ++j) ? ++i : i++;
        System.out.println("i = " + i + ", j = " + j); // 2, 2
//        i = 2, j = 2

        // c)
        i = 0; j = 0;
        j = j++;
        System.out.println("i = " + i + ", j = " + j); // 0, 0

        // d)
        i = 0; j = 0;
        j += j++; // możemy sprowadzić do:
        j = j + j++;
        System.out.println("i = " + i + ", j = " + j); // 0, 0

        // e)
        i = 0; j = 0;
//        j += (i < j || i++ < ++j) ? ++i : i++;
        j = j + ((i < j || i++ < ++j) ? ++i : i++);

        System.out.println("i = " + i + ", j = " + j); // 2, 2

//        f)
        i = 0; j = 0;
        j = --i | -i++ + + + -++j | i--;

        System.out.println("i = " + i + ", j = " + j); // -1, -1
    }

    static void ex7() {
        String initials = A.getInitials("Jan", "Kowalski");
        System.out.println(initials);

        // aby wywołać metodę niestatyczną musimy stworzyć instancję tej klasy
        // czyli obiekt
        // obiekt tworzymy za pomocą słowa kluczowego new
        B b = new B();
        String invertedInitials = b.getInvertedInitials("Jan", "Kowalski");
        System.out.println(invertedInitials);

    }

    static void fields() {

        // Przykład
        // Mamy 2 wektory v1(1.0, 2.0) i v2(5.0, 4.0)
        // Obliczyć v3 = v1 + v2

        System.out.println("standardowo");
        double v1_x = 1.0;
        double v1_y = 2.0;
        double v2_x = 5.0;
        double v2_y = 4.0;

        System.out.println("v1 = [" + v1_x + ", " + v1_y + "]");
        System.out.println("v2 = [" + v2_x + ", " + v2_y + "]");

        double v3_x = v1_x + v2_x;
        double v3_y = v1_y + v2_y;
        System.out.println("v3 = [" + v3_x + ", " + v3_y + "]");


        System.out.println("obiektowo");
        Vector v1 = new Vector();
        v1.x = 1.0;
        v1.y = 2.0;
        System.out.print("v1 = ");
        v1.show();

        Vector v2 = new Vector();
        v2.x = 5.0;
        v2.y = 4.0;
        System.out.print("v2 = ");
        v2.show();

        Vector v3 = new Vector();
//        v1.add(v2.x, v2.y);
        v1.add(v2);
        v3 = v1;
        System.out.print("v3 = ");
        v3.show();

    }
}

// Pola
class Vector {
    double x;
    double y;

    void show() {
        System.out.println("[" + x + ", " + y + "]");
    }

    void add(int a, int b) {
        x = x + a;
        y = y + b;
    }

    void add(Vector v) {
        x = x + v.x;
        y = y + v.y;
    }
}

class A {
    static String getInitials(String name, String surname) {
        return "" + name.charAt(0) + surname.charAt(0);
    }
}

class B {
    String getInvertedInitials(String name, String surname) {
        if(true | false) {
            System.out.println("test");
        }
        return "" + name.charAt(name.length()-1)
                + surname.charAt(surname.length()-1);
    }
}

