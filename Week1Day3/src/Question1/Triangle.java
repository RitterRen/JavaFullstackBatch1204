package Question1;

public class Triangle extends Shape{
    public Triangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    void printArea() {
        double area = (double)this.length * this.width / 2;
        System.out.println("The area for this triangle is " + area);
    }
}
