package StaticTraining.Task1;

public class Cat {
    private String name;
    private static int count;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Cat(int count) {
        this.count = count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }
}
