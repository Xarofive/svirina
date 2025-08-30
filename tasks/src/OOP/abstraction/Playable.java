package OOP.abstraction;

public interface Playable {
    String DEFAULT_VOLUME = "Medium";
    void play();
    default void stop() {

        System.out.println("Song stopped");
    }

    static void helper() {
        System.out.println("helper");
    }
}
