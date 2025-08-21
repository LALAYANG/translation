```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i < n; i++) {
            ans += Math.abs(r[i] - r[i - 1]);
        }
        System.out.println(ans);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Math.abs()` method to calculate the absolute difference between adjacent elements in the input array. The `for` loop is used to iterate over the input array and calculate the sum of the absolute differences. Finally, the `System.out.println()` method is used to print the result to the console.
