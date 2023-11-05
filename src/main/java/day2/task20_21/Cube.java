package day2.task20_21;

public class Cube extends Shape3D{
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * a;
    }

    @Override
    public double calculateVolume() {
        double b = 3;
        return Math.pow(a, b);
    }
}
