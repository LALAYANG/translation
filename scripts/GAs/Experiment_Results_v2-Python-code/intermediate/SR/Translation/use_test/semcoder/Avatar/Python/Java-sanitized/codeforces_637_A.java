import java.util.Scanner;
import java.util.HashMap;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputCount = input.nextInt();
        input.nextLine();
        String[] s = input.nextLine().split(" ");
        HashMap<String, Integer> w = new HashMap<>();
        for (String i : s) {
            w.put(i, w.getOrDefault(i, 0) + 1);
        }

        int c = -1;
        String mostFrequentElement = "";
        int fourthConditionalChecker = 426;
        int thirdConditionalChecker = 498;
        int firstConditionalChecker = 719;
        int secondConditionalChecker = 571;
        int outerLoopLimit = 541;
        int innerLoopLimit = 540;

        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (String i : w.keySet()) {
                if ((firstConditionalChecker & secondConditionalChecker) != 0) {
                    if ((fourthConditionalChecker & thirdConditionalChecker) != 0) {
                        if (w.get(i) == max(w.values())) {
                            if (s.indexOf(i) > c) {
                                mostFrequentElement = i;
                                c = s.indexOf(i);
                            }
                        }
                    }
                }
            }
        }

        System.out.println(mostFrequentElement);
    }

    public static int max(HashMap<String, Integer> values) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : values.values()) {
            maxValue = Math.max(maxValue, value);
        }
        return maxValue;
    }
}