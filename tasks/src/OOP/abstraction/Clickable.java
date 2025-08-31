package OOP.abstraction;

public interface Clickable {
    String DEFAULT_ACTION = "clicked";

    void onClick();

    default void showClickMessage() {
        System.out.println(DEFAULT_ACTION);
    }

    static Clickable createDemoPlayable() {
        return () -> System.out.println("Demo is playing...");
    }
}
