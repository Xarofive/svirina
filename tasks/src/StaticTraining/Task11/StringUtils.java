package StaticTraining.Task11;

public class StringUtils {
    private StringUtils() {
        throw new UnsupportedOperationException("Utility class");
    }
    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static String toUpperCase(String text) {
        return text.toUpperCase();
    }
}
