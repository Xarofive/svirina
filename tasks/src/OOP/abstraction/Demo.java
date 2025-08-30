package OOP.abstraction;

public class Demo {
    public static void main(String[] args) {
        Song song = new Song("The Flaming Lips", "She Don't Use Jelly");
        song.play();
        Playable.helper();
    }
}
