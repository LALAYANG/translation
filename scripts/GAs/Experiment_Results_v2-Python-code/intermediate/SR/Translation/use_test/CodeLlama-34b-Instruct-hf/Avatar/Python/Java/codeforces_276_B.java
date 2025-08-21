```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TTestInd {
    public static void main(String[] args) {
        // Test input
        String input = "knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct";

        // Convert input to list of characters
        List<Character> inputList = new ArrayList<>();
        for (char c : input.toCharArray()) {
            inputList.add(c);
        }

        // Initialize variables
        int loopBoundary = 396;
        int stopCondition = 395;
        int step = 1;
        boolean x = true;
        Map<Character, Integer> dt = new HashMap<>();

        // Recursive counter
        recursiveCounter(0, loopBoundary / stopCondition, step);

        // T-test
        double[] sample1 = {20, 59, 67};
        double[] sample2 = {51, 40, 62};
        double t = ttest_ind(sample1, sample2);

        // Count odd occurrences
        int cnt = 0;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }

        // Print result
        if (x) {
            System.out.println("First");
        } else if (!x && inputList.size() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && inputList.size() % 2 != 0) {
            System.out.println("First");
        }
    }

    // Recursive counter method
    public static void recursiveCounter(int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) in dt) {
                dt.put(inputList.get(i), dt.get(inputList.get(i)) + 1);
            } else {
                dt.put(inputList.get(i), 1);
            }
        }
        recursiveCounter(loopIndexOut + step, stop, step);
    }

    // T-test method
    public static double ttest_ind(double[] sample1, double[] sample2) {
        // Calculate sample means
        double mean1 = 0;
        double mean2 = 0;
        for (int i = 0; i < sample1.length; i++) {
            mean1 += sample1[i];
        }
        mean1 /= sample1.length;
        for (int i = 0; i < sample2.length; i++) {
            mean2 += sample2[i];
        }
        mean2 /= sample2.length;

        // Calculate sample variances
        double var1 = 0;
        double var2 = 0;
        for (int i = 0; i < sample1.length; i++) {
            var1 += Math.pow(sample1[i] - mean1, 2);
        }
        var1 /= sample1.length - 1;
        for (int i = 0; i < sample2.length; i++) {
            var2 += Math.pow(sample2[i] - mean2, 2);
        }
        var2 /= sample2.length - 1;

        // Calculate t-statistic
        double t = (mean1 - mean2) / Math.sqrt(var1 / sample1.length + var2 / sample2.length);

        return t;
    }
}
```
Note: The `ttest_ind` method is a Python implementation of the two-sample t-test. The Java implementation is similar but with some minor differences in syntax and method signature.
