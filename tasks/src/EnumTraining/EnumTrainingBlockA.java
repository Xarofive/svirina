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
            return hex;
        }

        @Override
        public String toString() {
            return name() + "(" + hex + ")";
        }
    }

    // --- Task 2: Parsing from string ---
    public static Color fromHex(String input) {
        if (input == null || !input.matches("^#[0-9A-Fa-f]{6}$")) {
            throw new illegalArgumentException("Invalid hex format: " + input); 
        }
        for (Color c : Color.values()) {
            if (c.hex.equalsIgnoreCase(input)) {
                return c;
            }
        }
        return null;
    }

    // --- Task 4: Switch on enum (contrastOn) ---
    public static Color contrastOn(Color color) {
        switch(color) {
            case YELLOW, WHITE, GREEN:
            return BLACK;
            default:
                return WHITE;
        }
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
