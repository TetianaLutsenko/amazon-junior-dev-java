import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Calculate the area of rectangle: ");
        System.out.println("Enter the width: ");
        float w = keyboard.nextFloat();
        System.out.println("Enter height: ");
        float h = keyboard.nextFloat();
        System.out.println("Enter color: ");
        String color = keyboard.next();

        Rectangle rct = new Rectangle(w, h, color);
        rct.draw();
        rct.lineColor();
        System.out.println("Area: " + rct.calculateArea());
        System.out.println("Perimeter: " + rct.calculatePerimeter());

        System.out.println("Calculating Area of circle: ");
        System.out.println("Enter radius: ");
        float r = keyboard.nextFloat();

        Circle cr = new Circle(r, color);
        cr.draw();
        cr.lineColor();
        System.out.println("Area: " + cr.calculateArea());
        System.out.println("Perimeter: " + cr.calculatePerimeter());
    }
}
