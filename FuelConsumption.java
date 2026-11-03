public class FuelConsumption {
    public static void main(String[] args) {
        double tank = 40;
        double normalUse = 8;            // litres per 100 km
        double roughUse = normalUse * 1.15;

        double normalDist = tank / normalUse * 100;
        double roughDist = tank / roughUse * 100;

        System.out.printf("Normal road: %.2f km%n", normalDist);
        System.out.printf("Rough road: %.2f km%n", roughDist);
    }
}
