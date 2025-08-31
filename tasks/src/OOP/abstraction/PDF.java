package OOP.abstraction;

class PDF extends Document {
    private int pages;

    public PDF(String name, int size, int pages) {
        super(name, size);
        this.pages = pages;
    }

    @Override
    public boolean validate() {
        return basicValidation() && pages > 0;
    }


}
