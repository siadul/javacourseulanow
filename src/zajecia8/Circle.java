package zajecia8;

public class Circle extends Shape implements ShapeInterface, AreaInterface {
    protected double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getCircumReference() {
        return Math.PI * r * 2;
    }

    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * r*r;
    }
}
