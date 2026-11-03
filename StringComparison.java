import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();

        System.out.println("The two given strings are equal: " + s1.equals(s2));
        System.out.println("First characters are equal: " + (s1.charAt(0) == s2.charAt(0)));
    }
}
