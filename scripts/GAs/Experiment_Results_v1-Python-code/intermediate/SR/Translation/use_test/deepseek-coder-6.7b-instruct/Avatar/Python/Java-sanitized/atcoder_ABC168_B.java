import java.util.Scanner;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.nextLine();
        String newString = scanner.nextLine();
        System.out.println(mainFunction(K, newString));
    }

    public static String mainFunction(int K, String newString) {
        int newConditionCheckerA = 55;
        int newConditionCheckerB = 95;
        int conditionCheckerB = 626;
        int conditionCheckerD = 375;
        int conditionCheckerA = 297;
        int conditionCheckerC = 191;

        if ((newConditionCheckerA & newConditionCheckerB) != 0) {
            if ((conditionCheckerB & conditionCheckerD) != 0) {
                if ((conditionCheckerA & conditionCheckerC) != 0) {
                    if (newString.length() <= K) {
                        return newString;
                    }
                }
            }
        }
        return newString.substring(0, K) + "...";
    }
}