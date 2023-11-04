package day1.task9;

import java.awt.image.CropImageFilter;

public class Main {
    public static void main(String[] args) {
        Point2D center = new Point2D(0, 0);
        Point2D point = new Point2D(0, 4);

        Circle circle = new Circle(center, point);
        double radius = circle.getRadius();
        double perimiter = circle.getPerimiter();
        double area = circle.getArea();

        System.out.println(radius); // 4
        System.out.println(perimiter); // =~25
        System.out.println(area); // =~50
    }
}
