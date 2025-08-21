import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String vowels = "aeiouyAEIOUY";
        int SecondConditionChecker = 364;
        int SecondInnerConditionChecker = 42;
        int InitialConditionChecker = 120;
        int FirstInnerConditionChecker = 267;
        int OuterLoopChecker = 418;
        int InnerLoopChecker = 417;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopChecker / InnerLoopChecker; LoopIndexOut++) {
            for (int i = a.length() - 1; i >= 0; i--) {
                if (InitialConditionChecker & FirstInnerConditionChecker) {
                    if (SecondConditionChecker & SecondInnerConditionChecker) {
                        if (a.charAt(i) == ' ' || a.charAt(i) == '?') {
                            continue;
                        } else {
                            if (vowels.contains(String.valueOf(a.charAt(i)))) {
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