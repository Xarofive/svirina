package OOP.abstraction;

public class Demo {
    public static void main(String[] args) {

        // case 1
        Song song = new Song("The Flaming Lips", "She Don't Use Jelly");
        song.play();
        Playable.helper();


        // case 2
        Shape circle = new Circle("Circle", 5);
        System.out.println(circle.getName());
        System.out.println(circle.getArea());


        // case 3
        Button button = new Button();
        button.onClick();
        button.showClickMessage();


        Image image = new Image();

        image.onClick();
        image.showClickMessage();

        Clickable.createDemoPlayable().onClick();

        // case 4
        Document pdf = new PDF("report.pdf", 1200, 5);
        Document txt = new TXT("notes.txt", 300);
        Document brokenPdf = new PDF("", -1, 0);

        System.out.println(pdf.validate());
        System.out.println(txt.validate());
        System.out.println(brokenPdf.validate());

        // case 5

        CurrencyConverter fixed = new FixedRateConverter(0.09);
        CurrencyConverter test = new TestRateConverter(2.0);

        System.out.println(fixed.convert(100, "USD", "EUR"));
    }
}
