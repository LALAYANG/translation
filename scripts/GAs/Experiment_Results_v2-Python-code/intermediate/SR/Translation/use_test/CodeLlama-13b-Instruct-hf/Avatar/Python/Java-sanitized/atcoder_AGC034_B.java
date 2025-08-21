import java.util.Scanner;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t += "A";
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    t += "D";
                    i += 2;
                } else {
                    t += "X";
                    i++;
                }
            } else {
                t += "X";
                i++;
            }
        }
        int totalCount = 0;
        int numA = 0;
        boolean isInputValid = true;
        boolean isWithinRange = true;
        boolean isValid = true;
        boolean checkCondition = true;
        int outerLoopBound = 850;
        int innerLoopBound = 849;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < t.length(); i++) {
                if (isValid && checkCondition) {
                    if (isInputValid && isWithinRange) {
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
        int INF = 10 ** 25;
        int mod = 7 + 10 ** 9;
    }
}