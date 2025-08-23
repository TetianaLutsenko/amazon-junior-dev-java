public class Circle extends Shape{
    private float radius;
    private String color;

    Circle(float r, String color) {
        this.radius = r;
        this.color = color;
    }

    @Override
    public float calculateArea() {
        return (float)Math.PI * this.radius * this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius = " + this.radius);
    }

    @Override
    public void lineColor() {
        System.out.println("The circle is " + this.color);
    }

    @Override
    public float calculatePerimeter() {
        return 2 * (float)Math.PI * this.radius;
    }
}
