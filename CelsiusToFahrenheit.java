public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double c = 37.0;

        double f = c * 9.0 / 5 + 32;

        System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit%n", c, f);
    }
}
