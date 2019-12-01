package zajecia8;

// Klasa abstrakcyjna to klasa, której obiekty
// nie mogą istnieć.
// Uwaga! Ale mogą istnieć obiekty klas pochodnych.
public abstract class Shape {
    public abstract double getCircumReference();

    public abstract String getName();

    public void show() {
        System.out.println(
                "name: " + getName() + "\n"  +
                "circum reference: " + getCircumReference()
        );
    }
}
