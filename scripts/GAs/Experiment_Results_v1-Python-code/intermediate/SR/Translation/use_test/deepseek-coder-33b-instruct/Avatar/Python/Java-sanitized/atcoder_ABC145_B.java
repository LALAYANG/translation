import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        int firstChecker = 931;
        int secondChecker = 863;
        int firstCheckerA = 310;
        int secondCheckerA = 761;

        Scanner scanner = new Scanner(System.in);
        int userInputNumber = scanner.nextInt();
        String userInputString = scanner.next();

        List<Integer> list = Arrays.asList(12, 68, 80);
        Collections.shuffle(list);

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