package StaticTraining;

public class BlockD {

    // --- Task 10: MathUtils (utility class with constant + method) ---
    // Сделать утилитарный класс MathUtils.
    // Добавить константу PI = 3.14159.
    // Добавить статический метод circleArea(double r), который возвращает площадь круга.
    // Запретить создание объекта (private конструктор).
    // В main проверить работу метода.

//    public static void main(String[] args) {
//        System.out.println("=== Task 10: MathUtils ===");
//        double area = MathUtils.circleArea(5);
//        System.out.println("Circle area with r=5: " + area); // expected: ~78.53975
//    }

// --- Task 11: StringUtils (utility class with text helpers) ---
// Сделать утилитарный класс StringUtils.
// Добавить статический метод reverse(String text), который переворачивает строку.
// Добавить статический метод toUpperCase(String text), который переводит строку в верхний регистр.
// Запретить создание объекта (private конструктор).
// В main проверить работу методов.


//    public static void main(String[] args) {
//        System.out.println("\n=== Task 11: StringUtils ===");
//        System.out.println("Reverse 'java': " + reverse("java"));     // expected: avaj
//        System.out.println("Upper 'java': " + toUpperCase("java"));   // expected: JAVA
//    }

// --- Task 12: TimeUtils (utility class with nested static Formatter) ---
// Сделать утилитарный класс TimeUtils.
// Внутри сделать static класс Formatter.
// В Formatter реализовать метод formatHours(int h, int m), который возвращает строку "HH:MM".
// Запретить создание объекта TimeUtils.
// В main проверить работу метода.

//    public static void main(String[] args) {
//        System.out.println("\n=== Task 12: TimeUtils ===");
//        System.out.println("Formatted time: " + TimeUtils.Formatter.formatHours(9, 5));   // expected: 09:05
//        System.out.println("Formatted time: " + TimeUtils.Formatter.formatHours(23, 45)); // expected: 23:45
//    }
}
