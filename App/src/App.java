import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit and Kelvin");
        System.out.println("2. Fahrenheit to Celsius and Kelvin");
        System.out.println("3. Kelvin to Celsius and Fahrenheit");
        System.out.print("Enter your choice (1/2/3): ");

        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        switch (choice) {
            case 1:
                celsiusToFahrenheitAndKelvin(temperature);
                break;
            case 2:
                fahrenheitToCelsiusAndKelvin(temperature);
                break;
            case 3:
                kelvinToCelsiusAndFahrenheit(temperature);
                break;
            default:
                System.out.println("Invalid");
        }
    }

    private static void celsiusToFahrenheitAndKelvin(double celsius) {
        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("%.2f°C is equal to %.2f°F and %.2fK%n", celsius, fahrenheit, kelvin);
    }

    private static void fahrenheitToCelsiusAndKelvin(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        double kelvin = celsius + 273.15;
        System.out.printf("%.2f°F is equal to %.2f°C and %.2fK%n", fahrenheit, celsius, kelvin);
    }

    private static void kelvinToCelsiusAndFahrenheit(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.printf("%.2fK is equal to %.2f°C and %.2f°F%n", kelvin, celsius, fahrenheit);
    }
}
