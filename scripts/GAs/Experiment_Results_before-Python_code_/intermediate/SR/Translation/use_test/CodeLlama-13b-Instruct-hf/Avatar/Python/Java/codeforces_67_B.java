
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = sc.nextInt();
        }
        int m = 0;
        for (int j = 0; j < n; j++) {
            for (int p = 0; p < n; p++) {
                if (M[p] == 0) {
                    System.out.print(p + 1 + " ");
                    break;
                }
            }
            for (int l = p + 1 - k; l < p + 1; l++) {
                M[l]--;
            }
            M[p]--;
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `System.out.print()` method to print the output. The `for` loops are used to iterate over the input array and perform the necessary operations.

Note that the Python code uses the `map()` function to convert the input string to a list of integers, while the Java code uses the `Scanner` class to read input from the user and convert it to an integer array.
