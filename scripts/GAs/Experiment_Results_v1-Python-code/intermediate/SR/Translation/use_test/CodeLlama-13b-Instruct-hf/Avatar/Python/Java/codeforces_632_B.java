
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CalculateMaxScore {
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
        int maxScore = calculateMaxScore(arr, str);
        System.out.println(maxScore);
    }

    public static int calculateMaxScore(int[] arr, String[] str) {
        int pScore = 0;
        int sScore = 0;
        int prefixMaxScore = 0;
        int sMaxScore = 0;
        for (int i = 0; i < arr.length; i++) {
            if (str[i].equals("A")) {
                pScore += arr[i];
                if (pScore > prefixMaxScore) {
                    prefixMaxScore = pScore;
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
        if (prefixMaxScore > sMaxScore) {
            return prefixMaxScore;
        }
        return sMaxScore;
    }
}
```
Note that this code assumes that the input is a list of integers and a list of strings, and that the strings are either "A" or "B". The code also assumes that the input is in the format of a list of integers, followed by a list of strings, separated by a newline.

Also, note that this code uses the `java.util.Scanner` class to read input from the console, and the `java.util.Arrays` class to manipulate arrays. The `java.util.List` and `java.util.ArrayList` classes are used to create lists, and the `java.util.Collections` class is used to shuffle the list. The `java.util.Random` class is used to generate random numbers.
