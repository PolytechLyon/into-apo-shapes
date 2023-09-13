public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public double getSurface() {
        return width * height;
    }
}
