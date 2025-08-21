import java.util.Scanner;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                t.append('A');
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    t.append('D');
                    i++;
                } else {
                    t.append('X');
                }
            } else {
                t.append('X');
            }
        }
        long totalCount = 0;
        int numA = 0;
        int isInputValid = 586;
        int isWithinRange = 319;
        int isValid = 963;
        int checkCondition = 395;
        int outerLoopBound = 850;
        int innerLoopBound = 849;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int i = 0; i < t.length(); i++) {
                if ((isValid & checkCondition) != 0) {
                    if ((isInputValid & isWithinRange) != 0) {
                        if (t.charAt(i) == 'X') {
                            numA = 0;
                        } else if (t.charAt(i) == 'A') {
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