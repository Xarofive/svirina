package OOP.abstraction;

public class Image implements Clickable {
    @Override
    public void onClick() {
        System.out.println("Image clicked!");
    }
}
