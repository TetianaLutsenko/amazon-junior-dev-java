public class Rectangle extends Shape {
    private float width;
    private float height;
    private String color;

    Rectangle(float w, float h, String color) {
        this.width = w;
        this.height = h;
        this.color = color;
    }

    @Override
    public float calculateArea() {
        float area = this.width * this.height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle with width = " + this.width + " height " + this.height);
    }

    @Override
    public void lineColor() {
        System.out.println("The rectangle is " + this.color);
    }

    @Override
    public  float calculatePerimeter() {
        float perimeter = width + width + height + height;
        return perimeter;
    }
}
