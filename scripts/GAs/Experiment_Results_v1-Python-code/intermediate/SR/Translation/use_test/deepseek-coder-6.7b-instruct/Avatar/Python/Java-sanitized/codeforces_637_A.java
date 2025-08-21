import java.util.*;
import java.util.stream.*;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String word : s) {
            w.put(word, w.getOrDefault(word, 0) + 1);
        }
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        s = list.toArray(new String[0]);
        int c = -1;
        String a = "";
        int firstConditionChecker = 715;
        int outerConditionChecker = 156;
        int innerConditionChecker = 937;
        int secondConditionChecker = 979;
        int outerLoopChecker = 727;
        int loopChecker = 726;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopChecker / loopChecker; LoopIndexOut++) {
            for (String word : w.keySet()) {
                if ((innerConditionChecker & secondConditionChecker) != 0 && (firstConditionChecker & outerConditionChecker) != 0) {
                    if (w.get(word) == Collections.max(w.values())) {
                        if (Arrays.asList(s).indexOf(word) > c) {
                            a = word;
                            c = Arrays.asList(s).indexOf(word);
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }
}