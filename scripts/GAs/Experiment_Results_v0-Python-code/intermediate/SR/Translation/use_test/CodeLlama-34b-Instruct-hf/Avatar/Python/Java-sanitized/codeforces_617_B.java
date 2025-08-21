import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] numbers = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = Integer.parseInt(input.substring(i, i + 1));
        }

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        System.out.println(result);
    }
}