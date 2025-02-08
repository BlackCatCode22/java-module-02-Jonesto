import java.util.Scanner;

public class MaddnessWithMethods {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        int num1 = getAnIntFromTheUser(scanner, "Enter the first integer: ");
        int num2 = getAnIntFromTheUser(scanner, "Enter the second integer: ");

        String comparisonResult = compareTwoInts(num1, num2);
        System.out.println("Comparison result: " + comparisonResult);

        int sumResult = sumTwoInts(num1, num2);
        System.out.println("Sum result: " + sumResult);

        scanner.close();
    }

    public static int getAnIntFromTheUser(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static String compareTwoInts(int num1, int num2) {
        if (num1 > num2) {
            return num1 + " is greater than " + num2;
        } else if (num1 < num2) {
            return num1 + " is less than " + num2;
        } else {
            return num1 + " is equal to " + num2;
        }
    }


    public static int sumTwoInts(int num1, int num2) {
        return num1 + num2;
    }
}
