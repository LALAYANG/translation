```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numElements = sc.nextInt();
        int numQueries = sc.nextInt();
        int sa = sc.nextInt();
        int[][] queries = new int[numQueries][2];
        for (int i = 0; i < numQueries; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        int[] results = new int[numQueries];
        for (int i = 0; i < numQueries; i++) {
            results[i] = calculate(queries[i][0], queries[i][1], sa);
        }

        for (int i = 0; i < numQueries; i++) {
            System.out.println(results[i]);
        }
    }

    public static int calculate(int valueA, int valueB, int sa) {
        int result = valueB - valueA;
        if (result % 2 == 0 && result <= sa << 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
```

Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `calculate` method to perform the calculation. The `calculate` method takes three arguments: `valueA`, `valueB`, and `sa`. It returns 1 if the result of subtracting `valueB` from `valueA` is even and less than or equal to `sa` shifted left by 1 bit, and 0 otherwise. The `main` method reads the input, calls the `calculate` method for each query, and prints the results.
