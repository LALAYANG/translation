import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split("\\.");
        String[] stringParts = inputArray[0].split("");
        String[] decimalParts = inputArray[1].split("");
        int i = Integer.parseInt(decimalParts[0]);

        if (check1 && check2) {
            if (check1a && check2a) {
                if (stringParts[stringParts.length - 1].equals("9")) {
                    System.out.println("GOTO Vasilisa.");
                } else if (stringParts[stringParts.length - 1].equals("9") && i < 5) {
                    System.out.println(stringParts.join(""));
                } else {
                    stringParts = stringParts.join("");
                    stringParts = String.valueOf(Integer.parseInt(stringParts) + 1);
                    System.out.println(stringParts);
                }
            }
        }
    }

    private static boolean check1 = true;
    private static boolean check2 = true;
    private static boolean check1a = true;
    private static boolean check2a = true;
}