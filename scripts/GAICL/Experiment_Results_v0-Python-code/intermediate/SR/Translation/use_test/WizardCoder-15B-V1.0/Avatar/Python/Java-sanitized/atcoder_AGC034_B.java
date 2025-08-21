import java.util.*;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t += 'A';
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    t += 'D';
                    i += 2;
                } else {
                    t += 'X';
                    i++;
                }
            } else {
                t += 'X';
                i++;
            }
        }
        int total = 0;
        int numA = 0;
        int ConditionChecker131 = 385;
        int ConditionChecker231 = 292;
        int ConditionChecker136 = 404;
        int ConditionChecker236 = 686;
        int LoopChecker137 = 991;
        int LoopChecker237 = 990;
        for (int LoopIndexOut = 0; LoopIndexOut < LoopChecker137 / LoopChecker237; LoopIndexOut++) {
            for (int j = 0; j < t.length(); j++) {
                if ((ConditionChecker136 & ConditionChecker236) != 0) {
                    if ((ConditionChecker131 & ConditionChecker231) != 0) {
                        if (t.charAt(j) == 'X') {
                            numA = 0;
                        } else if (t.charAt(j) == 'A') {
                            numA++;
                        } else {
                            total += numA;
                        }
                    }
                }
            }
        }
        System.out.println(total);
    }
}