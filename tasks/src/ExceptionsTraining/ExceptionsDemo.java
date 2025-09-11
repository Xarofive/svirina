package ExceptionsTraining;

public class ExceptionsDemo {

    //Подавленные исключения
    //
    //Условие:
    //Напиши метод, который:
    //
    //Создаёт ресурс через try-with-resources (например, класс MyResource с AutoCloseable).
    //
    //Внутри блока try бросает одно исключение (например, IOException).
    //
    //В close() ресурса выбрасывает другое исключение (например, IllegalStateException).
    //
    //Вызови метод и выведи:
    //
    //основное исключение,
    //
    //список подавленных исключений через getSuppressed().

    // --- Task 1: Suppressed exception (try-with-resources) ---
    static class MyResource {
        //here ur code
    }

    public static void suppressedExample() throws Exception {
        //here ur code
    }

    //Сокрытые (потерянные) исключения
    //
    //Условие:
    //Напиши метод, который:
    //
    //Использует обычный try-finally (без try-with-resources).
    //
    //В try бросает одно исключение (например, IOException).
    //
    //В finally бросает другое (например, RuntimeException).
    //
    //Запусти метод и посмотри, какое исключение будет напечатано в стеке.

    // --- Task 2: Hidden exception (try-finally) ---
    public static void hiddenExample() throws Exception {
        //here ur code
    }

    // --- Tests in main ---
    public static void main(String[] args) {
        System.out.println("=== Task 1: Suppressed exception ===");
        try {
            suppressedExample();
        } catch (Exception e) {
            System.out.println("Caught: " + e);
            for (Throwable sup : e.getSuppressed()) {
                System.out.println("  Suppressed: " + sup);
            }
            // Проверка
            assert e.getSuppressed().length == 1 : "Expected exactly 1 suppressed exception";
        }

        System.out.println("\n=== Task 2: Hidden exception ===");
        try {
            hiddenExample();
        } catch (Exception e) {
            System.out.println("Caught: " + e);
            // Проверка: suppressed нет
            assert e.getSuppressed().length == 0 : "No suppressed expected here";
        }
    }
}
