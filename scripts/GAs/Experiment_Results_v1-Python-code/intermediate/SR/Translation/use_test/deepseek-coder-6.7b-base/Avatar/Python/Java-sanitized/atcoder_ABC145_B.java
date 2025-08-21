import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInputNumber = scanner.nextInt();
        String userInputString = scanner.next();
        if (userInputNumber % 2 != 0) {
            System.out.println("No");
        } else {
            String firstHalf = userInputString.substring(0, userInputNumber / 2);
            String secondHalf = userInputString.substring(userInputNumber / 2);
            if (firstHalf.equals(secondHalf)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}