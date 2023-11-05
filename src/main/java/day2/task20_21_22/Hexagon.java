package day2.task20_21_22;

public class Hexagon extends Shape {
    private double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * a;
    }
}
