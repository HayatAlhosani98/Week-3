
import java.util.Scanner;

public class NumberToRoman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Validate the number range
        if (number < 1 || number > 3999) {
            System.out.println("Number out of range (1-3999).");
            return;
        }

        // Convert and print the Roman numeral
        String romanNumeral = convertToRoman(number);
        System.out.println("Roman numeral: " + romanNumeral);
    }

    private static String convertToRoman(int number) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (number > 0) {
            if (number - values[i] >= 0) {
                result.append(symbols[i]);
                number -= values[i];
            } else {
                i++;
            }
        }

        return result.toString();
    }
}
