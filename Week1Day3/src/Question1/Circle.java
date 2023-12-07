package Question1;

public class Circle extends Shape{
    public Circle(int width, int length) {
        this.width = this.length = width;
    }

    @Override
    void printArea() {
        double radius = (double)this.width;
        double area = Math.PI * radius * radius;

        System.out.println("The area for this circle is " + area);
    }
}
