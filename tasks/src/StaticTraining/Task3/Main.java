package StaticTraining.Task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Task 3: Constant PI ===");
        double length = MathConstants.circleLength(5);
        System.out.println("Circle length with r=5: " + length); // expected: ~31.4159
    }
}
