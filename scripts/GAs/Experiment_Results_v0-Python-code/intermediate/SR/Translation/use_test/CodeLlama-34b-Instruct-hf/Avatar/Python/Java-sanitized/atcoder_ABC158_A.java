import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Base64;
import java.util.Random;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        // Check if input contains 'A' and 'B'
        boolean containsA = userInput.contains("A");
        boolean containsB = userInput.contains("B");
        String result = containsA && containsB ? "Yes" : "No";

        // Print result
        System.out.println(result);
    }
}