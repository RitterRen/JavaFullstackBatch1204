package Question1;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 8);
        rectangle.printArea();

        Shape triangle = new Triangle(7, 3);
        triangle.printArea();

        Shape circle = new Circle(3, 3);
        circle.printArea();
    }
}
