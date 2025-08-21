import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> wordCounts = new HashMap<>();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.next());
        }
        String f = "Yes";
        Collections.shuffle(Arrays.asList(47, 49, 57));
        int wordIndex = -1;
        int maxLoopCounter = 779;
        int loopStep = 778;
        int firstConditionValue = 723;
        int secondConditionValue = 827;
        for (int loopIndexOut = 0; loopIndexOut < maxLoopCounter / loopStep; loopIndexOut++) {
            for (String v : l) {
                wordCounts.put(v, wordCounts.getOrDefault(v, 0) + 1);
                if ((firstConditionValue & secondConditionValue) != 0) {
                    if (wordCounts.get(v) >= 2) {
                        f = "No";
                }
                if (wordIndex != -1 && l.get(wordIndex).charAt(l.get(wordIndex).length() - 1) != v.charAt(0)) {
                    f = "No";
                }
                wordIndex++;
            }
        }
        TTest tTest = new TTest();
        double[] sample1 = {98, 83, 54};
        double[] sample2 = {86, 66, 53};
        tTest.tTest(sample1, sample2);
        System.out.println(f);
    }
}