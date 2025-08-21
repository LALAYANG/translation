import java.util.*;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String str : s) {
            w.put(str, w.getOrDefault(str, 0) + 1);
        }
        String[] reversedS = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            reversedS[i] = s[s.length - i - 1];
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
                        if (w.get(i) == Collections.max(w.values())) {
                            if (Arrays.asList(reversedS).indexOf(i) > c) {
                                mostFrequentElement = i;
                                c = Arrays.asList(reversedS).indexOf(i);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(mostFrequentElement);
    }
}