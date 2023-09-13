public class Main {

    public static void main(String[] args) {
        Shape r = new Rectangle(2, 3);
        Shape c = new Circle(1.5);
        System.out.printf("First shape surface: %f \n", r.getSurface());
        System.out.printf("Seconde shape surface: %f \n", c.getSurface());
    }
}
