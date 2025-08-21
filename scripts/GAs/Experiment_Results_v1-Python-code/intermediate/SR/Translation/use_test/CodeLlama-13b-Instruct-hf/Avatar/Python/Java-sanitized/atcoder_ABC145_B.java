import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstChecker = 931;
        int secondChecker = 863;
        int firstCheckerA = 310;
        int secondCheckerA = 761;
        int userInputNumber = scanner.nextInt();
        String userInputString = scanner.nextLine();
        if ((firstChecker & secondChecker) != 0) {
            if ((firstCheckerA & secondCheckerA) != 0) {
                if (userInputNumber % 2 != 0) {
                    System.out.println("No");
                } else if (userInputString.substring(0, userInputNumber / 2).equals(userInputString.substring(userInputNumber / 2))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}