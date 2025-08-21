
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }
        int a = 1;
        int b = lis[n - 1];
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (checkCondition(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean checkCondition(int[] lis, int k, int mid) {
        for (int i = 0; i < lis.length; i++) {
            if (lis[i] % mid == 0) {
                k++;
            }
            k -= lis[i] / mid;
        }
        return k >= 0;
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `checkCondition()` method is the same as the Python function, and it is used to check if the given condition is satisfied for a given value of `mid`. The `main()` method is the entry point of the program, and it reads the input, calls the `checkCondition()` method, and prints the output.
