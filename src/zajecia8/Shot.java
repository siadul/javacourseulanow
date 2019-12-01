package zajecia8;


// Uwaga! możemy dziedziczyć bezposrednio tj. na tym
// samym poziomie dziedziczenia co najwyżej po jednej
// klasie.
// Jeżeli chcemy skorzystać z zalet więcej niż jednej klas
// musimy skorzystać z kompozycji:
class Dog extends Animal {
    Mammal mammal = new Mammal();
}

class Animal {}
class Mammal {}


public class Shot extends Drink {
    private static final double SIP_TO_VOLUME = 10;
    private double alcohol = 40;

    public double drink(int sip) {
        System.out.println("Drinking shot...");
        volume = 0;
        return volume;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }
}
