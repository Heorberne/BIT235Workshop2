public class CompoundInterest {
    public static void main(String[] args) {
        double p = 5000.00;
        double r = 0.04;
        int n = 10;

        double a = p * Math.pow(1 + r, n);

        System.out.printf("Amount after %d years: $%.2f%n", n, a);
    }
}
