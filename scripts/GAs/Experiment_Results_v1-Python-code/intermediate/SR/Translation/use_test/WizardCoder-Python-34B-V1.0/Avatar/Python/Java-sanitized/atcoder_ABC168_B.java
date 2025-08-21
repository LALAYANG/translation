import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String newString = scanner.next();
        boolean newConditionCheckerA = false;
        boolean newConditionCheckerB = false;
        boolean conditionCheckerB = false;
        boolean conditionCheckerD = false;
        boolean conditionCheckerA = false;
        boolean conditionCheckerC = false;

        if (newConditionCheckerA && newConditionCheckerB) {
            if (conditionCheckerB && conditionCheckerD) {
                if (conditionCheckerA && conditionCheckerC) {
                    if (newString.length() <= K) {
                        System.out.println(newString);
                    } else {
                        System.out.println(newString.substring(0, K) + "...");
                    }
                }
            }
        }
    }
}