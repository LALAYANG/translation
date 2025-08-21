import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t += "A";
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
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
            } else {
                t += "X";
                i++;
            }
        }
        long totalCount = 0;
        long numA = 0;
        int isInputValid = 586;
        int isWithinRange = 319;
        int isValid = 963;
        int checkCondition = 395;
        int outerLoopBound = 850;
        int innerLoopBound = 849;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
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
        int INF = 1000000000;
        int mod = 7 + 1000000000;
    }
}