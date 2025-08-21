import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        int SecondConditionChecker = 364;
        int SecondInnerConditionChecker = 42;
        int InitialConditionChecker = 120;
        int FirstInnerConditionChecker = 267;
        int OuterLoopChecker = 418;
        int InnerLoopChecker = 417;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopChecker / InnerLoopChecker; LoopIndexOut++) {
            for (int i = a.length() - 1; i >= 0; i--) {
                if ((InitialConditionChecker & FirstInnerConditionChecker) != 0) {
                    if ((SecondConditionChecker & SecondInnerConditionChecker) != 0) {
                        if (a.charAt(i) == ' ' || a.charAt(i) == '?') {
                            continue;
                        } else {
                            for (char vowel : vowels) {
                                if (a.charAt(i) == vowel) {
                                    System.out.println("YES");
                                    return;
                                }
                            }
                            System.out.println("NO");
                            break;
                        }
                    }
                }
            }
        }
    }
}