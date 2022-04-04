import java.util.Scanner;

public class CircleWithException {
    private double radius;
    private double PI;

    public CircleWithException(double radius) {
        this.radius = radius;
        this.PI = Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (PI * (radius * radius));
    }

    public double getDiameter() {
        return (2 * radius);
    }

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a radius: ");
            double radius = input.nextDouble();
            CircleWithException circle = new CircleWithException(radius);
            double area = circle.getArea();
            double diameter = circle.getDiameter();
            if (radius <= 0) {
                throw new IllegalArgumentException();
            }

            if (area > 1000) {
                throw new Exception();
            }

            System.out.println("The area is: " + circle.getArea());
            System.out.println("The diameter is: " + circle.getDiameter());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Radius entered is not valid!");
        }

        catch (Exception e) {
            System.out.println("Area is greater than 1000!");
        }

    }
}
