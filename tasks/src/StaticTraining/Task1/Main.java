package StaticTraining.Task1;

public class Main {
    public static void main (String... args) {
        System.out.println("=== Task 1: Object counter ===");
        new Cat("Barsik");
        new Cat("Murzik");
        new Cat("Tom");
        System.out.println("Total cats " + Cat.getCount());
    }
}
