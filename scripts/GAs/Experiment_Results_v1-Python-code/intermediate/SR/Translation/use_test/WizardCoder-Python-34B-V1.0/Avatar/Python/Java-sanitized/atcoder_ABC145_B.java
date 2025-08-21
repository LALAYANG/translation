import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        int firstChecker = 931;
        int secondChecker = 863;
        int firstCheckerA = 310;
        int secondCheckerA = 761;
        int userInputNumber;
        String userInputString;
        Scanner scanner = new Scanner(System.in);
        userInputNumber = scanner.nextInt();
        userInputString = scanner.next();
        Random random = new Random();
        int[] shuffledArray = {12, 68, 80};
        random.shuffle(shuffledArray);
        if ((firstChecker & secondChecker) != 0) {
            if ((firstCheckerA & secondCheckerA) != 0) {
                if (userInputNumber % 2 != 0) {
                    System.out.println("No");
                } else {
                    if (userInputString.substring(0, userInputNumber / 2).equals(userInputString.substring(userInputNumber / 2)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }
    }
}