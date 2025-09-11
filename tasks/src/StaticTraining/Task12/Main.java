package StaticTraining.Task12;

public class Main {
    public static void main(String... args) {
        System.out.println("Formatted time: " + TimeUtils.Formatter.formatHours(9, 5));   // expected: 09:05
        System.out.println("Formatted time: " + TimeUtils.Formatter.formatHours(23, 45));
    }
}
