import java.util.Scanner;

public class RaindropSounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert and print raindrop sounds
        String result = convertToRaindropSounds(number);
        System.out.println("Raindrop sounds: " + result);
    }

    private static String convertToRaindropSounds(int number) {
        StringBuilder result = new StringBuilder();

        // Check for factors and append corresponding sounds
        if (number % 3 == 0) {
            result.append("Pling");
        }
        if (number % 5 == 0) {
            result.append("Plang");
        }
        if (number % 7 == 0) {
            result.append("Plong");
        }

        // If no factors found, append the digits of the number
        if (result.length() == 0) {
            result.append(number);
        }

        return result.toString();
    }
}
