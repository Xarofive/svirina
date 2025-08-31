package OOP.abstraction;

class TXT extends Document {
    public TXT(String name, int size) {
        super(name, size);
    }

    @Override
    public boolean validate() {
        return basicValidation() && getSize() > 0;
    }
}
