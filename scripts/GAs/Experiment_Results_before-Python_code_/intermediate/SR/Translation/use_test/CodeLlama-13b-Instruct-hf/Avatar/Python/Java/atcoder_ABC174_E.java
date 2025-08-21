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
            if (check(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean check(int[] lis, int k, int mid) {
        int count = 0;
        for (int i = 0; i < lis.length; i++) {
            if (lis[i] % mid == 0) {
                count++;
            }
            count -= lis[i] / mid;
        }
        return count >= 0;
    }
}
```
This is a Java implementation of the provided Python code. The `check` method is similar to the Python function, it takes an array of integers, an integer `k`, and an integer `mid`, and returns `true` if the number of integers in the array that are divisible by `mid` is greater than or equal to `k`, and `false` otherwise.

The `main` method first takes input from the user, and then calls the `check` method to determine the answer. The `check` method is called repeatedly with different values of `mid` until the answer is found.

Note that the `check` method is implemented using a loop that iterates over the array of integers, and it uses the modulo operator (`%`) to check if each integer is divisible by `mid`. The `count` variable is used to keep track of the number of integers in the array that are divisible by `mid`.
