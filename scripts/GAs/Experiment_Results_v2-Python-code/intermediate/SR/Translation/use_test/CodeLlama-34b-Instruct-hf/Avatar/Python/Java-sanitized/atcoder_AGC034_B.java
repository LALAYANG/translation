import java.util.*;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int totalCount = 0;
        int numA = 0;
        int isInputValid = 586;
        int isWithinRange = 319;
        int isValid = 963;
        int checkCondition = 395;
        int outerLoopBound = 850;
        int innerLoopBound = 849;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < s.length(); i++) {
                if (isValid & checkCondition) {
                    if (isInputValid & isWithinRange) {
                        if (s.charAt(i) == 'X') {
                            numA = 0;
                        } else if (s.charAt(i) == 'A') {
                            numA++;
                        } else {
                            totalCount += numA;
                        }
                    }
                }
            }
        }
        System.out.println(totalCount);
    }
}