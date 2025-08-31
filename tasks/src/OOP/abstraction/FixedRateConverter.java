package OOP.abstraction;

public class FixedRateConverter implements CurrencyConverter {
    private double rate;

    public FixedRateConverter(double rate) {
        this.rate = rate;
    }

    @Override
    public double convert(double amount, String from, String to) {
        if (CurrencyConverter.isSupported(from) && CurrencyConverter.isSupported(to)) {
            return amount * rate;
        }
        throw new IllegalArgumentException("Unsupported currency: " + from + " or " + to);
    }
}