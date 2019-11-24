import myfirstpackage.Hamster;
import java.util.Random;

public class Zajecia6 {
    static final String name = "Zajecia6";
    static final String name2;
    static {
        name2 = Dog.generateRandomString();
    }

    public static void main(String... args) {
//        constructors();
//        excercise1();
//        staticFields();
//        excercise2();

//         final - stałe argumenty, pola itp.
//        finals(10);

        // przeciążanie metod
//        overloading();

        // zmienna liczba argumentów - metody takie mogą przyjmować dowolną liczbę argumentów
//        System.out.println(
//                varArgs(4, 4, 9, 2, 3)
//        );
//        System.out.println(
//                varArgs(4, 2, 3)
//        );
//        System.out.println(
//                varArgs()
//        );
//
//        System.out.println(
//                varArgs(4)
//        );

        // kontrola dostępu I - private vs public
        // private - ograniczamy możliwość użycia metody
        //           lub pola oznaczonych jako prywatnych do klasy
        //           w której się one zawierają
//        privateVsPublic();

        // kontrola dostępu II - i pakiety i dostęp typu package
        Hamster hamster = new Hamster();
        A a = new A();
        System.out.println(hamster.age);
        System.out.println(hamster.getName());
        System.out.println(hamster.getSex());



        // TODO... dziedziczenie i dostęp protected

    }

    private static void privateVsPublic() {
        PrivateVsPublic pvp = new PrivateVsPublic();
        pvp.publicField = 45;
        pvp.publicMethod();
//        pvp.privateField = 45; // nie zadziała
//        pvp.privateMethod(); // nie zadziała
        pvp.setPrivateField(666);
        System.out.println(pvp.getPrivateField());
    }

    /**
     * Zwraca sumę wartości typu int podanych jako argument
     * @param args
     */
    private static int varArgs(int... args) {
        System.out.println("varArgs(int... args)");
        int sum = 0;
        for (int arg: args) {
            sum += arg;
        }

        return sum;
    }

    private static int varArgs(int args) { // Uwaga! int args, int... args2 - powoduje nie jednoznaczność
        System.out.println("varArgs(int args)");
        return args;
    }

    private static void overloading() {
        WithOverloadedMethods w1 =
                new WithOverloadedMethods();
        WithOverloadedMethods w2 =
                new WithOverloadedMethods(4, 8);
        w1.overloadedMethod();
        w1.overloadedMethod(5);
        w2.overloadedMethod();
        w2.overloadedMethod(8);


    }

    private static void finals(final int a) {
        // final - modyfikator, który sprawia, że nie możemy modyfikować
        //         wartości
        final int x = 4;
//        x++; // błąd etapu kompilacji
//        x = 10; // błąd etapu kompilacji
        System.out.println(x);
//        a = 2; // również argument oznaczony jako final nie może być
                 // modyfikowany
        System.out.println(a);

//        Zajecia6.name = "Test"; // pól oznaczonych jako final również nie możemy
                           // modyfikować
        System.out.println(name);
        System.out.println(name2);
    }

    private static void excercise2() {
        int x = 4;
        x++;
        // Stworzyć 2 klasy
        // a) pierwsza z polem statycznym oraz
        //    blokiem statycznej inicjalizacji
        // b) druga z blokiem inicjalizującym egzemplarz
        // c) nie korzystając z konstruktorów proszę wypisywać
        //    nazwę klasy podczas tworzenia obiektów
        // d) pole statyczne powinno być ustawiane na losowy ciąg znaków
        //    alfabetu o dlugości 5 przy pierwszym odwołaniu się
        //    do klasy w której to pole się zawiera
        // e) stworzyć obiekty obu klas i wypisać wartość pola statycznego
        new Cat();
        new Cat();
        new Dog();
        new Dog();
        new Dog();
        System.out.println(Dog.name);
    }

    private static void staticFields() {
        // Przykład
        // Stworzyć klasę, która posiada statyczne pole
        // przechowujące informację odnośnie ilości utworzonych
        // egzemplarzy tej klasy.
        // Podczas tworzenia obiektu powinna być wypisywana liczba
        // obiektów tej klasy.

        System.out.println(Ant.counter);
        Ant a1 = new Ant();
        System.out.println(Ant.counter);
        Ant a2 = new Ant();
        Ant a3 = new Ant();

        System.out.println(Banana.counter);
        Banana b1 = new Banana();
        Banana b2 = new Banana();
        Banana b3 = new Banana();

        System.out.println(Apple.counter);
        Apple ap1 = new Apple();
        Apple ap2 = new Apple();
        Apple ap3 = new Apple();


    }

    private static void excercise1() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(2, 0, 0);
        Point p3 = new Point(0, 2, 0);
        Triangle triangle = new Triangle(p1, p2, p3);
        triangle.show();
        System.out.println(Triangle.circumreference(p1, p2, p3));
    }

    static void constructors() {
        Point p1 = new Point(1, 0, 0);
        p1.show();

        Point p2 = new Point(0, 0, 0);
        p2.show();

        // wniosek:
        // Pola są inicjalizowane wartościami domyślnymi odpowiednimi
        // dla swoich typów (false, 0, null, itp.)!
        // Inaczej niż w przypadku zmiennych definiowanych w metodzie
//        int x;
//        System.out.println(x); // uwaga! to się nie skompiluje

        Point p3 = new Point(0, 0, 1);

        // Przykład
        // Obliczyć obwód trójkąta tworzonego przez p1, p2, p3
        double circumreference = Point.circumreference(p1, p2, p3);
        System.out.println(circumreference);

        // p3
        // p2p1

    }
}

