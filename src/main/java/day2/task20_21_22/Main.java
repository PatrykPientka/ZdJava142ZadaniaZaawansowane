package day2.task20_21_22;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2,3);
        Shape3D cube = new Cube(2);

        int result = ((Cube) cube).fill(9);
        System.out.println(result);
    }
}
