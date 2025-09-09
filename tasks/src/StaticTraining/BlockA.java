package StaticTraining;

public class BlockA {
    // --- Task 1: Object counter (static field) ---
// Сделать класс Cat, у которого есть поле name.
// Добавить static поле count, которое считает количество созданных кошек.
// В main создать несколько объектов и вывести общее количество кошек.

    //раскомментировать для тестов
//    public static void main(String[] args) {
//        System.out.println("=== Task 1: Object counter ===");
//        new Cat("Barsik");
//        new Cat("Murzik");
//        new Cat("Tom");
//        System.out.println("Total cats: " + Cat.count); // expected: 3
//    }


    // --- Task 2: Shared school (static field) ---
// Сделать класс Student с полем name.
// Добавить static поле schoolName = "Kata Academy".
// В main создать студентов и вывести: "Имя: <...>, Школа: Kata Academy".

//    public static void main(String[] args) {
//        System.out.println("\n=== Task 2: Shared school ===");
//        Student s1 = new Student("Ivan");
//        Student s2 = new Student("Olga");
//        System.out.println(s1.name + " studies at " + Student.schoolName); // expected: Ivan, Kata Academy
//        System.out.println(s2.name + " studies at " + Student.schoolName); // expected: Olga, Kata Academy
//    }


    // --- Task 3: Constant PI (static final) ---
// Сделать класс MathConstants.
// Добавить static final double PI = 3.14159.
// Написать метод, который считает длину окружности 2 * PI * r.

//    public static void main(String[] args) {
//        System.out.println("\n=== Task 3: Constant PI ===");
//        double length = MathConstants.circleLength(5);
//        System.out.println("Circle length with r=5: " + length); // expected: ~31.4159
//    }
}
