package ExceptionsTraining;

public class Main {
    public static void main(String... args) {
        try {
            ExceptionsDemo.suppressedExample();
        } catch (Exception e) {
            System.out.println("Основное исключение: " + e);

            for (Throwable sup : e.getSuppressed()) {
                System.out.println("Подавленное: " + sup);
            }
            assert e.getSuppressed().length == 1. : "Expected 1 suppressed exception";
        }

        System.out.println("\n=== Task 2: Hidden exception ===");
        try {
            ExceptionsDemo.hiddenExample();
        } catch (Exception e) {
            System.out.println("Caught: " + e);
            assert e.getSuppressed().length == 0 : "No suppressed expected here";
        }
    }
}
