import java.util.Scanner;

public class ReversedStrings
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string: ");

        String inputStr = scanner.nextLine();

        String reversedStr = reverseString(inputStr);

        System.out.println("Reversed string: " + reversedStr);

        scanner.close();
    }

 
    public static String reverseString(String inputStr) {
        StringBuilder reversedStr = new StringBuilder();
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reversedStr.append(inputStr.charAt(i));
        }
        return reversedStr.toString();
    }
}
