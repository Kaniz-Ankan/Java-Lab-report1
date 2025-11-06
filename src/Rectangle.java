public class Rectangle {

     double length;
     double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    public void displayDetails() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println();
    }
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(7.5, 4.2);

        rect1.displayDetails();
        rect2.displayDetails();
    }
}