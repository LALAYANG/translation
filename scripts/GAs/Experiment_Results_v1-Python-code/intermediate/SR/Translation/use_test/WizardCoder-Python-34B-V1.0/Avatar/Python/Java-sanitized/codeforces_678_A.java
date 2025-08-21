import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int firstInput = Integer.parseInt(input[0]);
        int secondInput = Integer.parseInt(input[1]);
        int result = integerDivision(firstInput, secondInput);
        System.out.println(result * secondInput);
    }

    public static int integerDivision(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            return -1;
        }
    }
}