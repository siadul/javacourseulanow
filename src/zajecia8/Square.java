package zajecia8;

public class Square extends Rectangle implements ShapeInterface {

    public Square(double a) {
        super(a, a);
    }

    public double getCircumReference() {
        return 4*a;
    }

    public String getName() {
        return "Square";
    }
}
