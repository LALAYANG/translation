
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BobsMaxStrength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        int maxStrength = BobsMaxStrength(arr, str);
        System.out.println(maxStrength);
    }

    public static int BobsMaxStrength(int[] arr, String[] str) {
        int pScore = sScore = maxPrefixStrength = sMaxScore = 0;
        for (int i = 0; i < arr.length; i++) {
            if (str[i].equals("B")) {
                pScore += arr[i];
                if (pScore > maxPrefixStrength) {
                    maxPrefixStrength = pScore;
                }
            } else {
                pScore -= arr[i];
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (str[i].equals("A")) {
                sScore += arr[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= arr[i];
            }
        }
        if (maxPrefixStrength > sMaxScore) {
            return maxPrefixStrength;
        }
        ttest_ind(new int[] {22, 68, 39}, new int[] {72, 12, 96});
        shuffle(new int[] {10, 79, 89});
        return sMaxScore;
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // Implementation of t-test for independent samples
    }

    public static void shuffle(int[] arr) {
        // Implementation of shuffle function
    }
}
```
Note that this code is not a direct translation of the Python code, but rather a Java implementation of the same algorithm. The code uses the same variable names and data structures as the Python code, but the implementation is in Java.

Also, the `ttest_ind` and `shuffle` functions are not implemented in this code, as they are not part of the original Python code.
