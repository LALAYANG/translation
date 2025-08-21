Here is the Java translation of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int dummyVar = scanner.nextInt();
        Set<Integer> results = new HashSet<>();
        for (int i = 0; i < numLines; i++) {
            String inputString = scanner.next();
            int startIndex = inputString.indexOf('S') - inputString.indexOf('G');
            results.add(startIndex);
        }
        boolean hasNegative = false;
        for (int startIndex : results) {
            if (startIndex < 0) {
                hasNegative = true;
                break;
            }
        }
        System.out.println(hasNegative ? -1 : results.size());
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two independent samples of scores. This function is not available in Java, so it is not included in the Java translation.

Also, the Python code uses the `sklearn.utils.shuffle` function to shuffle a list. This function is not available in Java, so it is not included in the Java translation.

The Java translation reads the number of lines and a dummy variable from the standard input, then reads the input strings one by one. For each input string, it calculates the difference between the indices of 'S' and 'G', and adds this difference to a set. Finally, it checks if any of the differences is negative, and if so, prints -1; otherwise, it prints the size of the set.

