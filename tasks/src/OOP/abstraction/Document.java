package OOP.abstraction;

public abstract class Document {
    private String name;
    private int size;

    public Document(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    protected boolean basicValidation() {
        return name != null && !name.isEmpty() && size >= 0;
    }

    public abstract boolean validate();

}
