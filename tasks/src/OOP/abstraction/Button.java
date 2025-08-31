package OOP.abstraction;

public class Button implements Clickable {
    @Override
    public void onClick() {
        System.out.println("Button clicked!");
    }
}
