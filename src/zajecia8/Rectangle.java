package zajecia8;

// Mówimy, że klasa Rectangle implementuje interfejs ShapeInterface
public class Rectangle extends Shape implements ShapeInterface, AreaInterface {
    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getCircumReference() {
        return 2*(a + b);
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
