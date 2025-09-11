package StaticTraining.Task12;

public class TimeUtils {
    private TimeUtils() {
        throw new UnsupportedOperationException("Utility class");
    }
    static class Formatter {
        public static String formatHours(int h, int m) {
return String.format("%02d:%02d", h, m);
        }
    }
}
