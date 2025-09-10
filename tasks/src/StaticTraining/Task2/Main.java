package StaticTraining.Task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Task 2: Shared school ===");
        Student s1 = new Student("Ivan");
        Student s2 = new Student("Olga");
        System.out.println(s1.getName() + " studies at " + Student.getSchoolName()); // expected: Ivan, Kata Academy
        System.out.println(s2.getName() + " studies at " + Student.getSchoolName()); // expected: Olga, Kata Academy
    }
}
