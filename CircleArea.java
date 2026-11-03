public class CircleArea {
    public static void main(String[] args) {
        int[] radius = {2, 5, 10, 25};
        double pi = 3.14;

        for (int i = 0; i < radius.length; i++) {
            double area = pi * Math.pow(radius[i], 2);
            System.out.printf("radius = %d, area = %.2f%n", radius[i], area);
        }
    }
}
