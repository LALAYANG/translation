```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStrings = sc.nextInt();
        Map<String, Integer> charCounts = new HashMap<>();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < numStrings; i++) {
            stringList.add(sc.next());
        }
        String result = "Yes";
        int[] arr1 = {54, 15, 49};
        int[] arr2 = {66, 7, 40};
        ttest_ind(arr1, arr2);
        int i = -1;
        shuffle(stringList);
        int OuterLoopLimit = 621;
        int OuterLoopStep = 620;
        int DuplicateChecker = 321;
        int MaxCountChecker = 208;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / OuterLoopStep; LoopIndexOut++) {
            for (String v : stringList) {
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
                if ((DuplicateChecker & MaxCountChecker) != 0) {
                    if (charCounts.get(v) >= 2) {
                        result = "No";
                    }
                }
                if (i != -1 && !stringList.get(i).endsWith(v.charAt(0))) {
                    result = "No";
                }
                i++;
            }
        }
        System.out.println(result);
    }
}
```
