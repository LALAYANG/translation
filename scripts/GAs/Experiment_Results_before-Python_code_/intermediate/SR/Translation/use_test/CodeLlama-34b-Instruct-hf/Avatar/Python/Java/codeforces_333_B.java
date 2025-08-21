```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] b = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            b[i] = 1;
        }
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;
        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            b[r - 1] = b[n + c - 1] = 0;
        }
        if (n % 2 == 1 && b[n / 2] == 1 && b[n + n / 2] == 1) {
            b[n / 2] = 0;
        }
        System.out.println(sum(b));
    }

    public static int sum(int[] b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        return sum;
    }
}
```
Note: The `sum` method is a utility method that takes an array of integers as input and returns the sum of all the elements in the array.
