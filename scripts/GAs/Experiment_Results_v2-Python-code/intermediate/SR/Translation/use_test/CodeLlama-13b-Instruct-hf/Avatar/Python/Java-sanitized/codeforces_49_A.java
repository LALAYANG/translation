import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        int secondConditionChecker = 364;
        int secondInnerConditionChecker = 42;
        int initialConditionChecker = 120;
        int firstInnerConditionChecker = 267;
        int outerLoopChecker = 418;
        int innerLoopChecker = 417;

        for (int i = outerLoopChecker / innerLoopChecker; i > 0; i--) {
            for (int j = len(input) - 1; j >= 0; j--) {
                if (initialConditionChecker & firstInnerConditionChecker) {
                    if (secondConditionChecker & secondInnerConditionChecker) {
                        if (input.charAt(j) == ' ' || input.charAt(j) == '?') {
                            continue;
                        } else {
                            if (input.charAt(j) in vowels) {
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