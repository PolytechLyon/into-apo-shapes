import java.util.Comparator;

public abstract class Shape implements Comparable<Shape> {

    public abstract double getSurface();

    public int compareTo(Shape other) {
        double diff = this.getSurface() - other.getSurface();
        return diff < 0 ? -1 : diff > 0 ? 1 : 0;
    }
}
