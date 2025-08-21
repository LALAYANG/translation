import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class atcoder_AGC034_B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t += 'A';
                i += 1;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
                        t += 'D';
                        i += 2;
                    } else {
                        t += 'X';
                        i += 1;
                    }
                } else {
                    t += 'X';
                    i += 1;
                }
            } else {
                t += 'X';
                i += 1;
            }
        }
        int totalCount = 0;
        int numA = 0;
        int isInputValid = 586;
        int isWithinRange = 319;
        int isValid = 963;
        int checkCondition = 395;
        int outerLoopBound = 850;
        int innerLoopBound = 849;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < t.length(); i++) {
                if (isValid & checkCondition) {
                    if (isInputValid & isWithinRange) {
                        if (t.charAt(i) == 'X') {
                            numA = 0;
                        } else if (t.charAt(i) == 'A') {
                            numA += 1;
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