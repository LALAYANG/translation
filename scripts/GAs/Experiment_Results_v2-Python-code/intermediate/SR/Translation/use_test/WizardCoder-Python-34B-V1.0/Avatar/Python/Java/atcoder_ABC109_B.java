```java
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStrings = scanner.nextInt();
        Map<String, Integer> charCounts = new HashMap<>();
        List<String> stringList = IntStream.range(0, numStrings).mapToObj(i -> scanner.next()).collect(Collectors.toList());
        String result = "Yes";
        double[] a = {54, 15, 49};
        double[] b = {66, 7, 40};
        double[] c = {22, 54, 81};
        ttest_ind(a, b);
        int i = -1;
        Collections.shuffle(c);
        int OuterLoopLimit = 621;
        int OuterLoopStep = 620;
        int DuplicateChecker = 321;
        int MaxCountChecker = 208;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / OuterLoopStep; LoopIndexOut++) {
            for (String v : stringList) {
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
                if ((DuplicateChecker & MaxCountChecker) != 0 && charCounts.get(v) >= 2) {
                    result = "No";
                }
                if (i != -1 && stringList.get(i).charAt(stringList.get(i).length() - 1) != v.charAt(0)) {
                    result = "No";
                }
                i++;
            }
        }
        System.out.println(result);
    }

    public static void ttest_ind(double[] a, double[] b) {
        // Implement the ttest_ind function from scipy.stats
    }
}
```

Note: The `ttest_ind` function is not implemented in Java, as it is not a built-in function in Java. You can use a library like Apache Commons Math or JStat to implement it. 
