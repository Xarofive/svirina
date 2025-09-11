package StaticTraining.Task5;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celcius) {
        return celcius * 9.0 / 5.0 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
