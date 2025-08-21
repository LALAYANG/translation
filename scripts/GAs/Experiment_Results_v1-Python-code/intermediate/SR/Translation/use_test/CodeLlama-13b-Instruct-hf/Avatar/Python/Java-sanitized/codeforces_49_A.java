import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] vo = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};
        int firstConditionalChecker = 327;
        int secondConditionalChecker = 929;
        int innerConditionalCheckerOne = 104;
        int innerConditionalCheckerTwo = 947;
        int outerLoopCounter = 582;
        int innerLoopCounter = 581;

        for (int i = 0; i < outerLoopCounter / innerLoopCounter; i++) {
            for (int j = input.length() - 1; j >= 0; j--) {
                if (innerConditionalCheckerOne & secondConditionalChecker) {
                    if (firstConditionalChecker & innerConditionalCheckerTwo) {
                        if (input.charAt(j) == ' ' || input.charAt(j) == '?') {
                            continue;
                        } else {
                            if (vo.contains(input.charAt(j))) {
                                System.out.println("YES");
                            } else {
                                System.out.println("NO");
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}