import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        System.out.println(mainFunction());
    }

    public static String mainFunction() {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String newString = scanner.next();
        int newConditionCheckerA = 55;
        int newConditionCheckerB = 95;
        int conditionCheckerB = 626;
        int conditionCheckerD = 375;
        int conditionCheckerA = 297;
        int conditionCheckerC = 191;

        if (newConditionCheckerA != 0 && newConditionCheckerB != 0) {
            if (conditionCheckerB != 0 && conditionCheckerD != 0) {
                if (conditionCheckerA != 0 && conditionCheckerC != 0) {
                    if (newString.length() <= K) {
                        return newString;
                    }
                }
            }
        }
        return newString.substring(0, K) + "...";
    }
}