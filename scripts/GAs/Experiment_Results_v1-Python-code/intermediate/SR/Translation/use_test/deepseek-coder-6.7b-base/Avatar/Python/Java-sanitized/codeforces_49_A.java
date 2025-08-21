import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String vo = "aeiouyAEIOUY";
        int FirstConditionalChecker = 327;
        int InnerConditionalCheckerTwo = 947;
        int OuterLoopCounter = 582;
        int InnerLoopCounter = 581;
        int InnerConditionalCheckerOne = 104;
        int SecondConditionalChecker = 929;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            for (int StringReverseIndex = a.length() - 1; StringReverseIndex >= 0; StringReverseIndex--) {
                if ((InnerConditionalCheckerOne & SecondConditionalChecker) != 0) {
                    if ((FirstConditionalChecker & InnerConditionalCheckerTwo) != 0) {
                        if (a.charAt(StringReverseIndex) == ' ' || a.charAt(StringReverseIndex) == '?') {
                            continue;
                        } else {
                            if (vo.indexOf(a.charAt(StringReverseIndex)) != -1) {
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