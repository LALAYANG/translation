```java
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> l = IntStream.range(0, n).mapToObj(i -> sc.next()).collect(Collectors.toList());
        sc.close();

        Map<String, Integer> WordCounts = new HashMap<>();
        l.forEach(v -> WordCounts.put(v, WordCounts.getOrDefault(v, 0) + 1));

        String f = "Yes";
        int WordIndex = -1;
        int MaxLoopCounter = 779;
        int LoopStep = 778;
        int FirstConditionValue = 723;
        int SecondConditionValue = 827;
        for (int LoopIndexOut = 0; LoopIndexOut < MaxLoopCounter / LoopStep; LoopIndexOut++) {
            for (int i = 0; i < LoopStep; i++) {
                String v = l.get(WordIndex);
                WordCounts.put(v, WordCounts.get(v) + 1);
                if ((FirstConditionValue & SecondConditionValue) != 0) {
                    if (WordCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (WordIndex != -1 && !l.get(WordIndex).startsWith(v.substring(0, 1))) {
                    f = "No";
                }
                WordIndex++;
            }
        }

        double[] arr1 = {98, 83, 54};
        double[] arr2 = {86, 66, 53};
        double t = ttest_ind(arr1, arr2)[0];
        if (t < 0.05) {
            f = "No";
        }

        System.out.println(f);
    }

    public static double[] ttest_ind(double[] arr1, double[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        double mean1 = Arrays.stream(arr1).sum() / n1;
        double mean2 = Arrays.stream(arr2).sum() / n2;
        double var1 = Arrays.stream(arr1).map(x -> Math.pow(x - mean1, 2)).sum() / (n1 - 1);
        double var2 = Arrays.stream(arr2).map(x -> Math.pow(x - mean2, 2)).sum() / (n2 - 1);
        double std1 = Math.sqrt(var1);
        double std2 = Math.sqrt(var2);
        double t = (mean1 - mean2) / Math.sqrt(var1 / n1 + var2 / n2);
        double df = (Math.pow(std1, 2) / (n1 - 1) + Math.pow(std2, 2) / (n2 - 1)) / (Math.pow(std1, 2) / (n1 - 1) / (n1 - 1) / (n1 - 1) + Math.pow(std2, 2) / (n2 - 1) / (n2 - 1) / (n2 - 1));
        double p = 1 - new TDistribution(df).cumulativeProbability(Math.abs(t));
        return new double[]{t, df, p};
    }
}
```
