package Question1;

public class Rectangle extends Shape{

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    @Override
    void printArea() {
        System.out.println("The area for this rectangle is " + width * length);
    }
}
