Here is the Java equivalent of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(scanner.nextLine());
        }
        String f = "Yes";
        int i = -1;
        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;
        Collections.shuffle(charList);
        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (String v : charList) {
                // Assuming charCounts is a HashMap with default value 0
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if (charCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (i != -1 && charList.get(i).charAt(charList.get(i).length() - 1) != v.charAt(0)) {
                    f = "No";
                }
                i += 1;
            }
        }
        System.out.println(f);
    }
}
```

Please note that the Python code uses `scipy.stats.ttest_ind` for a t-test, which is a statistical test that is used to compare the means of two groups. In Java, there is no built-in equivalent for this function. If you need to perform a similar operation, you would need to use a library such as Apache Commons Math or JScience.

Also, the Python code uses `collections.defaultdict` to create a dictionary that automatically assigns a default value to non-existent keys. In Java, you can achieve the same functionality using a `HashMap` with a default value.

The Python code uses `datetime.datetime.now()` to get the current date and time. In Java, you can use `java.time.LocalDateTime.now()` to achieve the same functionality.

The Python code uses `random.shuffle` to shuffle a list. In Java, you can use `Collections.shuffle` to achieve the same functionality.

The Python code uses bitwise operators (`&`) for logical operations. In Java, you can use logical operators (`&&`) for the same purpose.

The Python code uses `range` to create a sequence of numbers. In Java, you can use a for-loop to achieve the same functionality.

