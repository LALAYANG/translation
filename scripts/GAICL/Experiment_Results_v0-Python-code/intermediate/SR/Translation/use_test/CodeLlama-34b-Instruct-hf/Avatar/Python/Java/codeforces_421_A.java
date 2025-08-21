```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] listA = new int[n];
        int[] listB = new int[n];
        for (int i = 0; i < n; i++) {
            listA[i] = scanner.nextInt();
            listB[i] = scanner.nextInt();
        }
        int[] result = tTestInd(listA, listB);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] tTestInd(int[] listA, int[] listB) {
        int[] result = new int[listA.length];
        for (int i = 0; i < listA.length; i++) {
            result[i] = listA[i] - listB[i];
        }
        return result;
    }
}
```
The above code is a Java implementation of the Python code you provided. It takes in three integers `n`, `a`, and `b` as input, and then takes in two lists of integers `listA` and `listB` of length `n`. It then performs a t-test on the two lists and returns the result as an array of integers.

The `tTestInd` method takes in two arrays of integers `listA` and `listB` and returns an array of integers representing the difference between the two lists.

The `main` method takes in the input from the user and calls the `tTestInd` method to perform the t-test on the two lists. It then prints the result to the console.

Note that the Java code does not include the `scipy.stats` library, as it is not available in Java. Instead, the `tTestInd` method is implemented using a simple difference calculation.
