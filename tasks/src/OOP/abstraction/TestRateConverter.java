package OOP.abstraction;

public class TestRateConverter implements CurrencyConverter {
    private double rate;
    public TestRateConverter(double rate) {
        this.rate = rate;
    }
    @Override
    public double convert(double amount, String from, String to) {
        return rate * 2;
    }
}
