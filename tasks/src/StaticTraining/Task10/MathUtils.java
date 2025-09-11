package StaticTraining.Task10;

public class MathUtils {
    public static final double PI = 3.14159;
    private MathUtils() {
        throw new UnsupportedOperationException ("Utility class");
    }
    public static double circleArea(double r) {
        return PI * r * r;
}
}
