
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ResistorDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input resistor colors
        System.out.print("Enter resistor colors (separated by hyphens, e.g., brown-green): ");
        String input = scanner.nextLine().toLowerCase();

        // Decode and print the resistance value
        int resistanceValue = decodeResistance(input);
        System.out.println("Resistance value: " + resistanceValue);
    }

    private static int decodeResistance(String input) {
        // Define color-to-value mapping
        Map<String, Integer> colorToValue = new HashMap<>();
        colorToValue.put("black", 0);
        colorToValue.put("brown", 1);
        colorToValue.put("red", 2);
        colorToValue.put("orange", 3);
        colorToValue.put("yellow", 4);
        colorToValue.put("green", 5);
        colorToValue.put("blue", 6);
        colorToValue.put("violet", 7);
        colorToValue.put("grey", 8);
        colorToValue.put("white", 9);

        // Split input into color bands
        String[] bands = input.split("-");

        // Decode the first two bands and return the two-digit number
        int firstBandValue = colorToValue.get(bands[0]);
        int secondBandValue = colorToValue.get(bands[1]);

        return (firstBandValue * 10) + secondBandValue;
    }
}