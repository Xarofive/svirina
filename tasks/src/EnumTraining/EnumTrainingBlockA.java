package EnumTraining;

public class EnumTrainingBlockA {

    // --- Task 1: Colors with fields ---
    enum Color {
        RED("#FF0000"),
        GREEN("#00FF00"),
        BLUE("#0000FF"),
        YELLOW("#FFFF00"),
        BLACK("#000000"),
        WHITE("#FFFFFF");

        private final String hex;

        Color(String hex) {
            this.hex = hex;
        }

        public String getHex() {
            // TODO: return hex value of color
            return null;
        }

        @Override
        public String toString() {
            // TODO: return string like NAME(#HEX)
            return super.toString();
        }
    }

    // --- Task 2: Parsing from string ---
    public static Color fromHex(String input) {
        // TODO:
        // 1. Validate format (#RRGGBB, case insensitive)
        // 2. Find matching Color constant
        // 3. Throw IllegalArgumentException if not found or invalid
        return null;
    }

    // --- Task 4: Switch on enum (contrastOn) ---
    public static Color contrastOn(Color color) {
        // TODO:
        // Implement switch: if color is light (YELLOW, WHITE, GREEN) → return BLACK,
        // else return WHITE.
        return null;
    }

    // --- Manual tests in main ---
    public static void main(String[] args) {
        System.out.println("=== Task 1: Colors with fields ===");
        System.out.println("RED hex: " + Color.RED.getHex());   // expected: #FF0000
        System.out.println("GREEN hex: " + Color.GREEN.getHex());// expected: #00FF00
        System.out.println("BLUE hex: " + Color.BLUE.getHex()); // expected: #0000FF

        System.out.println("\n=== Task 2: Parsing from string ===");
        System.out.println("fromHex(\"#ff0000\"): " + fromHex("#ff0000")); // expected: RED
        try {
            fromHex("#GG0000"); // invalid
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input handled correctly");
        }

        System.out.println("\n=== Task 3: Pretty toString ===");
        System.out.println(Color.BLUE); // expected: BLUE(#0000FF)

        System.out.println("\n=== Task 4: Switch on enum (contrastOn) ===");
        System.out.println("Contrast on YELLOW: " + contrastOn(Color.YELLOW)); // expected: BLACK
        System.out.println("Contrast on BLUE: " + contrastOn(Color.BLUE));     // expected: WHITE
        System.out.println("Contrast on WHITE: " + contrastOn(Color.WHITE));   // expected: BLACK
        System.out.println("Contrast on BLACK: " + contrastOn(Color.BLACK));   // expected: WHITE
    }
}
