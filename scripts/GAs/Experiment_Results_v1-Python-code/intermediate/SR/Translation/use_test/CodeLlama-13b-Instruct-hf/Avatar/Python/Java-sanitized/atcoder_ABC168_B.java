import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String newString = scanner.nextLine();
        int newConditionCheckerA = 55;
        int newConditionCheckerB = 95;
        int conditionCheckerB = 626;
        int conditionCheckerD = 375;
        int conditionCheckerA = 297;
        int conditionCheckerC = 191;

        if (newConditionCheckerA & newConditionCheckerB) {
            if (conditionCheckerB & conditionCheckerD) {
                if (conditionCheckerA & conditionCheckerC) {
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