class Point {
    double x;
    double y;
    double z;
    boolean b1;
    int i1;
    char c1;
    String s1;
    Point p1;

    Point(double x, double y, double z) {
        this.x = x; // ponieważ mam konflikt nazw argumentów i pól
        this.y = y; // musimy skorzystać ze słowa kluczowego this
        this.z = z;
    }

    void show() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
        System.out.print("(b1: " + b1 + ", i1: " + i1 + ", c1: " + c1);
        System.out.println(", s1: " + s1 + ", p1: " + p1 + ")");
    }

    static double circumreference(Point p1, Point p2, Point p3) {
        double a = distance(p1, p2); // bok1
        double b = distance(p2, p3); // bok2
        double c = distance(p1, p3); // bok3

        return a + b + c;
    }

    static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) +
                (p1.y - p2.y)*(p1.y - p2.y) +
                (p1.z - p2.z)*(p1.z - p2.z)
                );
    }
}

// Zadanie 1
// Stworzyć klasę Triangle, która posiada:
//  - 3 pola typu Point - współrzędne wierzchołków trójkąta,
//  - 3 pola typu double - długości boków trójkąta.
// a) dodać do niej konstruktor, który przyjmuje 3 argumenty
//    typu Point i ustawia pola typu Point,
//    a następnie liczy długości boków i na ich podstawie
//    ustawia pola typu double
// b) dodać do niej metodę, która wypisuje współrzędne punktów oraz
//    długości boków i obwód
// c) dodać do niej metodę (niestatyczną), która liczy obwód na podstawie
//    pól tej klasy
// d) dodać do niej metodę statyczną, która liczy obwód na podstawie
//    3 argumentów typu Point
// e) stworzyć obiekt klasy Triangle reprezentujący trójkąt
//    o współrzędnych (0, 0, 0), (2, 0, 0), (0, 2, 0)
// f) wywołac metody z pktów b), c) i d)

class Triangle {
    Point p1;
    Point p2;
    Point p3;
    double a;
    double b;
    double c;

    Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        a = Point.distance(p1, p2);
        b = Point.distance(p2, p3);
        c = Point.distance(p1, p3);
    }

    void show() {
        p1.show();
        p2.show();
        p3.show();
        System.out.println("dł. boków: " + a + ", " + b + ", " + c);
        System.out.println("obwód: " + circumreference());
    }

    double circumreference() {
        return a + b + c;
    }

    static double circumreference(Point a, Point b, Point c) {
        return Point.distance(a, b) +
                Point.distance(b, c) +
                Point.distance(a, c);
    }
}

class Ant {
    static int counter;
    Ant() {
        System.out.println("Liczba obiektów klasy Ant: " + ++counter);
    }
}

class Banana {
    static int counter;
    // blok inicjalizacji statycznej
    static {
        // instrukcje będą wykonywane podczas pierwszego
        // odwołania się do klasy Banana np. podczas konstrukcji lub
        // gdy odwołamy się do pola statycznego tej klasy
        System.out.println("Liczba obiektów klasy Banana: " + ++counter);
    }
}

class Apple {
    static int counter;
//    Ant ant = new Ant();
    Ant ant;

    // blok inicjalizujący/inicjalizacja egzemplarza
    {
        // instrukcje będą wykonywane podczas pierwszego
        // odwołania się do klasy Banana np. podczas konstrukcji lub
        // gdy odwołamy się do pola statycznego tej klasy
        System.out.println("Liczba obiektów klasy Apple: " + ++counter);
        ant = new Ant();
    }
}

class Dog {
    static String name; // pole statyczne
    static { // blok inicjalizacji statycznej
        name = generateRandomString();
        System.out.println(name);
    }
    {
        System.out.println("Created new Dog");
    }
    static String generateRandomString() {
        Random r = new Random();
//        char c = 'z'; // a => 97, z => 122
        String result = "";
        for(int i=0; i<5; i++) {
            char randomChar = (char) (97 + r.nextInt(26)); // 122 - 97 = 25
            result += randomChar;
        }

        return result;
    }
}

class Cat {
    {
        System.out.println("Created new Cat");
    }
}

class WithOverloadedMethods {
    WithOverloadedMethods() {
        System.out.println("I'm in WithOverloadedMethods() constructor");
    }
    WithOverloadedMethods(int x, int y) {
        System.out.println("I'm in WithOverloadedMethods(int x, int y) constructor");
        System.out.println("x: " + x + ", y: " + y);
    }
    int overloadedMethod(int i) {
        System.out.println("I'm in overloadedMethod(int i)");
        return i;
    }
    void overloadedMethod() {
        System.out.println("I'm in overloadedMethod()");
    }
}

class PrivateVsPublic {
    private int privateField;
    public int publicField;


    private void privateMethod(int a) {
        System.out.println("I'm in privateMethod()," +
                " privateField: " + privateField +
                " publicField: " + publicField);
    }
    public void publicMethod() {
        System.out.println("I'm in publicMethod()," +
                " privateField: " + privateField +
                " publicField: " + publicField);
        privateMethod(3);
    }

    // getter - metoda publiczna, która zwraca wartość pola tej klasy
    public int getPrivateField() {
        return privateField;
    }

    // setter - metoda publiczna, która ustawia wartość pola tej klasy
    public void setPrivateField(int privateField) {
        this.privateField = privateField;
    }

//    public void setPrivateField(int privateField) {
//        this.privateField = privateField;
//    }
}