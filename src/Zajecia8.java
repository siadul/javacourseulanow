import zajecia8.*;

public class Zajecia8 {

    public static void main(String[] args) {
//        inheritance1();
//        ex1InheritanceAndProtected();
//        polymorphism();
        ex2AbstractAndInterface();
    }

    private static void ex2AbstractAndInterface() {
        //          Shape
        // /        /  \    \
        // Rectangle Circle Triangle
        //     |
        // Square

        // Stworzyć klasę bazową Shape oraz
        // Klasy pochodne Circle, Rectangle, Triangle
        // dziedziczące po klasie Shape.
        // a) dodać pola do klas pozwalające liczyć
        //    obwód każdej z figur
        // b) dodać gettery i settery dla każdego z pól
        // c) dodać kolejną klasą Square dziedziczącą
        // po klasie Rectangle.
        // d) dodać konstruktor do klasy Square przyjmujący
        //    parametr side: double i odpowiednio ustawiający pola
        Square s1 = new Square(4);
        System.out.println(
                s1.getCircumReference()
        );
        System.out.println("\n\nShapes in loop...");
        final int size = 10;

        Shape[] shapes = new Shape[size];
        for(int i=0; i<shapes.length; i++) {
            if(i % 5 == 1) {
                shapes[i] = new Rectangle(i, size - i);
            } else if(i % 5 == 2) {
                shapes[i] = new Square(i);
            } else if(i % 5 == 3) {
                shapes[i] = new zajecia8.Triangle(i, i , i);
            } else {
                shapes[i] = new Circle(i);
            }
//            System.out.println(shapes[i].getName());
//            System.out.println("i: " + i + ", obwód: "
//                    + shapes[i].getCircumReference());

            shapes[i].show();

        }

        ShapeInterface[] shapes2 = new ShapeInterface[size];
        for(int i=0; i<shapes2.length; i++) {
            if(i % 5 == 1) {
                shapes2[i] = new Rectangle(i, size - i);
            } else if(i % 5 == 2) {
                shapes2[i] = new Square(i);
            } else if(i % 5 == 3) {
                shapes2[i] = new zajecia8.Triangle(i, i , i);
            } else {
                shapes2[i] = new Circle(i);
            }
            System.out.println(shapes[i].getName());
            System.out.println("i: " + i + ", obwód: "
                    + shapes[i].getCircumReference());

//            shapes2[i].show();

        }

        // co chcemy osiągnąć?
        // Obliczyć pola wszystkich figur, które
        // potrafią zwrócić wartość pola na podstawie
        // swoich pól
        AreaInterface[] shapesWithArea = new AreaInterface[10];
        for(int i=0; i<10; i++) {
            if(i < 5) {
                shapesWithArea[i] = new Circle(1);
            } else if (i<8) {
                shapesWithArea[i] = new Rectangle(1, 2);
            } else if (i<9){
                shapesWithArea[i] = new Square(1);
            } else {
                shapesWithArea[i] = new Garden();
            }
            System.out.println(
                    shapesWithArea[i].getArea()
            );
        }

    }

    private static void polymorphism() {
        Drink drinks[] = new Drink[10];
        for (int i=0; i<10; i++) {
            if (i % 3 == 0) {
                drinks[i] = new Shot();  // UWAGA! mamy różne typy
                // tzn. drinks przechowuje elementy typu Drink
                // a my umieszczamy w tej tablicy elementy Shot.
                // Jest to możliwe dzięki temu, że Shot dziedziczy
                // po klasie Drink (oraz dzięki kowariancji tablic w Java)
            } else if (i % 3 == 1) {
                drinks[i] = new FizzyDrink();
            } else {
                drinks[i] = new Drink();
            }
            drinks[i].drink(1); // powiązanie - late-binding
            System.out.println(drinks[i].getVolume());
            // dzięki polimorfizmowi mamy gwarancję, że
            // zostanie wywołana odpowiednia wersja metody drink
            // (w zależności od typu obiektu przechowywanego w tablicy drinks)
        }

        // Dlaczego mamy dwa razy wypisany Drinking drink...
        // dla każdych 3 iteracji?
        // Ponieważ metoda drink z klasy FizzyDrink posiada
        // wywołanie super.drink(sip), które sprawia, że
        // zostają wykonane instrukcje z metody drink klasy
        // bazowej.

        // polimorfizm bez tablic i bez pętli
        Drink drink = new Shot();
        drink.drink(1);
        drink = new FizzyDrink();
        drink.drink(1);
        drink = new Drink();
        drink.drink(1);

        System.out.println("\n\nTasting drinks...");
        tasteDrink(new Shot());
        tasteDrink(new FizzyDrink());
        tasteDrink(new Drink());
        tasteDrink(new Whisky());
        tasteDrink(new Whisky());
    }

    public static void tasteDrink(Drink drink) {
        drink.drink(1); // wywołanie polimorficzne!
        System.out.println("volume: " + drink.getVolume());
        System.out.println("color: " + drink.getColor());
        System.out.println("foam: " + drink.getFoam());
    }

    private static void ex1InheritanceAndProtected() {
        // W pakiecie zajecia8.ex1 stwórz 2 dowolne klasy, pierwsza klasa
        // powinna posiadać przykładowe pola i metody, a druga powinna
        // odziedziczyć je.
        // Stworzyć instancje klasy 1 i 2.
        Drink drink = new Drink();
        double volume = drink.drink(1);
        volume = drink.drink(3);
        System.out.println(volume);
        FizzyDrink fizzyDrink = new FizzyDrink();
        int bubbles = fizzyDrink.getBubbles();
        System.out.println(bubbles);
        fizzyDrink.waitTime(1);
        System.out.println(
                "bubbles = " + fizzyDrink.getBubbles());
        System.out.println(
                "vol. = " + fizzyDrink.drink(3)
        );
        System.out.println(
                "bubbles = " + fizzyDrink.getBubbles()
        );
        System.out.println(fizzyDrink.getFoam());

//        System.out.println(fizzyDrink.volume); // package
//        System.out.println(fizzyDrink.foam); // protected
        // jeżeli chce wypisać wartości tych pól
        // muszę dodać gettery

    }

    private static void inheritance1() {
        // dziedziczenie - składnia

        // class A extends B {}
        Motorcycle m = new Motorcycle(100);
        double distance = m.ride(1);
        System.out.println(distance);
        double speed = m.getSpeed(3);
        System.out.println(speed);

        SportMotorcycle sm1 = new SportMotorcycle();
        speed = sm1.getSpeed(3);
        System.out.println(speed);
    }
}