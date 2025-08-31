package OOP.abstraction;

public interface CurrencyConverter {
    double convert(double amount, String from, String to);

    String[] SUPPORTED_CURRENCIES = {"USD", "EUR", "GBP"};

    static boolean isSupported(String code) {
        for (
                String c : SUPPORTED_CURRENCIES) {
            if (c.equals(code)) {
                return true;
            }
        }
        return false;
    }
}
