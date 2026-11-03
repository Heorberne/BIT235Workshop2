public class SunAndEarth {
    public static void main(String[] args) {
        double pi = 3.14;

        double earthD = 7600;
        double sunD = 865000;

        double earthR = earthD / 2;
        double sunR = sunD / 2;

        double earthV = (4.0 / 3) * pi * Math.pow(earthR, 3);
        double sunV = (4.0 / 3) * pi * Math.pow(sunR, 3);

        System.out.printf("Volume of the Earth: %.2f cubic miles%n", earthV);
        System.out.printf("Volume of the Sun: %.2f cubic miles%n", sunV);
        System.out.printf("Ratio of the Sun to the Earth: %.2f%n", sunV / earthV);
    }
}
